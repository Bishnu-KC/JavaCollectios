package com.k.treemap;

import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		System.out.println("---After Removing---");
		tm.remove(2);
		for(Entry<Integer, String> m: tm.entrySet())
		{
			System.out.println(m.getKey()+"\t"+m.getValue());
		}

	}

}
