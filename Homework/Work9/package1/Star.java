package package1;

public class Star extends Star_system {
	private String nameOfStar;
	private String typesOfStars;
	
	public void printNameOfstar() {
		System.out.println(nameOfStar);
	}
	
	public void printTypesOfStars() {
		System.out.println(typesOfStars);
	}
	
	public Star () {
	}
	
	public Star (String nameOfStar) {
		this.nameOfStar = nameOfStar;
	}
	
	public Star (String nameOfStar, String className) {
		this(nameOfStar);
		super.setClassName(className);
	}
		
	@Override
	public void printClassName() {
		System.out.println("Hey. We are in the Star class.");
	}
	
	@Override
	public void printImplementationOfAnAbstractMethod() {
		System.out.println("Now I have implemented an abstract method in the Star class.");
	}
	
}
