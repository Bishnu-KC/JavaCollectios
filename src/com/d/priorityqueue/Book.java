package com.d.priorityqueue;

public class Book implements Comparable<Book>{
	int id;
	String name,auther,publisher;
	int quantity;

	public Book(int id, String name, String auther, String publisher, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.auther = auther;
		this.publisher = publisher;
		this.quantity = quantity;
	}

	@Override
	public int compareTo(Book b) {
		if(id>b.id)
		{
			return 1;
			
		}
		else if(id<b.id)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

}
