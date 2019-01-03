package linklist;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class LinkedList<T extends Comparable<T>> implements List<T> {
	
    private Node<T> root;
	private int size;

	@Override
	public void insert(T data) {
		++size;
		if(root == null) {
			root = new Node<>(data);
		}else {
			insertData(data, root);
		}
		
	}

	private void insertData(T data, Node<T> node) {
		
		if(node.getNextNode() != null) {
			insertData(data, node.getNextNode());
		}else {
			Node newNode = new Node<>(data);
			node.setNextNode(newNode);
		}
		
	}

	@Override
	public void remove(T data) {
		if (root == null) {
			return;
		}
		

		if(this.root.getData().compareTo(data) == 0) {
			this.root = this.root.getNextNode();
			--size;
		} else {
			remove(data, root, root.getNextNode());
		}
		
	}

	private void remove(T data, Node<T> previousNode, Node<T> actualNode) {
		
		while(actualNode != null) {
			if (actualNode.getData().compareTo(data) == 0) {
				previousNode.setNextNode(actualNode.getNextNode());	
				actualNode = null;
				--size;
				return;
				
			}
			previousNode = actualNode;
			actualNode = actualNode.getNextNode();
		}
		System.out.println(data + " not found");
	}

	@Override
	public void traverseList() {
		if (root == null) {
			return ;
		}
		
		Node<T> node = root;
		
		while(node != null) {
			System.out.print(node + "-->");
			node = node.getNextNode();
		}
		
	}
	
	@Override
	public Node<T> getMiddleNode(){
		Node<T> node1,node2;
		
		node1 = this.root;
		node2 = this.root;
		
		while(node2.getNextNode() != null && node2.getNextNode().getNextNode() != null) {
			node1 = node1.getNextNode();
			node2 = node2.getNextNode().getNextNode();
		}
		
		return node1;
	}

	@Override
	public int size() {
		
		return size;
	}
	
	@Override
	public String toString() {
		if(root == null) {
			return "empty";
		}
		
		Node<T> node = root;
		
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		while(node != null) {
			sb.append(node.getData());
			sb.append(", ");
			node = node.getNextNode();
		}
		sb.append("]");
		return sb.toString();
	}

	@Override
	public void reverse() {
		
		Node<T> currentNode = this.root;
		Node<T> previousNode = null;
		Node<T> nextNode = null;
		
		while(currentNode != null) {
			nextNode = currentNode.getNextNode();
			currentNode.setNextNode(previousNode);
			previousNode = currentNode;
			currentNode = nextNode;
		}
		root = previousNode;
		
	}

/*	@Override
	public void reverse() {
		Node<T> previous;
		Node<T> next = root.getNextNode();
		root.setNextNode(null);
		while(next.getNextNode() != null) {		
			previous = root;
			root = next;
			next = root.getNextNode();
			root.setNextNode(previous);
		}
		previous = root;
		root = next;
		root.setNextNode(previous);
	
	}*/
	
	

}
