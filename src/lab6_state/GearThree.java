package lab6_state;

public class GearThree implements GearState {

    @Override
    public int getGearValue() {
        return 3;
    }

//     (speed > 20 && speed < 40)
    @Override
    public void changeSpeed(Car car, int speed) {
        if(speed >= 40) {
            car.setCurrentGearState(new GearFour());
        } else if(speed <= 20) {
            car.setCurrentGearState(new GearTwo());
        }
    }
}
