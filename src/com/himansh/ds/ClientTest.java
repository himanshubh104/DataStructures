package com.himansh.ds;

import com.himansh.ds.doublyLinkedList.DoublyLinkedList;
import com.himansh.ds.linkedList.LinkedList;
import com.himansh.ds.set.LinkedSet;

public class ClientTest {

	public static void main(String[] args) {
		ClientTest test=new ClientTest();
		//test.playWithSet();
		test.playWithLinkedList();
		//test.playWithDoublyLinkedList();
	}
	
	void playWithLinkedList() {
		LinkedList mList=new LinkedList();
		mList.insert("Martin");
		mList.insert("Sam");
		mList.insert("Ron");
		mList.insert("Josh");
		mList.insert("Mike");
		System.out.println("list: "+mList);
		System.out.println("length: "+mList.length());
		System.out.println("Reversed List: "+mList.reverse());
		System.out.println("Get Element and Position: "+mList.getElementByPos(2)+" "+mList.getElementPos(mList.getElementByPos(2)));
		System.out.println("\nDeleting Element...");
		if(mList.deleteByPos(3)) {
			System.out.println("list: "+mList);
			System.out.println("length: "+mList.length());
		}
		System.out.println("\nDeleting Element At "+mList.deleteByElement("Mike"));
		System.out.println(mList);
	}
	
	void playWithDoublyLinkedList() {
		DoublyLinkedList mList=new DoublyLinkedList();
		mList.insert("Martin");
		mList.insert("Sam");
		mList.insert("Ron");
		mList.insert("Josh");
		mList.insert("Mike");
		System.out.println("list: "+mList);
		System.out.println("length: "+mList.length());
		System.out.println("Get Element and Position: "+mList.getElementByPos(2)+" "+mList.getElementPos(mList.getElementByPos(2)));
		System.out.println("\nDeleting Element...");
		if(mList.deleteByPos(3)) {
			System.out.println("list: "+mList);
			System.out.println("length: "+mList.length());
		}
		System.out.println("\nDeleting Element At "+mList.deleteByElement("Mike"));
		System.out.println(mList);
	}
	
	void playWithSet() {
		LinkedSet mList=new LinkedSet();
		mList.insert("Martin");
		mList.insert("Sam");
		mList.insert("Ron");
		mList.insert("Sam");
		mList.insert("Sam");
		mList.insert("Mike");
		mList.insert("June");
		mList.insert("Martin");
		mList.insert("James");
		mList.insert("James");
		System.out.println("Set: "+mList);
		System.out.println("length: "+mList.length());
		System.out.println("Get Element and Position: "+mList.getElementByPos(2)+" "+mList.getElementPos(mList.getElementByPos(2)));
		System.out.println("\nDeleting Element...");
		if(mList.deleteByPos(3)) {
			System.out.println("Set: "+mList);
			System.out.println("length: "+mList.length());
		}
		System.out.println("\nDeleting Element At "+mList.deleteByElement("Mike"));
		System.out.println(mList);
	}

}
