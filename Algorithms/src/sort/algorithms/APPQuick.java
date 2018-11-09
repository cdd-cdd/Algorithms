package sort.algorithms;

public class APPQuick {

	static int[] array ;

	public static void main(String[] args) {
		RandomValue();
		QuickSort quickSort = new QuickSort(array);
		long startTime = System.currentTimeMillis();
		quickSort.sort();
		long endTime = System.currentTimeMillis();
		//new APPInsertion().show(array);
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
		array = new int[10000000];
		for(int i = 0; i < array.length; i++) {
			array[i] = (int) (10000000*Math.random());
		}
	}
}
