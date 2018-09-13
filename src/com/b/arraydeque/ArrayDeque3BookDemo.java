package com.b.arraydeque;

import java.util.ArrayDeque;

public class ArrayDeque3BookDemo {

	public static void main(String[] args) {
		Book b1=new Book(1,"Java","Bishnu","ABC",123);
		Book b2=new Book(2,"C","Bishnu","XYZ",1234);
		Book b3=new Book(3,"C++","Bishnu","ABC",1235);
		Book b4=new Book(4,"PHP","Bishnu","XYZ",1236);
		
		ArrayDeque<Book> dq=new ArrayDeque<Book>();
		dq.add(b1);
		dq.add(b2);
		dq.add(b3);
		dq.add(b4);
		System.out.println("---Traversing Elements---");
		for(Book b:dq)
		{
			System.out.println(b.id+"\t"+b.bname+"\t"+b.auther+"\t"+b.publisher+"\t"+b.qty);
		}

	}

}
