package com.c.linkedlist;
import java.util.*;
public class LinkedAndArrayList {

	public static void main(String[] args) {
		// creating arraylist
		List<String> al=new ArrayList<String>();
		al.add("Bishnu");
		al.add("Ruku");
		al.add("Bishnu");
		al.add("Rupa");
		al.add("Rubina");
		
		List<String> ll=new LinkedList<String>();
		ll.add("Yaman");
		ll.add("Bhagwat");
		ll.add("Bishal");
		ll.add("Bikash");
		
		System.out.println("ArrayList: "+al);
		System.out.println("LinkedList: "+ll);
		
		for(String str:al)
		{
			System.out.println("Name: "+str);
		}
		
		System.out.println();
		Iterator itr=ll.iterator();
		while(itr.hasNext())
		{
			System.out.println("Name: "+itr.next());
		}
	}

}
