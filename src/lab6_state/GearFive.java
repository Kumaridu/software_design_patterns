package lab6_state;

public class GearFive implements GearState {

    @Override
    public int getGearValue() {
        return 5;
    }

    @Override
    public void changeSpeed(Car car, int speed) {
        if(speed < 60) {
            car.setCurrentGearState(new GearFour());
        }
    }
}
