package Proxy;

public class ProxyDemo {

    public static void main(String[] args) {
        License license = new PLicense("This is my driver license");

        for(int i = 0; i < 10; i++) {
            license.show();
            System.out.println();
        }
    }
}
