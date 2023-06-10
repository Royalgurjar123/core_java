package ShapeArrays;

public class TestShape {
	public static void main(String[] args) {
		
		Shape [] S = new Shape[3];
		S[0] = new Rectangle (10, 5);
		S[1] = new Circle(4);
		S[2] = new Traingle(10, 10);
		double totalArea=0;
		for (int i = 0; i < S.length; i++) {
			totalArea = totalArea +S[i].area();
			
			
		}
		System.out.println("totalArea="+totalArea);
	}

}
