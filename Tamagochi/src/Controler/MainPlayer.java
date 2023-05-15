package Controler;

import Moduls.Player;

public class MainPlayer {
    public static Player player;

    public static void setPlayer(Player player) {
        MainPlayer.player = player;
    }
    public int getEat(){
        return player.getAnimal().getEat();
    }
    public int getWater(){
        return player.getAnimal().getWhater();
    }
    public int getHappy(){
        return player.getAnimal().getHappy();
    }
    public int getEnergy(){
        return player.getAnimal().getEnergy();
    }
    public int getHealth(){
        return player.getAnimal().getHealth();
    }

}
