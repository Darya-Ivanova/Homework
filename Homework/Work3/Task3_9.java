
public class Task3_9 {
	public static void main(String[] args) {
		int[] mas = new int[6];
		int b = 100;
		for (int i = 0; i <= mas.length - 1; i++) {
			mas[i] = (int) (Math.random() * b);
		}
		outlengthMas(mas);
	}

	public static void outlengthMas(int[] anyMasToPrint) {
		System.out.print("Длинна массива: " + anyMasToPrint.length);
		
	}

}
