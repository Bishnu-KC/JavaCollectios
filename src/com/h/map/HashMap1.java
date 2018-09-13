package com.h.map;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(1,"Bishnu");
		m.put(2,"Ruku");
		m.put(3,"Rupa");
		m.put(4,"Rubina");
		
		for(Map.Entry m1:m.entrySet())
		{
			System.out.println(m1.getKey()+"\t"+m1.getValue());
		}

	}

}
