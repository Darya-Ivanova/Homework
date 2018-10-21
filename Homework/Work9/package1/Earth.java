package package1;

public class Earth extends Planet {
	private int numberOfContinents = 6;
	private String satelliteName = "Moon";
	
	public void printNumberOfContinents() {
		System.out.println("Number of continents = " + numberOfContinents);
	}
	
	public void printSatelliteName() {
		System.out.println("Satellite name = " + satelliteName);
	}
	
	public Earth() {
	}
	
	public Earth(int numberOfContinents) {
		this.numberOfContinents = numberOfContinents;
	}
	
	public Earth (int numberOfContinents, String satelliteName) {
		this(numberOfContinents);
		this.satelliteName = satelliteName;
	}
	
	@Override
	public void printClassName() {
		System.out.println("Hey. We are in the Earth class.");
	}
	
	@Override
	public void printImplementationOfAnAbstractMethod() {
		System.out.println("Now I have implemented an abstract method in the Earth class.");
	}
}
