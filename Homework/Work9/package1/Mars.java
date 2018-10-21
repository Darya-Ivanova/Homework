package package1;

public class Mars extends Planet {
	String[] namesOfSatellies = { "Deimos", "Phobos" };
	private boolean hasPeople = false;
	
	public void printNamesOfSatellies () {
		System.out.print("Names of satellies: ");
		for (int i = 0; i < namesOfSatellies.length; i++) {
			System.out.print(namesOfSatellies[i] + " ");
		}
	}
	
	public void printHasPeople() {
		System.out.println("Mars has people = " + hasPeople);
	}
	
	@Override
	public void printClassName() {
		System.out.println("Hey. We are in the Mars class.");
	}
	
	@Override
	public void printImplementationOfAnAbstractMethod() {
		System.out.println("Now I have implemented an abstract method in the Mars class.");
	}
	
}
