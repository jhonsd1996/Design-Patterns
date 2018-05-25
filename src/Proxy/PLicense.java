package Proxy;

public class PLicense implements License{

    private RLicense realLic;
    private String licName;

    public PLicense(String licName){
        this.licName = licName;
    }

    public void show() {
        if(realLic == null){
            realLic = new RLicense(licName);
        }
        realLic.show();
    }


}
