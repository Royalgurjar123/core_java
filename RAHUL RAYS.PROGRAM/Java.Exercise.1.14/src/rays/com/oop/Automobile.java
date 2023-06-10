package rays.com.oop;

public class Automobile {
	private String colour;
	private int speed;
	public String  make;
	public static int no_of_gears;
	
	
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public void Break(double s) {
	if ( speed >=s) {
		System.out.println("Break--->"+(speed-10));	
	}
	}
	public void Accelaration(double r) {
		if ( speed<=r) {
			System.out.println("Accelaration--->"+(speed +30));
		}
	}
	

	}
	

	

	


