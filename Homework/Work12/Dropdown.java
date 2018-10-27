import java.util.List;

public class Dropdown {
	List<String> options;
	private int  isSelected;
	private String name;
	
	public Dropdown(int  isSelected, String name){
        this.name = name;
        this.isSelected = isSelected;
    }

    @Override
    public String toString() {
        return "key " + isSelected + ", name " + name;
    }
}
