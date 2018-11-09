package sort.algorithms;

public class MergeSort {

	int[] nums;
	int[] tempNums;
	public MergeSort(int[] nums) {
		this.nums = nums;
		this.tempNums = new int[nums.length];
	}
	
	public void sort() {
		mergeSort(0,nums.length-1);
	}
	
	public int partition(int low, int high) {
		
		int middle = (low + high)/2;
		return middle;
	}
	
	public void mergeSort(int low, int high) {
		int middle;
		
		if(low >= high) return;
		middle = partition(low,high);
		mergeSort(low,middle);
		mergeSort(middle + 1, high);
		merge(low, middle, high);
		
	}
	
	public void merge(int low, int middle, int high) {
		//copy partial nums to tempNums, to operate on tempNums
		//System.out.println("low: " + low + " middle:"+ middle + " high:" + high);
		for(int i = low; i <= high; i++) {
			tempNums[i] = nums[i];
		}
		//System.out.println(nums);
		int i = low;
		int j = middle + 1;
		int k = low;
		
		while((i <= middle) && (j <= high)) {
			if (tempNums[i] > tempNums[j]) {
				nums[k] = tempNums[j];
				j++;
				k++;
			}else {
				nums[k] = tempNums[i];
				i++;
				k++;
			}
			//System.out.println("k : " + k);
			//System.out.println("i : " + i);
		}
		while((i > middle) && (j <= high)) {
			nums[k] = tempNums[j];
			j++;
			k++;
			//System.out.println("i:"+ i + "j:" + j);
			//System.out.println("2");
		}
		while((j > high) && (i <= middle)) {
			nums[k] = tempNums[i];
			i++;
			k++;
			//System.out.println("3");
		}
		//System.out.println("=========" + k + "=========");
	}

	public void swap(int i, int j) {
		int temp;
		temp = nums[j];
		nums[j] = nums[i];
		nums[i] = temp;
		
	}

}
