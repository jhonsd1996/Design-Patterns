package Decorator;

public class ColorCarDecorator extends CarDecorator{

    public ColorCarDecorator(Car decoratedCar) {
        super(decoratedCar);
    }

    public void createCar() {
        decoratedCar.createCar();
        setBlackBorder(decoratedCar);
    }
    private void setBlackBorder(Car decoratedCar) {
        System.out.println("Car paint: Black\n");
    }
}
