package com.c.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Bishnu");
		ll.add("Ruku");
		ll.add("Rupa");
		ll.add("RUbina");
		System.out.println("Size: "+ll.size());
		System.out.println("Elements: "+ll);
		
		//traversing 
		for(String str:ll)
		{
			System.out.println("Name: "+str);
		}
		
		//traversing
		System.out.println("---Using Iterator method---");
		Iterator itr=ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
