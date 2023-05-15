package Stufs;

public class Inventory implements ChangeStatus {
    private boolean solarBattery = false;
    private boolean autoDispEat = false;
    private boolean autoDispWhat = false;
    private boolean alarm = false;
    private boolean insurance = false;
    private boolean toys = false;

    private int eatStuf;
    private int whaterStuf;
    private int medikStuf;
    private int yummy;
    private int battery;

    private int coins = 100;


    public boolean isSolarBattery() {
        return solarBattery;
    }

    public boolean isAutoDispEat() {
        return autoDispEat;
    }

    public boolean isAutoDispWhat() {
        return autoDispWhat;
    }

    public boolean isAlarm() {
        return alarm;
    }

    public boolean isInsurance() {
        return insurance;
    }

    public boolean isToys() {
        return toys;
    }

    public void setSolarBattery(boolean solarBattery) {
        this.solarBattery = solarBattery;
    }

    /**
     * Возврат еды(расходники)
     * @return сколько еды в инвентаре
     */
    public int isEatStuf() {
        return this.eatStuf;
    }

    public int isWhaterStuf() {
        return this.whaterStuf;
    }

    public int isMedikStuf() {
        return this.medikStuf;
    }

    public int isBattery() {
        return this.battery;
    }

    public int isYummy() {
        return this.yummy;
    }


    @Override
    public boolean changeSolarBattery() {
        return this.solarBattery = true;
    }

    @Override
    public boolean changeAutoDispEat() {
        return this.autoDispEat = true;
    }

    @Override
    public boolean changeAutoDispWhat() {
        return this.autoDispWhat = true;
    }

    @Override
    public boolean changeAlarm() {
        return this.alarm = true;
    }

    @Override
    public boolean changeInsurance() {
        return this.insurance = true;
    }

    @Override
    public boolean changeToys() {
        return this.toys = true;
    }

    @Override
    public int changeEatStuf(int collums) {
        return this.eatStuf += collums;
    }

    @Override
    public int changeWhaterStuf(int collums) {
        return this.whaterStuf += collums;
    }

    @Override
    public int changeMedikStuf(int collums) {
        return this.medikStuf += collums;
    }

    @Override
    public int changeYummyStuf(int collums) {
        return this.yummy += collums;
    }

    @Override
    public int changeBatteryStuf(int collums) {
        return this.battery += collums;
    }

    public int getCoins() {
        return coins;
    }

    public void plusDayCoin() {
        this.coins += 10;
    }
    public void minusCoin(int collum){
        this.coins -= collum;
    }


}
