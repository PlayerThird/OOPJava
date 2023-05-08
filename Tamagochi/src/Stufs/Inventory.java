package Stufs;

public class Inventory extends ChangeStatus{
    private boolean solarBattery = false;
    private boolean autoDispEat = false;
    private boolean autoDispWhat = false;
    private boolean alarm = false;
    private boolean insurance = false;
    private boolean toys = false;

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

    public void setAutoDispEat(boolean autoDispEat) {
        this.autoDispEat = autoDispEat;
    }

    public void setAutoDispWhat(boolean autoDispWhat) {
        this.autoDispWhat = autoDispWhat;
    }

    public void setAlarm(boolean alarm) {
        this.alarm = alarm;
    }

    public void setInsurance(boolean insurance) {
        this.insurance = insurance;
    }

    public void setToys(boolean toys) {
        this.toys = toys;
    }

    @Override
    public boolean solarBattery(boolean change) {
        return false;
    }
}
