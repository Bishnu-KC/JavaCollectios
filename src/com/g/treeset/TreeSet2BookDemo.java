package com.g.treeset;

import java.util.TreeSet;

public class TreeSet2BookDemo {
	public static void main(String[] args) {
		TreeSet<Book> ts=new TreeSet<Book>();
		Book b1=new Book(1,"Java","Bishnu","ABC",5);
		Book b2=new Book(2,"C","Bishnu","XYZ",15);
		Book b3=new Book(3,"C++","Bishnu","ABC",25);
		Book b4=new Book(4,"Python","Bishnu","XYZ",35);
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		
		System.out.println("---Traversing TreeSet---");
		for(Book b:ts)
		{
			System.out.println(b.id+"\t"+b.name+"\t"+b.author+"\t"+b.publisher+"\t"+b.quantity);
		}
	}

}
