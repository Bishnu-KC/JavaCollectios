package com.i.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "Bishnu");
		hm.put( 2,"Ruku");
		hm.put(3, "Rupa");
		hm.put(4, "Rubina");
		hm.put(1, "Bishnu");
		
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+"\t"+m.getValue());
		}

	}

}
