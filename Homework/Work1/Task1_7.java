
public class Task1_7 {
	public static void main(String[] args) {
		int a = 214748364;
		short b = 32767;
		long c = 5577534789556807L;
		double d = 333333.14;
		float e = 1.5f;
		long result1 = a + b;
		double result2 = c - d;
		double result3 = e * d;
		boolean result4 = c > d;
		boolean result5 = e < a;
		boolean result6 = a == d;
		boolean result7 = e != b;
		System.out.println(result1 + " " + result2 + " " + result3 + " " + result4 + " " + result5 + " " + result6 + " "
				+ result7);
	}

}
