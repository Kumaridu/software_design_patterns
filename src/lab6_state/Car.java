package lab6_state;

public class Car {

	private GearState currentGearState;

	public Car() {
		currentGearState = new GearZero();
	}

	public void setCurrentGearState(GearState gearState) {
		this.currentGearState = gearState;
	}

	public GearState getCurrentGearState() {
		return this.currentGearState;
	}


    public int changeSpeed(int speed) {
		getCurrentGearState().changeSpeed(this, speed);
		return getCurrentGearState().getGearValue();
//	    if (speed == 0) {
//	        return 0;
//	    } else {
//	        if (speed > 0 && speed < 10) {
//	            return 1;
//	        } else {
//	            if (speed > 10 && speed < 20) {
//	                return 2;
//	            } else {
//	                if (speed > 20 && speed < 40) {
//	                    return 3;
//	                } else {
//	                    if (speed > 40 && speed < 60) {
//	                        return 4;
//	                    } else {
//	                        if (speed > 55 ) {
//	                            return 5;
//	                        }
//	                    }
//	                }
//	            }
//	        }
//	    }
//	    return 0;
    }
}
    
