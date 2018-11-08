package sort.algorithms;


public class APPBuble {
	static int[] array ;

	public static void main(String[] args) {
		RandomValue();
		BubbleSort bubbleSort = new BubbleSort(array);
		long startTime = System.currentTimeMillis();
		bubbleSort.sort();
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
		array = new int[1000000];
		for(int i = 0; i < array.length; i++) {
			array[i] = (int) (1000000*Math.random());
		}
	}

}
