
public class Button {
	
	private String name;
	boolean action;
	
	public Button(String name){
        this.name = name; 
    }
	
	@Override
	public String toString() {
		return "name " + name;
	}
}
