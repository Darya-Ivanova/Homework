
public class MassiveMain {
	public static void main(String[] args) {
				
	Massive massive = new Massive(); 
	
	int[] array = new int[10];
	int a = 10;
	for(int i = 0; i <= array.length-1; i++){
		array[i] = (int) (Math.random() * a);
	}
	
	int[] result =  massive.multiptyBy3(array);
	for (int i = 0; i < result.length; i++) {
	}

	System.out.print("Массив: " );
	massive.printMassiveAsLine(array);
	
	System.out.println();
	
	System.out.print("Mассив в обратном порядке: ");
	massive.printReverseMassiveAsLine(array);
	
	System.out.println();
	
	System.out.println("Сумма всех элементов массива: " + massive.getSumOfElements(array));
	
	System.out.print("Массив, в котором каждый элемент умножен на 3, в прямом порядке: ");
	massive.printMassiveAsLine(result);
	
	System.out.println();
	
	System.out.print("Массив, в котором каждый элемент умножен на 3, в обратном порядке: ");
	massive.printReverseMassiveAsLine(result);
	}
}
