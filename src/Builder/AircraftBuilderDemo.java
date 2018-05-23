package Builder;

public class AircraftBuilderDemo {

    public static void main(String[] args) {
        Manufacturer manufacturer = new Manufacturer();
        AircraftBuilder airbusBuilder = new AirbusAircraftBuilder();
        AircraftBuilder boeingBuilder = new BoeingAircraftBuilder();

        manufacturer.setAircraftBuilder( boeingBuilder );
        manufacturer.constructAircraft();

        Aircraft aircraft = manufacturer.getAircraft();

        System.out.println(aircraft.getEngine());
    }

}
