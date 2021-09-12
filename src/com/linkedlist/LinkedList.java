package com.linkedlist;

public class LinkedList {

	private Node head;

	private class Node {
		int data;
		Node next;

		Node(int data){
			this.data = data;
			next = null;
		}
	}

	/**
	 * Method to add Element at the End
	 * @param data
	 */
	public void addEnd(int data) {
		Node newNode = new Node(data);

		if(head == null) {
			head = newNode;
		} else {
			Node temp = head;

			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	/**
	 * Method to add Element at the Start
	 * @param data
	 */
	public void addStart(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	/**
	 * Method to add Element at the specific Position
	 * @param data
	 * @param position
	 */
	public void addMiddle(int data, int position) {
		if(position <1) {
			System.out.println("Invalid Position");
		} else if(position == 1) {
			addStart(data);
		} else {
			Node newNode = new Node(data);
			Node current = head;
			int count = 1;
			while(count < position-1) {
				current = current.next;
				count++;
			}
			newNode.next = current.next;
			current.next = newNode;
		}
	}

	/**
	 * Method to delete first element in Linked list
	 */
	public void popHead() {
		if(head == null) {
			System.out.println("Linked List is Empty");
		} else {
			Node temp = head;
			head = head.next;
			System.out.println("Deleted Element = " + temp.data);
			temp = null;
		}
	}

	/**
	 * Method to delete last element in Linked list
	 */
	public void popLast() {
		if(head == null) {
			System.out.println("Linked List is Empty");
		} else if(head.next == null) {
			popHead();
		} else {
			Node temp = head;
			Node current = null;
			while(temp.next != null) {
				current = temp;
				temp = temp.next;
			}
			System.out.println("Deleted Element = " + temp.data);
			current.next = null;
		}
	}

	/**
	 * Method to search the element from the Linked list
	 * @param data
	 */
	public int search(int data) {
		int count = 0;
		Node temp = head;
		while(temp != null) {
			count++;
			if(temp.data == data) {
				System.out.println(data + " found at Position " + count);
				return count;
			}
			temp = temp.next;
		}
		System.out.println(data + " not found");
		return 0;
	}

	public void insertAfter(int node,int data) {
		int position = search(node);
		if(position != 0) {
			addMiddle(data, position + 1);
		}
	}

	public void popMiddle(int data) {
		Node temp = head;
		if(temp.data == data) {
			popHead();
		} else {
			Node prev = head;
			temp = temp.next;
			while(temp != null) {
				if(temp.data == data) {
					prev.next = temp.next;
					System.out.println("Deleted Element = " + temp.data);
					temp = null;
					return;
				} else {
					prev = temp;
					temp = temp.next;
				}
			}
			System.out.println(data + " not found");
		}

	}

	public void size() {
		Node temp = head;
		int count = 0;

		while(temp != null) {
			count ++;
			temp = temp.next;
		}
		System.out.println("Size of Linked List = " + count);
	}

	/**
	 * Method to print the Linked List
	 */
	public void print() {
		Node temp = head;

		if(temp == null) {
			return;
		} else {
			System.out.println("Linked List");
		}

		while(temp.next != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
}
