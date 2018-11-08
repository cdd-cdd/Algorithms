package sort.algorithms;

public class SelectionSort {
	int[] nums;
	public SelectionSort(int[] nums) {
		this.nums = nums;
	}
	
	void sort() {
		for(int i = 0; i < nums.length-1; i++) {
			int index = i;
			for(int j = i + 1; j < nums.length; j++ ) {
				if(nums[index] > nums[j]) index = j;
			}
			if(index != i) swap(i,index);
		}
	}
	
	private void swap(int i, int j) {
		int temp;
		temp = nums[j];
		nums[j] = nums[i];
		nums[i] = temp;
		
	}

}
