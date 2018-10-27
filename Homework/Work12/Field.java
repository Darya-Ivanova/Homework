public class Field {
	
	private int id;
	private String value;
	
	public Field (String value){
        this.value = value;
    }
	
	@Override
	public String toString() {
        return "value " + value;
    }
}
