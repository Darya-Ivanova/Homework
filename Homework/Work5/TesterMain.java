
public class TesterMain {

	public static void main(String[] args) {

		Tester tester1 = new Tester("Darya", "Ivanova", 1, "B1", 1000);
		tester1.print();
		
		Tester tester2 = new Tester();
		tester2.print("Bill");
		
		Tester tester3 = new Tester();
		tester3.print("Petr", "Ivanov");
		
		Tester tester4 = new Tester();
		tester4.print("Kate", "Krot", 9);
		
		Tester tester5 = new Tester();
		tester5.print("Stanislav", "Smirnov", 4, "B2");
		
		Tester tester6 = new Tester();
		tester6.print("Maria", "Ilina", 38, "A1", 500);
		
		Tester.printStatic("Tom", "Hanks", 40, "C2", 100000);
	}

}
