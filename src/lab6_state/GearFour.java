package lab6_state;

public class GearFour implements GearState {


    @Override
    public int getGearValue() {
        return 4;
    }

//      if (speed > 40 && speed < 60) {
    @Override
    public void changeSpeed(Car car, int speed) {
        if(speed >= 60) {
            car.setCurrentGearState(new GearFive());
        } else if(speed <= 40) {
            car.setCurrentGearState(new GearThree());
        }
    }
}
