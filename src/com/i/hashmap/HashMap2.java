package com.i.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "Bishnu");
		hm.put(2, "Ruku");
		hm.put(3, "Rupa");
		hm.put(4, "Rubina");
		System.out.println("Values before remove"+hm);
		
		//remove value for key 2
		hm.remove(2);
		System.out.println("Values after remove: "+hm);
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+"\t"+m.getValue());
		}

	}

}
