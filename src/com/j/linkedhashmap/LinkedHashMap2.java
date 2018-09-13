package com.j.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		//removing the value for key 2
		System.out.println("---Removing Value---");
		lhm.remove(2);
		for(Map.Entry m: lhm.entrySet())
		{
			System.out.println(m.getKey()+"\t"+m.getValue());
		}
		

	}

}
