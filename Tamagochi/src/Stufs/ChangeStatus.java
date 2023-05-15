package Stufs;

public interface ChangeStatus {
    boolean changeSolarBattery();
    boolean changeAutoDispEat();
    boolean changeAutoDispWhat();
    boolean changeAlarm();
    boolean changeInsurance();
    boolean changeToys();
    int changeEatStuf(int collums);
    int changeWhaterStuf(int collums);
    int changeMedikStuf(int collums);
    int changeYummyStuf(int collums);
    int changeBatteryStuf(int collums);
}
