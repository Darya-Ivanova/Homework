
public class Task3_8 {

	public static void main(String[] args) {
		int[] mas = new int[6];
		int b = 100;
		for (int i = 0; i <= mas.length - 1; i++) {
			mas[i] = (int) (Math.random() * b);
		}
		outMas(mas);
	}

	public static void outMas(int[] anyMasToPrint) {
		for (int i = 0; i < anyMasToPrint.length; i++) {
			System.out.print(anyMasToPrint[i]+ " ");
		}
	}
}
