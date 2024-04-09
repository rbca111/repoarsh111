package Program;
public class CarRBCA22111 extends VehicleRBCA22111 {
	    private String make;

	    public CarRBCA22111 (int horsepower, String make) {
	        super(horsepower);
	        this.make = make;
	    }

	    public void drive() {
	        super.drive();
	        System.out.println("Car is being driven");
	    }

	    public String getMake() {
	        return make;
	    }
	}
