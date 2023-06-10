package rays.com.constructor;

public class Circles extends Shape{
	private int radius ;
	public static final double  PI = 3.14;
	
	public Circles(int radius) {
		this.radius=radius;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double area() {
		double z= PI*radius*radius;
		return z;
	}

}
