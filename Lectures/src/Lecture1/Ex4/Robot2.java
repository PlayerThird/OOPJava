package Lecture1.Ex4;

public class Robot2 {
    /**
     * Уровень робота
     */
    private int level;
    /**
     * Имя робота
     */
    private String name;

    /**
     * Создание робота 2
     *
     * @param name  Имя робота. Не должно начинатся с цифры
     * @param level Уровень робота
     */
    public Robot2(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String toString() {
        return getInfo();
    }

    public String getInfo() {
        return String.format("name :%s lvl :%d", name, level);
    }

    public int getLevel() {
        return this.level;
    }

    public String getName() {
        return this.name;
    }

    public void powerOn() {
        this.startBIOS();
        this.startOS();
        this.sayHi();
    }

    public void powerOff() {
        this.sayBye();
        this.stopOS();
        this.stopBIOS();
    }

    private void startBIOS() {
        System.out.println("Start Bios...");
    }

    private void startOS() {
        System.out.println("Start OS...");
    }

    private void sayHi() {
        System.out.println("Hello, bandit");
    }

    public void work() {
        System.out.println("Some work");
    }

    private void sayBye() {
        System.out.println("Goodbye");
    }

    private void stopOS() {
        System.out.println("Stopping OS...");
    }

    private void stopBIOS() {
        System.out.println("Stopping BIOS../");
    }
}
