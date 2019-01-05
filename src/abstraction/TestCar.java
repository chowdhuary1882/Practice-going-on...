package abstraction;

public class TestCar {

    public static void main(String[] args) {
        Car car = new Nissan();
        car.start();
        car.stop();

        Nissan camry = new Nissan();
        camry.motorCar();
        camry.start();

        GasolineCar hybridCar = new Nissan();
        hybridCar.fourWheelCar();

        Tesla fiveSeries = new Tesla();
        fiveSeries.start();
        fiveSeries.stop();
    }

}
