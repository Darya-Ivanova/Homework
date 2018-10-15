
public class Massive {

	public void printMassiveAsLine (int[] anyMasToPrint) {
		for (int i = 0; i < anyMasToPrint.length; i++) {
			System.out.print(anyMasToPrint[i] + " ");
		}
	}
	
	public void printReverseMassiveAsLine (int[] anyMasToPrint) {
		for (int i = anyMasToPrint.length-1; i >= 0; i--) {
			System.out.print(anyMasToPrint[i] + " ");
		}
	}
	
	public int getSumOfElements (int[] anyMasToPrint) {
		int sum = 0;
		for (int i = 0; i < anyMasToPrint.length; i++) {
			sum += anyMasToPrint[i];
		}
		return sum;
	}
	
	public int [] multiptyBy3 (int[] anyMasToPrint) {
		int [] result = new int [anyMasToPrint.length];
		for (int i = 0; i < anyMasToPrint.length; i++) {
			result[i] = anyMasToPrint[i] * 3;
		}
		return result; 
	}
}
