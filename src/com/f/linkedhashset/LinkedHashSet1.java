package com.f.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {
	public static void main(String[] args) {
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		System.out.println("---Size---");
		System.out.println("Size: "+lhs.size());
		System.out.println("Elements: "+lhs);
		
		System.out.println("---After Populating---");
		lhs.add("Bishnu");
		lhs.add("Ruku");
		lhs.add("Rupa");
		lhs.add("Rubina");
		System.out.println("Size: "+lhs.size());
		System.out.println("Elements: "+lhs);
		
		System.out.println("---Traversing using For Each loop---");
		System.out.println("Name");
		for(String str:lhs)
		{
			System.out.println(str);
		}
	}

}
