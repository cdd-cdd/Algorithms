package linklist;

public class Node<T extends Comparable<T>>{

	private Node<T> NextNode;
	private T data;
	
	public Node(T data){
		this.data = data;
	}
	public Node<T> getNextNode() {
		return NextNode;
	}
	public void setNextNode(Node<T> nextNode) {
		NextNode = nextNode;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return this.data.toString();
	}
	
	
}
