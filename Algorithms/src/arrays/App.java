package arrays;

import com.sun.xml.internal.ws.api.pipe.Fiber;

public class App {

	int[][] array = new int[4][];
	
	public static void main(String[] args) {
		App app = new App();
		System.out.println(app.array);
		
		
		System.out.println(Fiber(9));
		
		System.out.println(factorials(5));
	}
	
	private static int Fiber(int i) {
		if (i == 1) {
			return 1;
		}else if (i == 2) {
			return 1;
		}else {
			return Fiber(i - 1) + Fiber(i - 2);
		}
		
	}

	private static long factorials(int i) {
		
		while(i != 1) {
			return i * factorials(i-1);
		}
		
		return 1;

	}
}
