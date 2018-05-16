class Manufacturer {

    private AircraftBuilder aircraftBuilder;

    public void setAircraftBuilder(AircraftBuilder acb) {
        aircraftBuilder = acb;
    }

    public Aircraft getAircraft() {
        return aircraftBuilder.getAircraft();
    }

    public void constructAircraft() {
        aircraftBuilder.createNewAircraft();
        aircraftBuilder.buildEngine();
        aircraftBuilder.buildSeat();
        aircraftBuilder.buildControl();
    }

}
