package com.g.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args) {
		System.out.println("---Implementing TeeSet Class---");
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Bishnu");
		ts.add("Ruku");
		ts.add("Rupa");
		ts.add("Rubina");
		System.out.println("---Traversing using iterator---");
		System.out.println("Name");
		Iterator itr=ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println();
		System.out.println("---Traversing using For Each loop---");
		System.out.println("Name");
		for(String str:ts)
		{
			System.out.println(str);
		}
	}

}
