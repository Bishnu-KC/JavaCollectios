package com.c.linkedlist;

import java.util.ArrayList;

public class ListDemo {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Bishnu");
		al.add("Ruku");
		al.add("Rupa");
		al.add(1,"Rubina");
		System.out.println("Element at 2nd position: "+al.get(2));
		for(String s:al)
		{
			System.out.println("Name:"+s);
		}
	}

}
