package InternetRadio;

public class Song {
    private String title; // ο τίτλος του τραγουδιού
    private String artist; // ο καλλιτέχνης του τραγουδιού
    // οι πιθανές μουσικές κατηγορίες των τραγουδιών
    public static final String[] GENRES = {"rock", "pop","blues", "soul","disco", "hip-hop"};
    // η βαρύτητα των αντίστοιχων ειδών στο κάθε τραγούδι
    // μπορεί να είναι μηδέν-το άθροισμα όλων των βαρών
    // είναι 100
    private double[] weights;
    // default κατασκευαστής
    public Song() {
    }
    // κατασκευαστής πεδίων
    public Song(String title, String artist, double[] weights) {
        this.title = title;
        this.artist = artist;
        this.weights = weights;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public double[] getWeights() {
        return weights;
    }
    public void setWeights(double[] weights) {
        this.weights = weights;
    }
}
