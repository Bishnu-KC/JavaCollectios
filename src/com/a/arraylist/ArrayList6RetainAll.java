package com.a.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList6RetainAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();  
		  al.add("Ruku");  
		  al.add("Rupa");  
		  al.add("Rubina"); 
		  
		  ArrayList<String> al2=new ArrayList<String>();  
		  al2.add("Ruku");  
		  al2.add("Bishnu");
		  al.retainAll(al2);
		  
		  System.out.println("Iterating all the elements after reatining the element of al2");
		  Iterator itr=al.iterator();
		  while(itr.hasNext())
		  {
			  System.out.println(itr.next());
		  }
		  
		  
		

	}

}
