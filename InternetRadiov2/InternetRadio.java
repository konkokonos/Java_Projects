package InternetRadiov2;

import java.util.Scanner;

public class InternetRadio {

    public static int n;
    public static void main(String[] args) {

        Song[] sorted_songs = {};
        Song[] songs = new Song[13];
        songs[0] = new Song("Wonderwall","Oasis",new double[]{90,10,0,0,0,0});
        songs[1] = new Song("Don't look back in anger","Oasis",new double[]{90,0,10,0,0,0});
        songs[2] = new Song("Money","Pink Floyd",new double[]{50,20,10,0,20,0});
        songs[3] = new Song("Catholic Girls","Frank Zappa",new double[]{30,10,30,30,0,0});
        songs[4] = new Song("Stairway to heaven","Led Zeppelin",new double[]{80,0,20,0,0,0});
        songs[5] = new Song("Perfect strangers","Deep Purple",new double[]{100,0,0,0,0,0});
        songs[6] = new Song("Purple rain","Prince",new double[]{0,0,100,0,0,0});
        songs[7] = new Song("Back in back","AC DC",new double[]{100,0,0,0,0,0});
        songs[8] = new Song("The thrill is gone","BB King",new double[]{0,0,100,0,0,0});
        songs[9] = new Song("I'd rather go blind","Etta Jarnes",new double[]{0,0,60,40,0,0});
        songs[10] = new Song("With or without you","u2",new double[]{40,20,40,0,0,0});
        songs[11] = new Song("Heroes","David Bowie",new double[]{40,10,30,10,10,0});
        songs[12] = new Song("Free Bird","Lynyrd Skynyrd",new double[]{90,0,10,0,0,0});

        Scanner scanner = new Scanner(System.in);
        System.out.print("What distance do you want to use? Options are Euclidian or Manhattan: ");
        String distance = scanner.nextLine();
        RadioStation radiostation = new RadioStation();
        if ("Euclidian".equals(distance)) {
            n = 1;
            sorted_songs = radiostation.getSimilar(songs,"Heroes");
        } else if ("Manhattan".equals(distance)) {
            n = 2;
            sorted_songs = radiostation.getSimilar(songs,"Heroes");
        }
        System.out.println("Radio station songs for you:");
        print_songs(sorted_songs);
    }
    public static void print_songs(Song[] given_songs){
        for(Song song : given_songs)
            System.out.println(song.getTitle());
    }
}
