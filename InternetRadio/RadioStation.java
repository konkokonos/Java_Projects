package InternetRadio;
import java.lang.Math;
import java.util.*;

public class RadioStation {
    private Song[] songs;
    public RadioStation() {
    }
    public RadioStation(Song[] songs) {
        this.songs = songs;
    }
    public Song[] getSongs() {
        return songs;
    }
    public void setSongs(Song[] songs) {
        this.songs = songs;
    }

    public Song is_in_songs(String songTitle,Song[] songs){
        for (Song song : songs) {
            if (song.getTitle().equals(songTitle)) {
                return song;
            }
        }
        return null;
    }
    public Song[] getSimilar(String songTitle) {
        Song[] songs = getSongs();
        Song one_song = is_in_songs(songTitle, songs);
        if(one_song == null){
            System.out.print("There is no such song title!");
            return null;
        }
        else {
            ArrayList<Song> final_songs = new ArrayList<Song>(Arrays.asList(songs));
            for (int i=0; i< final_songs.size(); i++) {
                if(final_songs.get(i).getTitle().equals(songTitle))
                    final_songs.remove(i);
            }
            Collections.sort(final_songs, new Comparator<Song>() {
                @Override
                public int compare(Song song_1, Song song_2) {
                    double dist_1 = distance(song_1,one_song);
                    double dist_2 = distance(song_2,one_song);
                    return Double.compare(dist_1,dist_2);
                }
            });
            final_songs.add(0,one_song);
            Song[] sorted_songs = new Song[final_songs.size()];
            sorted_songs = final_songs.toArray(sorted_songs);
            return sorted_songs;
        }

    }
    protected double distance(Song s1, Song s2) {
        double[] weights_1 = s1.getWeights();
        double[] weights_2 = s2.getWeights();
        double distance = 0;
        for (int i = 0; i < weights_1.length; i++) {
            distance += Math.pow((weights_1[i] - weights_2[i]), 2);
        }
        return Math.sqrt(distance);
    }
}