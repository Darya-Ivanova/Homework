
public class Tester {
	
	private String name;
	private String surname;
	private int expirienceInYears;
	private String englishLevel;
	private int salary;
	
	public Tester() {
	}
	
	public Tester (String name) {
		this.name = name;
	}
	
	public Tester (String name, String surname) {
		this(name);
		this.surname = surname;
	}
	
	public Tester (String name, String surname, int expirienceInYears) {
		this(name, surname);
		this.expirienceInYears = expirienceInYears;
	}
	
	public Tester (String name, String surname, int expirienceInYears, String englishLevel) {
		this(name, surname, expirienceInYears);
		this.englishLevel = englishLevel;
	}
	
	public Tester (String name, String surname, int expirienceInYears, String englishLevel, int salary) {
		this(name, surname, expirienceInYears,englishLevel);
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getExpirienceInYears() {
		return expirienceInYears;
	}

	public void setExpirienceInYears(int expirienceInYears) {
		this.expirienceInYears = expirienceInYears;
	}

	public String getEnglishLevel() {
		return englishLevel;
	}

	public void setEnglishLevel(String englishLevel) {
		this.englishLevel = englishLevel;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void print() {
		System.out.println("Name: " + this.name + ", Surname: " + this.surname + ", Expirience in years: " + 
				this.expirienceInYears + ", English level: " + this.englishLevel + ", Salary: " + this.salary);
	}
	
	public void print(String name1) {
		System.out.println("Name: " + name1);
	}
	
	public void print(String name1, String surname1) {
		System.out.println("Name: " + name1 + ", Surname: " + surname1);
	}
	
	public void print(String name1, String surname1, int expirienceInYears1) {
		System.out.println("Name: " + name1 + ", Surname: " + surname1 + ", Expirience in years: " + expirienceInYears1);
	}
	
	public void print(String name1, String surname1, int expirienceInYears1, String englishLevel1) {
		System.out.println("Name: " + name1 + ", Surname: " + surname1 + ", Expirience in years: " + expirienceInYears1
				+ ", English level: " + englishLevel1);
	}
	
	public void print(String name1, String surname1, int expirienceInYears1, String englishLevel1, int salary1) {
		System.out.println("Name: " + name1 + ", Surname: " + surname1 + ", Expirience in years: " + expirienceInYears1
				+ ", English level: " + englishLevel1 + ", Salary:" + salary1);
	}
	
	public static void printStatic (String name1, String surname1, int expirienceInYears1, String englishLevel1, int salary1) {
		System.out.println("Name: " + name1 + ", Surname: " + surname1 + ", Expirience in years: " + expirienceInYears1
				+ ", English level: " + englishLevel1 + ", Salary:" + salary1);
	}
}
