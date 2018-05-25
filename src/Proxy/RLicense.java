package Proxy;

public class RLicense implements License{

    private String rLic;

    public RLicense(String rLicName){
        this.rLic = rLicName;
        load(rLicName);
    }

    public void show() {

        System.out.println("Showing " + rLic);
    }

    private void load(String rLicName){
        System.out.println("Loading " + rLicName);
    }
}
