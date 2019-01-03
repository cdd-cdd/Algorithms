
/*The task is to find the middle node of a linked list without
the need for extra memory(so we are after an in-place algorithm)*/

package linklist;

import java.util.stream.IntStream;

public class MiddleNodeDemo {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		IntStream.range(0, 11).forEach(i-> list.insert(i));
		//list.traverseList();
		System.out.println(list);
		list.reverse();
		System.out.println(list);
		System.out.println(list.getMiddleNode());
		
		
	
	


	}

}
