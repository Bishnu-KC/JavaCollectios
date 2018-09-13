package com.c.linkedlist;

import java.util.ArrayList;

public class BookDemoListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookDemo b1=new BookDemo(1,11,"Java","Bishnu","ABC");
		BookDemo b2=new BookDemo(2,22,"C","Ruku","XYZ");
		BookDemo b3=new BookDemo(3,33,"C++","Rupa","MNO");
		
		ArrayList<BookDemo> al=new ArrayList<BookDemo>();
		al.add(b1);
		al.add(b2);
		al.add(b3);
		
		//traversing list
		for(BookDemo b:al)
		{
			System.out.println(b.id+"\t "+b.quantity+" \t"+b.name+"\t "+b.author+" \t"+b.publisher);
		}

	}

}
