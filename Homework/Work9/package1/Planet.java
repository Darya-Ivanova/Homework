package package1;

public class Planet extends Star_system {
	private String name;
	private int numbersOfSatellites;
	
	public void printName() {
		System.out.println(name);
	}
	
	public void printNumbersOfSatellies() {
		System.out.println(numbersOfSatellites);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNumbersOfSatellites() {
		return numbersOfSatellites;
	}
	
	public void setNumbersOfSatellites(int numbersOfSatellites) {
		this.numbersOfSatellites = numbersOfSatellites;
	}
	
	@Override
	public void printClassName() {
		System.out.println("Hey. We are in the Planet class.");
	}
	
	@Override
	public void printImplementationOfAnAbstractMethod() {
		System.out.println("Now I have implemented an abstract method in the Planet class.");
	}
}
