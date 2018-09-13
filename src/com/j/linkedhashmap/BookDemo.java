package com.j.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class BookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book(1,"Java","Bishnu","ABC",10);
		Book b2=new Book(2,"C","Bishnu","ABC",10);
		Book b3=new Book(3,"C++","Bishnu","ABC",10);
		
		LinkedHashMap<Integer, Book> lhm=new LinkedHashMap<Integer, Book>();
		lhm.put(4, b1);
		lhm.put(5, b2);
		lhm.put(6, b3);
		System.out.println("Size: "+lhm.size());
		System.out.println("Elements: "+lhm);
		for(Map.Entry<Integer, Book> m:lhm.entrySet())
		{
			int key=m.getKey();
			Book b=m.getValue();
			System.out.println(key+" Details:");
			System.out.println(b.id+"\t"+b.bname+"\t"+b.auther+"\t"+b.publisher+"\t"+b.qty);
			
		}

	}

}
