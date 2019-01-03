package Stack;

public class App {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println(stack.size());
		
		try {
			System.out.println(stack.pop());
			System.out.println(stack.peek());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
		
	}

}
