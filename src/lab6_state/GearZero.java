package lab6_state;

public class GearZero implements GearState{

    @Override
    public int getGearValue() {
        return 0;
    }

    @Override
    public void changeSpeed(Car car, int speed) {
        if(speed > 0) {
            car.setCurrentGearState(new GearOne());
        }
    }
}
