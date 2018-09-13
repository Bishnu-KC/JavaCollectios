package com.j.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMap1 {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lhm=new LinkedHashMap<Integer,String>();
		lhm.put(1, "Java");
		lhm.put(2, "C");
		lhm.put(3, "C++");
		lhm.put(4, "Python");
		System.out.println("Size: "+lhm.size());
		System.out.println("Elements: "+lhm);
		
		// traversing 
		for(Map.Entry m: lhm.entrySet())
		{
			System.out.println(m.getKey()+"\t"+m.getValue());
		}
	}

}
