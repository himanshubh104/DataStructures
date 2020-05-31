package com.himansh.set;

public class LinkedSet {
	private Node head;
	private int length=0;
	
	private class Node {
		String data;
		Node next;
		public Node(String data) {
			this.data = data;
			next=null;
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
			Node lastNode = head;
			while(pointer!=null) {
				if(data.hashCode()==pointer.getData().hashCode()) {
					return;
				}
				lastNode=pointer;
				pointer=pointer.next;
				
			}
			lastNode.next=newNode;
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
		boolean result=false;
		if(pos<=length) {
			if(pos==1) {
				head=head.next;
				length--;
				return true;
			}
			int index=2;
			Node previous=head;
			Node pointer=head.next;
			while(index<pos) {
				previous=pointer;
				pointer=pointer.next;				
				index++;
			}
			previous.next=pointer.next;
			length--;
			return true;
		}		
		return result;
	}
	
	//Delete By Element
	public int deleteByElement(String data) {
		int index=1;
		if(head.getData().equals(data)) {
			head=head.next;
			length--;
			return index;
		}
		Node previous=null;
		Node pointer=head;
		while(pointer!=null) {
			if(pointer.getData().equals(data)) {
				previous.next=pointer.next;
				pointer=null;
				break;
			}
			previous=pointer;
			pointer=pointer.next;				
			index++;
		}
		if(index>length)
			return -1;
		length--;
		return index;
	}
}
