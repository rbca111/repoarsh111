package Program;

public class MainRBCA22111 {
	    public static void main(String[] args) {
	        // Creating an object of the Car class
	    	CarRBCA22111 car = new CarRBCA22111 (50, "Toyota");

	        // Calling the drive method
	        car.drive();

	        // Getting the horsepower and make of the car
	        int carHorsepower = car.getHorsepower();
	        String carMake = car.getMake();

	        // Outputting the car's horsepower and make
	        System.out.println("Car's horsepower: " + carHorsepower);
	        System.out.println("Car's make: " + carMake);
	    }
	}
