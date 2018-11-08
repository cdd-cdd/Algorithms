package sort.algorithms;

public class QuickSort {
    int[] nums;
    int low = 0;
    int high;
	public QuickSort(int[] nums) {
		this.nums = nums;
		high = nums.length-1;
	}
	
	public void sort() {
		quicksort(low,high);
	}
	
	public void quicksort(int low, int high) {
		
		if (low >= high) return;
		int pivotIndex =partition(low,high);
		quicksort(low,pivotIndex-1);
		quicksort(pivotIndex+1,high);
	}
	
	public int partition(int low, int high) {
		int middle = (low + high)/2;
		swap(middle, high);
		int point = low;
		for(int i = low; i < high; i++) {//nt i = low**i < high
			if(nums[i] <= nums[high]) {
				swap(point, i);
				point++;
			}
		}
		swap(point, high);
		return point;
	}
	
	public void swap(int i, int j) {
		int temp;
		temp = nums[j];
		nums[j] = nums[i];
		nums[i] = temp;
		
	}

}
