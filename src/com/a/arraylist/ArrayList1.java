package com.a.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al=new ArrayList<String>();
		System.out.println(al.size());
		al.add("Bishnu");
		al.add("Gupta");
		al.add("Bimala");
		al.add("Ruku");
		al.add("Rupa");
		al.add("Rubina");
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
