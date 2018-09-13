package com.a.arraylist;

import java.util.ArrayList;

public class ArrayList7Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Book b=new Book(1,"Java","Bishnu","ABC",100);
		Book b1=new Book(2,"POM","Ruku","XYZ",150);
		Book b2=new Book(3,"Finance","Rupa","PQR",200);
		//Book b3=new Book(4,"Cardiology","Rubina","MNO",250);
		//creating book of list
		ArrayList<Book> al=new ArrayList<Book>();
		
		//Adding Books to list
		al.add(b);
		al.add(b1);
		al.add(b2);
		//al.add(b3);
		
		//traversing list
		System.out.println("ID"+"\t"+"Book Name"+"\t"+"Author"+"\t"+"Publisher"+"\t"+"Quantity");
		for(Book bk:al)
		{
			System.out.println(bk.id+"\t"+bk.name+"\t\t"+bk.author+"\t"+bk.publisher+"\t\t"+bk.quantity);
		}

	}

}
