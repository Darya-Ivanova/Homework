package package2;

import package1.Tester;

public class Taster1Main {
	public static void main (String [] args) {
		Tester tester = new Tester("Darya", "Ivanova", 1, "B1", 1000);
		
//		System.out.println(tester.salaryMultipliedByTwo());
		//field "salary" is "private". Can be accessed only inside the class Tester.
		
//		System.out.println(tester.amountOfExperienceInTheMonth());
		//field "expirienceInYears" is "protected". Can be accessed only inside the package and subclasses.
		
//		tester.printNameAndSurname();
		//method "printNameAndSurname" is "default". Can be accessed only inside the package.
		
		tester.printAllUserInformation();
	}
}
