package com.k.treemap;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMap1 {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm=new TreeMap<Integer,String>();
		tm.put(1, "Java");
		tm.put(2, "AWS");
		tm.put(3, "Python");
		System.out.println("Size: "+tm.size());
		System.out.println("Elemtnts: "+tm);
		
		//traversing the elements
		for(Entry<Integer, String> m: tm.entrySet())
		{
			System.out.println(m.getKey()+"\t"+m.getValue());
		}
		
	}

}
