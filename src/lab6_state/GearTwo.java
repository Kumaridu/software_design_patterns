package lab6_state;

public class GearTwo implements GearState {

    @Override
    public int getGearValue() {
        return 2;
    }

//    if (speed > 10 && speed < 20) {
    @Override
    public void changeSpeed(Car car, int speed) {
        if(speed >= 20) {
            car.setCurrentGearState(new GearThree());
        } else if(speed <= 10) {
            car.setCurrentGearState(new GearOne());
        }
    }
}
