package com.a.arraylist;

import java.util.ArrayList;

public class ArrayList2ForEach {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		System.out.println("Size of Array before adding data: "+al.size());
		al.add("Bishnu");
		al.add("Ruku");
		al.add("Rupa");
		al.add("Rubina");
		System.out.println("Size of array after inserting data: "+al.size());
		System.out.println("Elements of array: "+al);
		
		//using for each loop to traverse the collection
		for(String str:al)
		{
			System.out.println("Name: "+str);
		}
	}

}
