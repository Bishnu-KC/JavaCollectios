package com.d.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueue2BookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Book> pq=new PriorityQueue<Book>();
		Book b1=new Book(1,"Java","Bishnu","ABC",123);
		Book b2=new Book(2,"C","Bishnu","ABC",123);
		Book b3=new Book(3,"C++","Bishnu","ABC",123);
		Book b4=new Book(4,"Python","Bishnu","ABC",123);
		pq.add(b1);
		pq.add(b2);
		pq.add(b3);
		pq.add(b4);
		System.out.println("--Traversing using for each loop---");
		for(Book b:pq)
		{
			System.out.println(b.id+"\t"+b.name+"\t"+b.auther+"\t"+b.publisher+"\t"+b.quantity);
		}
		System.out.println("---After Removing one Record---");
		pq.remove();
		for(Book b:pq)
		{
			System.out.println(b.id+"\t"+b.name+"\t"+b.auther+"\t"+b.publisher+"\t"+b.quantity);
		}

	}

}
