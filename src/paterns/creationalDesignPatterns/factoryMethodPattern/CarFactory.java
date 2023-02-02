package paterns.creationalDesignPatterns.factoryMethodPattern;




public class CarFactory {
    public static Car createCar(String carType) {
        if (carType.equals("sports")) {
            return new SportsCar();
        } else if (carType.equals("sedan")) {
            return new Sedan();
        }
        return null;
    }
}

