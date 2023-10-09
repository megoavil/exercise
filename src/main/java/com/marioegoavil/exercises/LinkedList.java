package com.marioegoavil.exercises;

public class LinkedList {
	LinkedListNode head;

	/**
	 * @param head
	 */
	public LinkedList(LinkedListNode head) {
		super();
		this.head = null;
	}
	
	public void insertNodeAtHead(LinkedListNode node) {
		if (this.head != null){
			node.next = this.head;
			this.head = node;
		}else {
			this.head = node;
		}
	}
	
	public void createLinkedList(int[] lst) {
		for(int i : lst) {
			LinkedListNode newnode = new LinkedListNode(null, i);
			this.insertNodeAtHead(newnode);			
		}
	}
	
	public String __str__() {
		String result = "";
		LinkedListNode temp = this.head;
		while(temp!=null) {
			result+=String.valueOf(temp.data);
			temp = temp.next;
			if(temp!=null) {
				result+=",";
			}
		}
		result += "";
		return result;
	}
	
}
