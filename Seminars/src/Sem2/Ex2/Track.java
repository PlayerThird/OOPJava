package Sem2.Ex2;

public class Track implements Obstacle {
    private int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public int getLenght() {
        return length;
    }

    @Override
    public int getHeight() {
        return 0;
    }
}
