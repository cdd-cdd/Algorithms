package sort.algorithms;

public class BubbleSort {
	int[] nums;
	public BubbleSort(int[] nums) {
		this.nums = nums;
	}
	
	public void sort() {
		for(int i = 0; i < nums.length-1; i++) {
			for(int j = 0; j < nums.length-2-i; j++) {
				if(nums[j] > nums[j+1]) swap(j,j+1);
			}
		}
	}

	private void swap(int i, int j) {
		int temp;
		temp = nums[j];
		nums[j] = nums[i];
		nums[i] = temp;
		
	}

}
