package linklist;

public interface List<T extends Comparable<T>> {

	public void insert(T data);
	public void remove(T data);
	public void traverseList();
	public int size();
	public Node<T> getMiddleNode();
	public void reverse();
}

