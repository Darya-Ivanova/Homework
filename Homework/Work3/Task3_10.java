
public class Task3_10 {
	public static void main(String[] args) {
		double[] mas = new double[6];
		int b = 100;
		for (int i = 0; i <= mas.length - 1; i++) {
			mas[i] = (double) (Math.random() * b);
		}
		System.out.print("Массив: " );
		outMas(mas);
		System.out.println();
		sumMas(mas);
	}

	public static void outMas(double[] anyMasToPrint) {
		for (int i = 0; i < anyMasToPrint.length; i++) {
			System.out.print(anyMasToPrint[i] + " ");
		}
	}
	

	public static void sumMas(double[] anyMasToPrint) {
		double sum = 0;
		for (int i = 0; i < anyMasToPrint.length; i++) {
		sum+=anyMasToPrint[i];
		}
		System.out.print("Сумма: " + sum);
	}
}
