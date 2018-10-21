package package1;

public class Sun extends Star {
	private int radius = 695508;
	private int distanceToEarth = 149600000;
	
	public void printRadius() {
		System.out.println("Radius of Sun = " + radius + " km");
	}
	
	public void printDistanceToEarth() {
		System.out.println("Distance to Earth = " + distanceToEarth + " km");
	}
	
	@Override
	public void printClassName() {
		System.out.println("Hey. We are in the Sun class.");
	}
	
	@Override
	public void printImplementationOfAnAbstractMethod() {
		System.out.println("Now I have implemented an abstract method in the Sun class.");
	}
}
