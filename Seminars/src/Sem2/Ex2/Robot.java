package Sem2.Ex2;

public class Robot implements Runner {
    private String name;
    private int maxRun;
    private int maxJump;

    public Robot(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }


    @Override
    public int getMaxRun() {
        return maxRun;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getMaxJump() {
        return maxJump;
    }
}
