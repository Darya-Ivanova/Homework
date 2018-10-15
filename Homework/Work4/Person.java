
public class Person {
	private String name;
	private String surname;
	private int age;
	private int phone;
	
	public void setName (String aa) {
		this.name = aa;
	}
	
	public void setSurname (String bb) {
		this.surname = bb;
	}
	
	public void setAge(int cc) {
		this.age = cc;
	}
	
	public void setPhone(int dd) {
		this.phone = dd;
	}
	
	public String getName () {
		return this.name;
	}
	
	public String getSurname () {
		return this.surname;
	}
	
	public  int getAge() {
		return this.age;
	}
	
	public  int getPhone() {
		return this.phone;
	}
	
	public static void printAllInformation(Person person0) {
		System.out.println("Name:" + person0.getName() + " " + "Surname: " + person0.getSurname()+ " " + "Age: " + person0.getAge()+ " " + "Phone: " + person0.getPhone());
	}
	
	public static void printName(Person person0) {
		System.out.println("Name:" + person0.getName() + " " + "Surname: " + person0.getSurname());
	}
	
	public static boolean isAdult (Person person0) {
		int a = person0.getAge();
		return ( a > 18);
	}
}
