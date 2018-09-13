package com.c.linkedlist;

import java.util.LinkedList;

public class LinkedList2Book {
	public static void main(String[] args) {
		// creating Books
		Book b1=new Book(1,"Java","Bishnu","ABC",123);
		Book b2=new Book(2,"C","Ruku","XYZ",456);
		Book b3=new Book(3,"C++","Rupa","MNO",789);
		Book b4=new Book(4,"C++","Rubina","PQR",012);
		
		//creating list for Books
		LinkedList<Book> ll=new LinkedList<Book>();
		
		//Adding Book to list
		ll.add(b1);
		ll.add(b2);
		ll.add(b3);
		ll.add(b4);
		
		//Traversing list
		System.out.println("ID"+"\t"+"Book"+"\t"+"Auther"+"\t"+"Publisher"+"\t"+"Quantity");
		for(Book b:ll)
		{
			System.out.println(b.id+"\t"+b.name+"\t"+b.author+"\t"+b.publisher+"\t\t"+b.quantity);
		}
		
	}

}
