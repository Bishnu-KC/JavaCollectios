package com.e.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet2BookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book(1,"Java","Bishnu","ABC",100);
		Book b2=new Book(2,"C","Ruku","XYZ",200);
		Book b3=new Book(3,"C++","Rupa","MNO",300);
		Book b4=new Book(4,"Python","Rubina","PQR",400);
		
		HashSet<Book> hs=new HashSet<Book>();
		hs.add(b1);
		hs.add(b2);
		hs.add(b3);
		hs.add(b4);
		System.out.println("---Size---");
		System.out.println("Size: "+hs.size());
		System.out.println("Elements: "+hs);
		System.out.println();
		System.out.println("---Traversing using For Each Loop---");
		System.out.println("ID"+"\t"+"Name"+"\t"+"Author"+"\t"+"Publisher"+"\t"+"QTY");
		for(Book b:hs)
		{
			System.out.println(b.id+"\t"+b.name+"\t"+b.author+"\t"+b.publisher+"\t\t"+b.quantity);
		}
		/*
		System.out.println("---Traversing using Iterator---");
		Iterator itr=hs.iterator();
		System.out.println("ID"+"\t"+"Name"+"\t"+"Author"+"\t"+"Publisher"+"\t"+"QTY");
		while(itr.hasNext())
		{
			System.out.println(itr.id+"\t"+itr.name+"\t"+itr.author+"\t"+itr.publisher+"\t\t"+itr.quantity);
		}
		*/

	}

}
