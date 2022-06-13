package com.himansh.ds.lru;

public class DeQueue {
	private Node head;
	private Node tail;
	private int length;
	
	public DeQueue() {
		length = 0;
	}
	
	public Node add(int key, String data) {
		Node node = new Node(key, data);
		if (head == null) {
			head = node;
			tail = node;
		}
		else {
			tail.next = node;
			node.prev = tail;
			tail = node;
		}
		length++;
		return node;
	}
	
	public Node fetch() {
		if (head == tail) {
            Node node = head;
            head = null;
            return node;
        }
		Node node = head;
		head = head.next;
		head.prev = null;
		node.next = null;
		length--;
		return node;
	}
	
	private void addNode(Node node) {
		if (head == null) {
			head = node;
			tail = node;
		}
		else {
			tail.next = node;
			node.prev = tail;
			tail = node;
		}
	}
	
	public void removeNode(Node node) {
		if (head == null) {
			return;
		}
		else {
			Node prev = node.prev;
			Node next = node.next;
			if (prev != null)
				prev.next = next;
			else {
				head = next;
				head.prev = null;
			}
			if (next != null)
				next.prev = prev;
			else {
				tail = prev;
				tail.next = null;
			}
		}
		length--;
	}

	public Node moveToLast(Node node) {
		Node prev = node.prev;
		Node next = node.next;
		if (prev != null)
			prev.next = next;
		else {
			head = next;
			//head.prev = null;
		}
		if (next != null)
			next.prev = prev;
		else {
			tail = prev;
			//tail.next = null;
		}
		addNode(node);
		return node;
	}
	
	public int size() {
		return length;
	}

}
