package com.l.hashtable;

import java.util.Hashtable;
import java.util.Map;

public class BookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book(1,"Java","Bishnu","ABC",111);
		Book b2=new Book(2,"C","Bishnu","ABC",222);
		Book b3=new Book(3,"C++","Bishnu","ABC",333);
		
		Hashtable<Integer , Book> ht=new Hashtable<Integer,Book>();
		ht.put(8, b1);
		ht.put(9, b2);
		ht.put(0, b3);
		
		for(Map.Entry<Integer, Book> m:ht.entrySet())
		{
			int key=m.getKey();
			Book b=m.getValue();
			System.out.println(key+" Details: ");
			System.out.println(b.id+"\t"+b.bname+"\t"+b.auther+"\t"+b.publisher+"\t"+b.qty);
		}
		
		System.out.println("---After Removing---");
		ht.remove(9);
		for(Map.Entry<Integer, Book> m:ht.entrySet())
		{
			int key=m.getKey();
			Book b=m.getValue();
			System.out.println(key+" Details: ");
			System.out.println(b.id+"\t"+b.bname+"\t"+b.auther+"\t"+b.publisher+"\t"+b.qty);
		}
		

	}

}
