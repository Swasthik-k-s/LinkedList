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
	 * Method to print the Linked List
	 */
	public void print() {
		Node temp = head;
		System.out.println("Linked List");
		
		while(temp.next != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
}
