package com.h.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap2OldWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m=new HashMap();
		
		m.put(1, "Bishnu");
		m.put(2, "Ruku");
		m.put(3, "Rupa");
		m.put(4, "Rubina");
		
		//traversing  Map
		Set s=m.entrySet(); //converting to Set so that we can traverse
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			//converting to m.Entry so that we can get key and value separately
			Map.Entry e=(Map.Entry)itr.next();
			System.err.println(e.getKey()+"\t"+e.getValue());
		}
		

	}

}
