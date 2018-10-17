package package1;

public class Tester {
	public String name;
	public String surname;
	protected int expirienceInYears;
	String englishLevel;
	private int salary;
	public int multiply;
	public int experienceInTheMonth;
	
//conctructors
	
	private Tester (String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	private Tester (String name, String surname, int expirienceInYears, String englishLevel) {
		this(name, surname);
		this.expirienceInYears = expirienceInYears;
		this.englishLevel = englishLevel;
	}
	public Tester (String name, String surname, int expirienceInYears, String englishLevel, int salary) {
		this(name, surname, expirienceInYears,englishLevel);
		this.salary = salary;
	}	

//get, set
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getSurname() {
		return surname;
	}
	void setSurname(String surname) {
		this.surname = surname;
	}
	int getExpirienceInYears() {
		return expirienceInYears;
	}
	void setExpirienceInYears(int expirienceInYears) {
		this.expirienceInYears = expirienceInYears;
	}
	String getEnglishLevel() {
		return englishLevel;
	}
	void setEnglishLevel(String englishLevel) {
		this.englishLevel = englishLevel;
	}
	int getSalary() {
		return salary;
	}
	void setSalary(int salary) {
		this.salary = salary;
	}
	
//methods
	private int salaryMultipliedByTwo () {
		int multiply = salary * 2;
		return multiply;
	}
	
	int amountOfExperienceInTheMonth() {
		int experienceInTheMonth = expirienceInYears * 12;
		return experienceInTheMonth;
	}
	
	protected void printNameAndSurname () {
		System.out.println(name + " " + surname);
	}
	
	public void printAllUserInformation () {
		System.out.println(name + " " + surname + " " + expirienceInYears + " " + englishLevel + " " + salary);
	}
}
