package sort.algorithms1;

public class SortUtility {

	private int[] array;
	public SortUtility(int[] array) {
		this.array = array;
	}
	
	void BubbleSort() {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length - 1 - i; j++) {
				if(array[j] > array[j+1]) swap(j, j+1);
			}
		}
	}
	
	void SelectionSort() {
		for(int i = 0; i < array.length; i++) {
			int temp = i;
			for(int j = i + 1 ; j < array.length; j++) {
				if(array[temp] > array[j]) swap(temp, j);
			}
			if(temp != i) {
				swap(i, temp);
			}
		}
	}
	
	void InsertionSort() {
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = i + 1; j < array.length; j++) {
				int temp = array[j];
				while(j-1 >= 0 && array[j-1] > temp) {
					array[j] = array[j-1];
					j--;
				}
				array[j] = temp;
			}
		}
	}
	
	void ShellSort() {
		for(int gap = 5; gap >= 1; gap = gap / 2) {
			for(int i = 0; i < array.length-1; i++) {
				for(int j = i + gap; j < array.length; j = j + gap) {
					int temp = array[j];
					while(j-gap >=0 && array[j-gap] > temp) {
						array[j] = array[j-gap];
						j = j-gap;
					}
					array[j] = temp;
				}
			}
		}
	}
	
	
	
	
	public  void swap(int i, int j) {
		int temp;
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public void show() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "-->");
		}
	}
}
