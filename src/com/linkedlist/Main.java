package com.linkedlist;

public class Main {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.addEnd(56);
		linkedList.addEnd(70);
		linkedList.addMiddle(30, 2);
		linkedList.print();
		linkedList.search(30);
	}
}

