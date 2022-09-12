package javacore.demo.map;

import java.util.Hashtable;

public class HashTable {
	public static void main(String[] args) {
		Hashtable<Integer, String> tb = new Hashtable<>(10);
		tb.put(100, "Bao Y");
		tb.put(259, "Bao Nhu");
		tb.put(256, "Bao Bao");
		tb.put(565, "Minh Minh");
		
//		tb.remove(569);
		
		for (Integer key : tb.keySet()) {
			System.out.println(key.hashCode() % 10 + "\t"+  key + "\t" + tb.get(key));
		}
		
	}
}
