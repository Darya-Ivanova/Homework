package package1;

public class TaskMain {

	public static void main(String[] args) {
		
		Planet planet = new Planet();
		planet.printName();
		planet.printNumbersOfSatellies();
		planet.getName();
		planet.setName("Planet");
		planet.getNumbersOfSatellites();
		planet.setNumbersOfSatellites(1000000000);
		planet.printClassName();
		planet.printImplementationOfAnAbstractMethod();
		
		System.out.println();
		
		Earth earth = new Earth();
		earth.printNumberOfContinents();
		earth.printSatelliteName();
		earth.printClassName();
		earth.printImplementationOfAnAbstractMethod();
		
		System.out.println();
		
		Mars mars = new Mars();
		mars.printNamesOfSatellies();
		System.out.println();
		mars.printHasPeople();
		mars.printClassName();
		mars.printImplementationOfAnAbstractMethod();
		
		System.out.println();
		
		Star star = new Star();
		star.printNameOfstar();
		star.printTypesOfStars();
		star.printClassName();
		star.printImplementationOfAnAbstractMethod();
		
		System.out.println();
		
		Sun sun = new Sun();
		sun.printRadius();
		sun.printDistanceToEarth();
		sun.printClassName();
		sun.printImplementationOfAnAbstractMethod();
		
		System.out.println();
		
		Sirius sirius = new Sirius();
		sirius.printSurfaceTemperature();
		sirius.printContellation();
		sirius.printClassName();
		sirius.printImplementationOfAnAbstractMethod();
	}
}
