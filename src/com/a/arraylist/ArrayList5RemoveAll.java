package com.a.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList5RemoveAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		al.add("Rup");
		al.add("Sanu");
		al.add("Bishnu");
		
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("1");
		al2.add("2");
		al.addAll(al2);
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		al.removeAll(al2);
		System.out.println("Iterating elements after removing elements of al2");
		Iterator itr1=al.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		

	}

}
