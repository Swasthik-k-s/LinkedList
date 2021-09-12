package com.linkedlist;

public class Main {

	public static void main(String[] args) {
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
	}
}

