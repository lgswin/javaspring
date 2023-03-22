package StaticVariables;

public class CarFactory {
    private static CarFactory instance = new CarFactory();
    private int CarNum = 10001;

    public CarFactory() {

    }

    public static CarFactory getInstance() {
        if (instance == null)
            instance = new CarFactory();

        return instance;
    }

    public Car createCar() {
        Car newcar = new Car();
        newcar.carNum = CarNum++;
        return newcar;
    }

}
