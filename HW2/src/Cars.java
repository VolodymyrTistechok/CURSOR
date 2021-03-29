public class Cars {
    private boolean engine = false;
    private int speed = 0;
    private int gear = 0;
    private int maxSpeed = 0;

    public Cars(int maxSpeed) {
        if (maxSpeed < 300 && maxSpeed > 100) {
            this.maxSpeed = maxSpeed;
        } else {
            System.out.println("enter a value between 100 and 300");
        }
    }

    public void startTheEngine() {
        engine = true;
        System.out.println("engine started");
    }


    public void stopTheEngine() {
        engine = false;
        System.out.println("engine stopped");
    }

    public void setSpeed(int speed) {
        if (speed <= maxSpeed && speed > 0) {
            if (engine) {
                this.speed = speed;
                this.gear = Math.round(speed / (maxSpeed / 5));
            } else {
                System.out.println("engine stopped, please start the engine");
            }
        } else {
            System.out.println("it is not real");
        }
    }

    public void setGear(int gear) {
        if (gear > 0 && gear < 6) {
            if (engine) {
                this.gear = gear;
                speed = (maxSpeed / 5) * gear;
            } else {
                System.out.println("engine stopped, please start the engine");
            }
        } else {
            System.out.println("enter a value between 1 and 5");
        }
    }

    @Override
    public String toString() {
        return "Cars{" +
                "engine=" + engine +
                ", speed=" + speed +
                ", gear=" + gear +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}