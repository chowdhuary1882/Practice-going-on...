package abstraction;

public abstract class GasolineCar implements Car, FlyingCar {

    //Car
    public void start() {
        System.out.println("start the car to drive");
    }
    public void stop() {
        System.out.println("put on break to stop the car");
    }
    public void oilMotorEngine() {
        System.out.println("Runs on Oil");
    }

    public abstract void fourWheelCar();
}
