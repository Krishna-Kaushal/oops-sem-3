class car {
	// fields
	public int year;
	public String make;
	public int speed;
	
	// constructor
	public car (int year, String make) {
		this.year = year;
		this.make = make;
		this.speed = 0;
	}
	// accessors
	public int getYear() {return year;}
	public String getMake() {return make;}
	public int getSpeed() {return speed;}
	
	// methods
	public void accelerate() {speed += 5;}
	public void brake() {speed -= 5;}
}

public class q2 {
	public static void main(String args[]) {
		car c1 = new car(2024, "RangeRover");
		
		System.out.println("Accelerating");
		for (int i = 0; i < 5; i++ ) {
			c1.accelerate();
			System.out.println(c1.speed);
		}
		
		System.out.println("Braking");
		for (int i = 0; i < 5; i++ ) {
			c1.brake();
			System.out.println(c1.speed);
		}
	}
}