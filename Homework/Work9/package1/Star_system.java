package package1;

public abstract class Star_system {
	private String className = "Star system";
	private String information = "A star system is a system consisting of stars moving in a closed orbit, gravitationally coupled, and possibly having planetary systems.";
	
	public void printNameStarSystem() {
		System.out.println(className);
	}
	
	public void printNumberOfStars() {
        System.out.println(information);
    }
	
	public abstract void printClassName();
	public abstract void printImplementationOfAnAbstractMethod();

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}
	
	
}
