package Lecture1.Ex4;

import java.util.ArrayList;

public class Robot3 {
    enum State{//добавляем 2 состояния для State
        On, Off
    }
    private static int defaultIndex;
    private static ArrayList<String> names;//коллекция имён, для того, чтобы нельзя было использовать одно и то же имя

    static {
        defaultIndex =1;
        names = new ArrayList<String>();
    }
    public String toString() {
        return getInfo();
    }

    public String getInfo() {
        return String.format("name :%s lvl :%d", name, level);
    }

    /**
     * Уровень робота
     */
    private int level;
    /**
     * Имя робота
     */
    private String name;
    /**
     * Состояние робота
     */
    public State state;

    /**
     * Создание робота 3
     *
     * @param name  Имя робота. Не должно начинатся с цифры
     * @param level Уровень робота
     */
    private Robot3(String name, int level) {//скрываем, чтобы не меняли уровень
        if((name.isEmpty())
        || Character.isDigit(name.charAt(0))
        || Robot3.names.indexOf(name) != -1){//если в коллекции такое имя содержится
            this.name = String.format("DefaultName_%d", defaultIndex ++);
        }else this.name = name;
        Robot3.names.add(this.name);
        this.level = level;
        this.state = State.Off;
    }
    public Robot3(String name){
        this(name,1);// вызываем конструктор с 2 параметрами
    }
    public Robot3(){
        this("");//вызываем конструктор с одним параметром
    }

    public void power(){//проверяем, в каком состоянии робот (вкл/выкл)
        if (this.state == State.Off){
            this.powerOn();
            this.state = State.On;
        }else {
            this.powerOff();
            this.state= State.Off;
        }
        System.out.println();
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
        if (state == State.On) System.out.println("Some work");
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
