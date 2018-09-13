package com.f.linkedhashset;

import java.util.LinkedHashSet;

public class LinkHashSet2BookDemo {
	public static void main(String[] args) {
		Book b1=new Book(1,"Java","Bishnu","ABC",100);
		Book b2=new Book(2,"C","Bishnu","ABC",100);
		Book b3=new Book(3,"C++","Bishnu","ABC",100);
		Book b4=new Book(4,"Python","Bishnu","ABC",100);
		LinkedHashSet<Book> lhs=new LinkedHashSet<Book>();
		lhs.add(b1);
		lhs.add(b2);
		lhs.add(b3);
		lhs.add(b4);
		System.out.println("---Traversing using For Each Loop---");
		System.out.println("ID"+"\t"+"Name"+"\t"+"Author"+"\t"+"Publisher"+"\t"+"QTY");
		for(Book b:lhs)
		{
			System.out.println(b.id+"\t"+b.name+"\t"+b.author+"\t"+b.publisher+"\t\t"+b.quantity);
		}
	
	}

}
