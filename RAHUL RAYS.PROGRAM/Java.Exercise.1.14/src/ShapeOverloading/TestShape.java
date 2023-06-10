package ShapeOverloading;

public class TestShape {
public static void main(String[] args) {
	
	Shape S = new Shape();
	S.area();
	Rectangle r = new Rectangle(10, 10);
	r.area();
	Shape st = new Triangle(3, 4);
	st.area();
	Shape sc = new Circle(4);
	sc.area();
	
	
	System.out.println(Shape.PI);
	
}

}
