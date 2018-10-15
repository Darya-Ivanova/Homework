
public class PersonMain {
	public static void main(String[] args) {

		Person person = new Person();
		person.setName("Tom");
		person.setSurname("Hanks");
		person.setAge(62);
		person.setPhone(123456789);
		Person.printAllInformation(person);
		Person.printName(person);
		System.out.println("Person is adult: " + Person.isAdult(person));
		
	}
}
