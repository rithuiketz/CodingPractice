package datastructures.linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

import datastructures.linkedlist.LinkedList.Node;
//https://www.interviewbit.com/problems/reverse-link-list-ii/
public class ReverseApartinLinkedList {

	@Test
	public void test() 
	{
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);
		
		int startPos = 2,total=3,currPos=1;
		Node temp = null,start;
		start = linkedList.getHead();
		while(currPos++ <startPos)
		{
			temp  =start;
			start=start.next;
		}
		Node prev =  reverse(start,total);
		if(temp !=null)
		{
			temp.next=prev;
		}
		System.out.println(linkedList);
	}

	private Node reverse(Node start, int count)
	{
		 int cp =1;
		 Node current = start,prev = null,next;
		 while( cp <=count && current!=null)
		 {
			 next =current.next;
			 current.next=prev;
			 prev=current;
			 current=next;
			 ++cp;
		 }
		 start.next=current;
		 
		 return prev;
	}

}
