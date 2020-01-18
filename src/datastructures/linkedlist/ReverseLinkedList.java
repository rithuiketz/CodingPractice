package datastructures.linkedlist;

import datastructures.linkedlist.LinkedList.Node;

public class ReverseLinkedList
{

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(55);
		linkedList.add(22);
		linkedList.add(67);
		linkedList.add(19);
		linkedList.add(24);
		linkedList.add(36);
		linkedList.add(99);
		linkedList.add(77);
		linkedList.add(85);
		linkedList.add(66);
		linkedList.add(787);
		
		ReverseLinkedList obj = new ReverseLinkedList();
		System.out.println("Before Reversing");
		System.out.println(linkedList);
		System.out.println("#################");
		obj.revrseList(linkedList);
	//	System.out.println(linkedList);

	}

	public <T> void  revrseList(LinkedList<T> list)
	{
		Node curr = list.getHead();
		Node prev = null;
		
		Node node = reverseRecursive(curr,prev);
		list.setHead(node);
		System.out.println(list);
	}

	private Node reverseRecursive(Node curr, Node prev) 
	{
		if(curr.next == null)
		{			
			curr.next=prev;
			return curr;
		}
		Node next  = curr.next;
		curr.next = prev;
		return reverseRecursive(next, curr);
	}
	
	private Node nonRecursive(LinkedList<Integer> list)
	{
		return null;
		
	}

}
