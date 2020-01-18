package datastructures.linkedlist;

public class LinkedList<T> {
	private Node<T> head;

	protected class Node<T> {
		private T data;

		protected Node<T> next;

		Node(T data) {
			this.data = data;
		}

		public T getData() {
			return this.data;
		}

		public Node<T> getNext() {
			return this.next;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.data.toString();
		}
	}

	public void add(T data) {
		if (this.head == null) {
			this.head = new Node<T>(data);
			return;
		} else {
			Node<T> temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = new Node<T>(data);
		}
	}

	public Node<T> getNode(T data) {
		Node<T> temp = head;
		while (temp != null && (temp = temp.next) != null) {
			if (temp.getData().equals(data)) {
				return temp;
			}
		}
		return null;
	}

	public Node<T> getHead() {
		return this.head;
	}
	
	public void setHead(Node<T> node)
	{
		this.head =node;
	}

	@Override
	public String toString() {
		String s = "[";
		Node<T> temp = head;
		while (temp != null) {
			s += temp.toString() + ",";
			temp = temp.next;
		}
		s += "]";
		return s;
	}

}
