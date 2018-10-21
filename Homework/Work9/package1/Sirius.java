package package1;

public class Sirius extends Star {
	private int surfaceTemperature = 9940;
	private String constellation = "Canis Major";
	
	public void printSurfaceTemperature() {
		System.out.println("Surface temperature = " + surfaceTemperature);
	}
	
	public void printContellation() {
		System.out.println("Constellation name: " + constellation);
	}
	
	@Override
	public void printClassName() {
		System.out.println("Hey. We are in the Sirius class.");
	}
	
	@Override
	public void printImplementationOfAnAbstractMethod() {
		System.out.println("Now I have implemented an abstract method in the Sirius class.");
	}
}
