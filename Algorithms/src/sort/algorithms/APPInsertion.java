package sort.algorithms;


public class APPInsertion {
	static int[] array ;

	public static void main(String[] args) {
		RandomValue();
		InsertionSort insertionSort = new InsertionSort(array);
		long startTime = System.currentTimeMillis();
		insertionSort.sort();
		long endTime = System.currentTimeMillis();
		new APPInsertion().show(array);
		System.out.println("程序运行时间： "+(endTime-startTime)+"ms");
		

	}
	
	void show(int[] array) {
		for(int i =0; i < array.length; i++) {
			System.out.print(array[i] + "->");
		}
		System.out.println();
		System.out.println(array.length);
	}
	
	static void RandomValue() {
		array = new int[100000];
		for(int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100000);
		}
	}

}
