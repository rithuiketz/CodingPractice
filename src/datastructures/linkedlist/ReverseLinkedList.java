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
		
		//Non Recursively
		System.out.println("Non Recursive #################");
		obj.revrseList(linkedList);
		System.out.println(linkedList);
		
		//Recursively
		System.out.println("Recursive #################");
		linkedList.setHead(obj.reverseRecursive(linkedList.getHead(), null));
		System.out.println(linkedList);
	

	}

	public <T> void  revrseList(LinkedList<T> list)
	{
		if(list.getHead() ==null || list.getHead().next ==null)
			return;
		else
		{
			Node current,prev=null,temp;
			current = list.getHead();
			while(current !=null)
			{
				temp =current.next;
				current.next=prev;
				prev=current;
				current =temp;
			}
			list.setHead(prev);
		}
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

}
