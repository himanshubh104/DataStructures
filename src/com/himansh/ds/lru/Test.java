package com.himansh.ds.lru;

public class Test {

	public static void main(String[] args) {
		LRUCache lRUCache = new LRUCache(2);
//		lRUCache.put(1, "1"); // cache is {1=1}
//		lRUCache.put(2, "2"); // cache is {1=1, 2=2}
//		System.out.println(lRUCache.get(1));    // return 1
//		lRUCache.put(3, "3"); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
//		System.out.println(lRUCache.get(2));    // returns -1 (not found)
//		lRUCache.put(4, "4"); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
//		System.out.println(lRUCache.get(1));    // return -1 (not found)
//		System.out.println(lRUCache.get(3));    // return 3
//		System.out.println(lRUCache.get(4));    // return 4
		
		//["LRUCache","get","put","get","put","put","get","get"]
    	System.out.println(lRUCache.get(2));    
    	lRUCache.put(2,"6");
    	System.out.println(lRUCache.get(1));   
    	lRUCache.put(1,"5"); 
    	lRUCache.put(1,"2"); 
    	System.out.println(lRUCache.get(1));  
    	lRUCache.put(2,"8");
    	System.out.println(lRUCache.get(2));    
	}

}