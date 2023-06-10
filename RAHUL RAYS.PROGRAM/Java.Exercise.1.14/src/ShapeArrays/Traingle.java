package ShapeArrays;

public class Traingle extends Shape {
	public int base ;
	public int height;
	public Traingle (int base, int height) {
		this.base= base;
		this.height=height;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
		
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double area() {
		double a = 0.5*base*height;
		System.out.println("Triangle = "+a);
		return 0.5*base*height;
		
	}
}
