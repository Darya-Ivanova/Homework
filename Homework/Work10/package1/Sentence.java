package package1;

public class Sentence extends Paragraph implements IClass {
	
	public void printEnterTheNumberOfWords() {
		System.out.println("Enter the number of words: ");
	}
	
	public void printEnterText() {
		System.out.println("Enter text: ");
	}
	
	protected void printEnterTheСharacterToBeReplaced() {
		System.out.println("Enter the character to be replaced: ");
	}
	
	@Override
	public void printClassName() {
		System.out.println("Hey. We are in the Sentence class.");
	}

	@Override
	public void printText() {
		System.out.println("Now I have implemented an abstract method in the Sentence class.");
		 
	}
}
