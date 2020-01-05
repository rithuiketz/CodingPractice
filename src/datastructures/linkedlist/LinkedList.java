package datastructures.linkedlist;

public class LinkedList<T> {
	private Node<T> head;

	private class Node<T> {
		private T data;

		private Node<T> next;

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

	public void add(T data) 
	{
		if(this.head == null)
		{
			this.head = new Node<T>(data);
			return;
		}
		Node<T> temp =head;
		while(temp !=null)
		{
			temp  = temp.next;
		}
		temp.next = new Node<T>(data);
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

	@Override
	public String toString() {
		String s = "[";
		Node<T> temp = head;
		while (temp != null) {
			s += head.toString() + ",";
			temp = temp.next;
		}
		s += "]";
		return s;
	}

}
