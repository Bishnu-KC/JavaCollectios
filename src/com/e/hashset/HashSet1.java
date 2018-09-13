package com.e.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs=new HashSet<String>();
		System.out.println("Size: "+hs.size());
		System.out.println("Elements: "+hs);
		hs.add("Bishnu");
		hs.add("Ruku");
		hs.add("Rupa");
		hs.add("Rubina");
		System.out.println("---After Poupulating Elements---");
		System.out.println("Size: "+hs.size());
		System.out.println("Elements: "+hs);
		System.out.println("---Traversing using iterator---");
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println("Name: "+itr.next());
		}
		System.out.println();
		System.out.println("---Traversing using for each loop---");
		for(String str:hs)
		{
			System.out.println("Name: "+str);
		}
		

	}

}
