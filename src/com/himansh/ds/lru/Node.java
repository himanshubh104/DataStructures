package com.himansh.ds.lru;

public class Node {
	public Node prev;
	private int key;
	private String data;
	public Node next;
	
	public Node(int key, String data) {
		this.data = data;
		this.key = key;
		next=null;
		prev=null;
	}
	public String getData() {
		return data;
	}
	public int getKey() {
		return key;
	}
	
}
