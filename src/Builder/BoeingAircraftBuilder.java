package Builder;

class BoeingAircraftBuilder extends AircraftBuilder{

    public void buildEngine() {
        ac.setEngine("GE 90");
    }

    public void buildSeat() {
        ac.setSeat("3 x 3 x 3");
    }

    public void buildControl() {
        ac.setControl("yoke");
    }

}
