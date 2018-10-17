package package1;

public class TesterMain {
	public static void main (String [] args) {
		Tester tester = new Tester("Darya", "Ivanova", 1, "B1", 1000);
		
//		System.out.println(tester.salaryMultipliedByTwo());
		//field "salary" is "private". Can be accessed only inside the class Tester.
		
		System.out.println(tester.amountOfExperienceInTheMonth());
		
		tester.printNameAndSurname();
		
		tester.printAllUserInformation();
	}
}
