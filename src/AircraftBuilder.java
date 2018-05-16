abstract class AircraftBuilder {

    protected Aircraft ac;

    public Aircraft getAircraft() {
        return ac;
    }

    public void createNewAircraft() {
        ac = new Aircraft();
    }

    public abstract void buildEngine();
    public abstract void buildSeat();
    public abstract void buildControl();
}
