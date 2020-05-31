package com.himansh.doublyLinkedList;
//comment coz i dont knw shit about data structures
public class DoublyLinkedList {
	private Node head;
	private int length=0;
	
	private class Node {
		Node prev;
		String data;
		Node next;
		public Node(String data) {
			this.data = data;
			next=null;
			prev=null;
		}
		public String getData() {
			return data;
		}		
	}
	
	//Insertion
	public void insert(String data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
		}
		else {
			Node pointer=head;
			while(pointer.next!=null) {
				pointer=pointer.next;
			}
			pointer.next=newNode;
			newNode.prev=pointer;
		}
		length++;
	}
	
	//Traversal
	@Override
	public String toString() {
		Node pointer=head;
		String strOfList="";
		while(pointer!=null) {
			strOfList+=pointer.getData()+" ";
			pointer=pointer.next;
		}
		return strOfList;
	}
	
	public int length() {
		return length;
	}
	
	//Get Element Position
	public int getElementPos(String data) {
		int index=1;
		Node pointer=head;
		while(pointer!=null) {
			if(pointer.getData().equals(data)) {
				break;
			}
			pointer=pointer.next;				
			index++;
		}
		if(index>length)
			return -1;
		return index;
	}
	
	//Get Element By position
	public String getElementByPos(int pos) {
		if(pos<=length) {
			int index=1;
			Node pointer=head;
			while(index<pos) {
				pointer=pointer.next;				
				index++;
			}
			return pointer.getData();
		}
		return null;
	}
	
	//Delete By position
	public boolean deleteByPos(int pos) {
		if(pos<=length) {
			if(pos==1) {
				head=head.next;
				head.prev=null;
				length--;
				return true;
			}
			int index=2;
			Node pointer=head.next;
			while(index<pos) {
				pointer=pointer.next;				
				index++;
			}
			if(pos==length) {
				Node previous=pointer.prev;
				previous.next=null;
			}
			else {
				Node previous=pointer.prev;
				Node nextNode=pointer.next;
				previous.next=pointer.next;
				nextNode.prev=previous;
			}
			length--;
			return true;
		}		
		return false;
	}
	
	//Delete By Element
	public int deleteByElement(String data) {
		int index=1;
		if(head.getData().equals(data)) {
			head=head.next;
			head.prev=null;
			length--;
			return index;
		}
		Node pointer=head;
		while(pointer!=null) {
			if(pointer.getData().equals(data)) {
				if(index==length) {
					Node previous=pointer.prev;
					previous.next=null;
				}
				else {
					Node previous=pointer.prev;
					Node nextNode=pointer.next;
					previous.next=pointer.next;
					nextNode.prev=previous;
				}
				break;
			}
			pointer=pointer.next;				
			index++;
		}
		if(index>length)
			return -1;
		length--;
		return index;
	}
}
