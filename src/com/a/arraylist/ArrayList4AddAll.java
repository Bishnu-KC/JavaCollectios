package com.a.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList4AddAll {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Gupta");
		al.add("Bimala");
		al.add("Bishnu");
		al.add("Bishnu");
		
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("Ruku");
		al2.add("Rupa");
		al2.add("Rubina");
		//adding second list in first list
		al.addAll(al2);
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
