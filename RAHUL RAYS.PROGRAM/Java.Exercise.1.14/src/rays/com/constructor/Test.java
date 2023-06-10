package rays.com.constructor;

public class Test {
	public static void main(String[] args) {
		
		Rectangle r= new Rectangle(13, 15);
		Circles c = new Circles(6);
		Triangle t = new Triangle(14, 17);
	
		// Rectangle
		System.out.println("Area of Rectangle = "+r.area());
		
		// Circle
		System.out.println("Area of Circle = "+c.area());
		
		// Triangle
		System.out.println("Area of Triangle = "+t.area());
	}

}
