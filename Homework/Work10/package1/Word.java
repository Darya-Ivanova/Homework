package package1;

import java.util.Arrays;

public class Word extends Sentence {

	public String newСharacter = "%";

	public String getNewСharacter() {
		return newСharacter;
	}

	public void setNewСharacter(String newСharacter) {
		this.newСharacter = newСharacter;
	}
	
	public void replaceСharacter(String[] mas, String character) {
		StringBuilder stringBuilder = new StringBuilder();
 		for (int i = 0; i < mas.length; i++) {
 			mas[i] = mas[i].replace(character, this.newСharacter);
 			stringBuilder.append(" ");
 			stringBuilder.append(mas[i]);
 		}
		System.out.println(stringBuilder);
	}
}
