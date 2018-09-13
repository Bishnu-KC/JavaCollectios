package com.l.hashtable;

import java.util.Hashtable;
import java.util.Map;

public class HashTable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> ht=new Hashtable<Integer, String>();
		ht.put(1, "Java");
		ht.put(2, "C");
		ht.put(3, "C++");
		System.out.println("Size: "+ht.size());
		System.out.println("Elements: "+ht);
		
		for(Map.Entry m: ht.entrySet())
		{
			System.out.println(m.getKey()+"\t"+m.getValue());
		}
		
		System.out.println("---After Removing---");
		ht.remove(2);
		for(Map.Entry m: ht.entrySet())
		{
			System.out.println(m.getKey()+"\t"+m.getValue());
		}
		

	}

}
