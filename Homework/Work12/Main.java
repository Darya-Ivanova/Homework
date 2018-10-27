
public class Main {
	public static void main(String[] args) {
		
		Button button1 = new Button("F1");
        Button button2 = new Button("F2");
        Button button3 = new Button("F3");
        
        //class Button
        Page page = new Page();
        page.addButton(button1);
        page.addButton(button2);
        page.addButton(button3);
        
        page.removeFromCollection(button1);
        
        page.setItemInCollection(1, button1);
        
        page.printAll(button1);;
        
        //class Field
        Field field1 = new Field("age");
        Field field2 = new Field("date");
        Field field3 = new Field("number");
        
        page.addField(field1);
        page.addField(field2);
        page.addField(field3);
        
        page.removeFromCollection(field1);
        
        page.setItemInCollection(1, field1);
        
        page.printAll(field1);
        
        //class Label
        Label label1 = new Label("Dasha");
        Label label2 = new Label("Kate");
        Label label3 = new Label("Andrew");
        
        page.addLabel(label1);
        page.addLabel(label2);
        page.addLabel(label3);
        
        page.removeFromCollection(label1);
        
        page.setItemInCollection(label2, label1);
        
        page.printAll(label1);
        
        //class Dropdown
        Dropdown dropdown1 = new Dropdown(1, "xxxx");
        Dropdown dropdown2 = new Dropdown(2, "yyyy");
        Dropdown dropdown3 = new Dropdown(3, "eeee");
        
        page.addDropdown(0, dropdown1);
        page.addDropdown(1, dropdown2);
        page.addDropdown(2, dropdown3);
        
        page.removeFromCollection(1);
        
        page.setItemInCollection(1, dropdown2);
        
        page.printAll(dropdown1);
	}
}
