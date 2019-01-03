package Stack;

public class Stack<T extends Comparable<T>> {

	private Node<T> root;
	private int count;

	public void push(T data) {

		this.count++;

		if (root == null) {
			root = new Node<>(data);
		} else {
			Node<T> oldNode = this.root;
			root = new Node<>(data);
			root.setNextNode(oldNode);
		}
	}
	
	public T peek() {
		return this.root.getData();
	}

	public T pop() throws Exception {

		if (count > 0) {
			T itemToPop = this.root.getData();
			this.root = this.root.getNextNode();
			this.count--;
			return itemToPop;
		}else {
			throw new Exception("i am empty");
		}
	}

	public int size() {
		return this.count;
	}

	public boolean isEmpty() {
		return this.root == null;
	}
}
