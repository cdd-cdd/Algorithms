package linklist;

public class App {

	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<>();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		list.insert(6);
		list.insert(7);
		list.insert(8);
		list.remove(1);
		list.remove(20);
		list.remove(8);
		
		
		System.out.println("list size is :" + list.size());
		list.traverseList();
		
		

	}

}
