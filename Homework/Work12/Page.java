import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Page {
	
	ArrayList<Button> buttons = new ArrayList<>();
	LinkedList<Field> fields = new LinkedList<>();
	HashSet<Label> labels = new HashSet<>();
	HashMap<Integer, Dropdown> dropdowns = new HashMap<>();
	private float id;
	private String title;
	
	public Page (){
        this.id = id;
        this.title = title;
    }
	
	@Override
	public String toString() {
        return "id " + id + ", title " + title;
    }
	
	//class Button
	public void addButton(Button button) {
		buttons.add(button);
    }

    public void removeFromCollection(Button button) {
        buttons.remove(button);
    }

    public void setItemInCollection (int index, Button button) {
        buttons.set(index, button);
    }

    public void printAll(Button button) {
        buttons.stream().forEach(System.out::println);
    }
    
    //class Field
    public void addField(Field field) {
        fields.add(field);
    }

    public void removeFromCollection(Field field) {
        fields.remove(field);
    }

    public void setItemInCollection(int index, Field field) {
        fields.set(index, field);
    }

    public void printAll(Field field) {
        fields.stream().forEach(fieldOut -> System.out.println(fieldOut));
    }
    
    //class Label
    public void addLabel(Label label) {
        labels.add(label);
    }

    public void removeFromCollection(Label label) {
        labels.remove(label);
    }

    public void setItemInCollection(Label oldLabel, Label newLabel) {
        labels.remove(oldLabel);
        labels.add(newLabel);
    }

    public void printAll(Label label) {
        for (Label labelOut : labels) {
            System.out.println(labelOut);
        }
    }
    
    //class Dropdown
    public void addDropdown(Integer key, Dropdown dropdown) {
        dropdowns.put(key, dropdown);
    }

    public void removeFromCollection(Integer key) {
        dropdowns.remove(key);
    }

    public void setItemInCollection(Integer key, Dropdown dropdown) {
        dropdowns.put(key, dropdown);
    }

    public void printAll(Dropdown dropdown) {
        dropdowns.values().stream().forEach(dropdownOut -> System.out.println(dropdownOut));

    }
}
