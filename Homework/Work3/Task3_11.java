
public class Task3_11 {
	public static void main(String[] args) {
		float[] mas1 = new float[6];
		int b = 100;
		for (int i = 0; i <= mas1.length - 1; i++) {
			mas1[i] = (float) (Math.random() * b);
		}
		System.out.print("Массив: ");

		float[] mas3 = outMas(mas1);
		for (float f : mas3) {
			System.out.print(f);
		}
	}

	public static float[] outMas(float[] anyMasToPrint) {
		float[] mas2 = new float[anyMasToPrint.length];
		for (int i = 0; i < anyMasToPrint.length; i++) {
			if (i % 3 == 0) {
				mas2[i] = -1;
			} else {
				mas2[i] = anyMasToPrint[i];
			}
		}
		return mas2;
	}
}
