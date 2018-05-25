package Decorator;

public class CarDecorator implements Car{

    protected Car decoratedCar;

    public CarDecorator(Car decoratedCar){
        this.decoratedCar = decoratedCar;
    }

    public void createCar(){
        decoratedCar.createCar();
    }
}
