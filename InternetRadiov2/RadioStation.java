package InternetRadiov2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class RadioStation {

    public Song is_in_songs(String songTitle, Song[] songs){
        for (Song song : songs) {
            if (song.getTitle().equals(songTitle)) {
                return song;
            }
        }
        return null;
    }
    public Song[] getSimilar(Song[] songs,String songTitle) {
        Song one_song = is_in_songs(songTitle, songs);
        if(one_song == null){
            System.out.print("There is no such song title!");
            return null;
        }
        else {
            ArrayList<Song> final_songs = new ArrayList<>(Arrays.asList(songs));
            for (int i=0; i< final_songs.size(); i++) {
                if(final_songs.get(i).getTitle().equals(songTitle))
                    final_songs.remove(i);
            }
            if (InternetRadio.n == 1) {
                final_songs.sort(new Comparator<Song>() {
                    @Override
                    public int compare(Song song_1, Song song_2) {
                        double dist_1 = euclidian_distance(song_1, one_song);
                        double dist_2 = euclidian_distance(song_2, one_song);
                        return Double.compare(dist_1, dist_2);
                    }
                });
            }
            else if(InternetRadio.n == 2){
                final_songs.sort(new Comparator<Song>() {
                    @Override
                    public int compare(Song song_1, Song song_2) {
                        double dist_1 = manhattan_distance(song_1, one_song);
                        double dist_2 = manhattan_distance(song_2, one_song);
                        return Double.compare(dist_1, dist_2);
                    }
                });
            }
            final_songs.add(0,one_song);
            Song[] sorted_songs = new Song[final_songs.size()];
            sorted_songs = final_songs.toArray(sorted_songs);
            return sorted_songs;
        }
    }
    protected double euclidian_distance(Song s1, Song s2) {
        double[] weights_1 = s1.getWeights();
        double[] weights_2 = s2.getWeights();
        double distance = 0;
        for (int i = 0; i < weights_1.length; i++) {
            distance += Math.pow((weights_1[i] - weights_2[i]), 2);
        }
        return Math.sqrt(distance);
    }
    protected double manhattan_distance(Song s1, Song s2){
        double[] weights_1 = s1.getWeights();
        double[] weights_2 = s2.getWeights();
        double distance = 0;
        for (int i = 0; i < weights_1.length; i++) {
            distance += Math.abs(weights_1[i] - weights_2[i]);
        }
        return Math.sqrt(distance);
    }
}