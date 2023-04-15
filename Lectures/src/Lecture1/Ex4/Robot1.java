package Lecture1.Ex4;

public class Robot1 {
    String name;
    int level;

    public Robot1(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String toString() {
        return getInfo();
    }

    public String getInfo() {
        return String.format("name :%s lvl :%d", name, level);
    }

    public void startBIOS() {
        System.out.println("Start Bios...");
    }

    public void startOS() {
        System.out.println("Start OS...");
    }

    public void sayHi() {
        System.out.println("Hello, bandit");
    }

    public void work() {
        System.out.println("Some work");
    }

    public void sayBye() {
        System.out.println("Goodbye");
    }

    public void stopOS() {
        System.out.println("Stopping OS...");
    }

    public void stopBIOS() {
        System.out.println("Stopping BIOS../");
    }
}
