package sort.algorithms;

public class ShellSort {
	
	int[] array;
	public ShellSort(int [] array) {
		this.array = array;
	}
	
	public void sort() {
		for(int gap = array.length/2; gap >0; gap /= 2) {
			for(int i = gap; i < array.length; i++) {
				int j = i;
				while((j >= gap) && (array[j-gap] > array[j])) {
					swap(j, j-gap);
					j = j-gap;// this is important step to compare new element with element front
				}
			}
		}
	}
	
	public void swap(int i, int j) {
		int temp;
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	

}
