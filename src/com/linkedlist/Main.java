package com.linkedlist;

public class Main {

	public static void main(String[] args) {
		System.out.println("Linked List");
		LinkedList linkedList = new LinkedList();
		linkedList.addEnd(56);
		linkedList.addEnd(70);
		linkedList.addMiddle(30, 2);
		linkedList.print();
		linkedList.insertAfter(30, 40);
		linkedList.print();
		linkedList.popMiddle(40);
		linkedList.size();
		linkedList.print();
		
		OrderedLinkedList orderedLinkedList = new OrderedLinkedList();
		System.out.println("\nOrdered Linked List");
		orderedLinkedList.print();
		orderedLinkedList.add(50);
		orderedLinkedList.add(20);
		orderedLinkedList.print();
		orderedLinkedList.add(80);
		orderedLinkedList.add(30);
		orderedLinkedList.print();
	}
}

