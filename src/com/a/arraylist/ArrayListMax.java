package com.a.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println(al.size());
		al.add(4);
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(25);
		al.add(30);
		System.out.println("Maximum :"+Collections.max(al));
		System.out.println("Minimum :"+Collections.min(al));
		System.out.println(al);
		System.out.println(al.size());
		//Traversing list through Iterator
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			//System.out.println(al);
		}
		System.out.println(al.size());

	}

}
