package com.himansh.ds.lru;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
	private final Map<Integer,Node> lruMap;
    private DeQueue lruQueue;
    private int capacity;

    public LRUCache(int capacity) {
    	this.capacity = capacity;
    	lruQueue = new DeQueue();
    	lruMap = new HashMap<>(capacity);
    }
    
    public String get(int key) {
    	Node node = lruMap.get(key);
    	if (node==null) return "-1";
    	lruQueue.moveToLast(node);
    	return node.getData();
    }
    
    public void put(int key, String value) {
    	if (lruMap.containsKey(key)) {
    		Node node = lruMap.get(key);
    		lruQueue.removeNode(node);
    	}
    	else if (lruQueue.size() >= capacity) {
        	Node oldNode = lruQueue.fetch();
        	lruMap.remove(oldNode.getKey());
        }
        Node node = lruQueue.add(key,value);
    	lruMap.put(key,node);
    }
}
