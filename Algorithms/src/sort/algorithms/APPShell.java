package sort.algorithms;

public class APPShell {

	static int[] array ;

	public static void main(String[] args) {
		RandomValue();
		ShellSort shellSort = new ShellSort(array);
		long startTime = System.currentTimeMillis();
		shellSort.sort();
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
			array[i] = (int) (100000*Math.random());
		}
	}
}
