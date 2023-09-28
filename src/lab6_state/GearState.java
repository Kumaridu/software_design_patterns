package lab6_state;

public interface GearState {

    int getGearValue();
    void changeSpeed(Car car, int speed);
}
