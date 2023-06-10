package Exceptionhandling;

public class MistakeExpection extends Exception  {
	public MistakeExpection() {
		super("i made mistake in progarm");
	}
	public MistakeExpection( String msg) {
		super(msg);
	}

}
