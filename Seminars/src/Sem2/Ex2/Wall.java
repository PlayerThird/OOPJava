package Sem2.Ex2;

public class Wall implements Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public int getLenght() {
        return 0;
    }

    @Override
    public int getHeight() {
        return height;
    }
}
