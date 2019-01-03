package Stack;

public class AppForArrayDemo {

	public static void main(String[] args) {
		StackArray<Integer> stackArray = new StackArray<Integer>();
		
		stackArray.push(10);
		stackArray.push(100);
		stackArray.push(1000);
		stackArray.push(10);
		stackArray.push(100);
		stackArray.push(1000);
		stackArray.push(10);
		stackArray.push(100);
		stackArray.push(1000);
		
		System.out.println(stackArray.size());
		
		System.out.println(stackArray.pop());
		System.out.println(stackArray.pop());
		System.out.println(stackArray.pop());
		System.out.println(stackArray.pop());
		System.out.println(stackArray.pop());
		System.out.println(stackArray.pop());
	}
}
