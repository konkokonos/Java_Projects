package InternetRadio;

public class ManhattanRadioStation extends RadioStation{

    public ManhattanRadioStation() {
        super();
    }
    public ManhattanRadioStation(Song[] songs) {
        super(songs);
    }

    @Override
    protected double distance(Song s1, Song s2){
        double[] weights_1 = s1.getWeights();
        double[] weights_2 = s2.getWeights();
        double distance = 0;
        for (int i = 0; i < weights_1.length; i++) {
            distance += Math.abs(weights_1[i] - weights_2[i]);
        }
        return Math.sqrt(distance);
    }
}
