package lab6_state;

public class GearOne implements GearState {

    @Override
    public int getGearValue() {
        return 1;
    }

    @Override
    public void changeSpeed(Car car, int speed) {
        if(speed >= 10) {
            car.setCurrentGearState(new GearTwo());
        } else if(speed < 1) {
            car.setCurrentGearState(new GearZero());
        }
    }
}
