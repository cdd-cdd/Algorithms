package sort.algorithms;

public class ShellSort2 {
	int[] nums;
	public ShellSort2(int[] nums) {
		this.nums = nums;
	}
	
	public void sort() {
		for(int gap =nums.length/2; gap > 0 ; gap/=2) {
			for(int i = gap; i < nums.length; i++) {
				int j = i;
				while((j >= gap) && (nums[j-gap] > nums[j])) {
					//why it's so important that (j >=gap).
					//why it's doesn't work (j > 0)-->nums[j-gap] this may be lead to ArrayIndexOutOfBoundsException       
					swap(j,j-gap);
					j = j-gap;
				}
			}
		}
	}
	
	
	public void swap(int i, int j) {
		int temp;
		temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	

}
