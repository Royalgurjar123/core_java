package ShapeOverloading;

public class Shape {
	public static final char[] PI = null;
	private String colour;
	private  int borderwidth;
	
	public  Shape() {
	}
    public Shape (String colour,int borderwidth) {
    	this.colour= colour;
    	this.borderwidth=borderwidth;
    	
    }
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getBorderwidth() {
		return borderwidth;
	}
	public void setBorderwidth(int borderwidth) {
		this.borderwidth = borderwidth;

}
	public double area() {
		return 0;
		
	}	
}
