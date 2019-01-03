package lru;

public class DoubleLinkedList {

	private Node headNode;
	private Node tailNode;
	
	public DoubleLinkedList() {
		
	}

	public Node getHeadNode() {
		return headNode;
	}

	public void setHeadNode(Node headNode) {
		this.headNode = headNode;
	}

	public Node getTailNode() {
		return tailNode;
	}

	public void setTailNode(Node tailNode) {
		this.tailNode = tailNode;
	}
	
	

}
