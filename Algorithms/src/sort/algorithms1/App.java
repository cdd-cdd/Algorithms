package sort.algorithms1;

public class App {

	public static void main(String[] args) {
		int[] array = {2,4,8,5,7,6,9,1,3};
		SortUtility utility = new SortUtility(array);
		utility.ShellSort();
		utility.show();
	}
}
