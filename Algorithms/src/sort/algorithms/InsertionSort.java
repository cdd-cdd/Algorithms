package sort.algorithms;

public class InsertionSort {
	int[] nums;
	public InsertionSort(int[] nums) {
		this.nums = nums;
	}
	
	void sort(){
		for(int i = 0; i < nums.length; i++) {
			for(int j = i; j > 0; j--) {
				if(nums[j] < nums[j-1]) swap(j,j-1);
			
			}
		}
		
	}
	
/*	void sort(){
		int point;
		for(int i = 0; i < nums.length; i++) {
			point = nums[i];
			for(int j = i; j > 0; j--) {
				if(point < nums[j-1]) nums[j] = nums[j-1];
				else {
					nums[j] = point;
					break;
				}
				if(j == 1) {
					nums[j-1] = point;
				}
			}
		}
		
	}*/
	
	private void swap(int i, int j) {
		int temp;
		temp = nums[j];
		nums[j] = nums[i];
		nums[i] = temp;
		
	}

}
