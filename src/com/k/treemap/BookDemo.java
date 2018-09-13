package com.k.treemap;

import java.util.Map;
import java.util.TreeMap;

public class BookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book(1,"Java","Bishnu","ABC",10);
		Book b2=new Book(2,"AWS","Bishnu","ABC",110);
		Book b3=new Book(3,"AJ4","Bishnu","ABC",120);
		
		TreeMap<Integer,Book> tm=new TreeMap<Integer,Book>();
		tm.put(4,b1);
		tm.put(5,b2);
		tm.put(6,b3);
		
		for(Map.Entry<Integer,Book> m:tm.entrySet())
		{
			int key=m.getKey();
			Book b=m.getValue();
			System.out.println(b.id+"\t"+b.bname+"\t"+b.auther+"\t"+b.publisher+"\t"+b.qty);
		}

	}

}
