package Decorator;

public class DecoratorExec {

    public static void main(String[] args) {

        Car enzo = new Ferrari();
        Car blackEnzo = new ColorCarDecorator(new Ferrari());
        Car blackSMG = new ColorCarDecorator(new Mercedes());

        System.out.println("Ferrari with no paint");
        enzo.createCar();

        System.out.println("\nThis is a black enzo");
        blackEnzo.createCar();

        System.out.println("This is a black Mercedes SMG");
        blackSMG.createCar();
    }

}
