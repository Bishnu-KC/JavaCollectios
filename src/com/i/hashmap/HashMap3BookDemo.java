package com.i.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMap3BookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Book> hm=new HashMap<Integer,Book>();
		Book b1= new Book(1,"Java","Bishnu","ABC",10);
		Book b2= new Book(2,"C","Bishnu","ABC",100);
		Book b3= new Book(3,"C++","Bishnu","ABC",110);
		Book b4= new Book(4,"Python","Bishnu","ABC",120);
		
		hm.put(1, b1);
		hm.put(2, b2);
		hm.put(3, b3);
		hm.put(4, b4);
		
		//traversing map
		
		for(Map.Entry<Integer,Book> e:hm.entrySet())
		{
			int key =e.getKey();
			Book b=e.getValue();
			System.out.println(key+" Details:");
			System.out.println(b.id+"\t"+b.bname+"\t"+b.auther+"\t"+b.publisher+"\t"+b.qty);
		}
		

	}

}
