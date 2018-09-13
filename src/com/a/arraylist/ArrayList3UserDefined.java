package com.a.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList3UserDefined {
	public static void main(String[] args) {
		
		//creating user defined class objects
		Student std=new Student(1,"Bishnu",16);
		Student std1=new Student(2,"Ruku",17);
		Student std2=new Student(3,"Rupa",18);
		Student std3=new Student(4,"Rubina",19);
		
		//creating an arraylist
		ArrayList<Student> al=new ArrayList<Student>();
		System.out.println("Size of arraylist: "+al.size());
		System.out.println("Elements of arraylist:"+al);
		
		//adding Student class Object
		al.add(std);
		al.add(std1);
		al.add(std2);
		al.add(std3);
		System.out.println("Size of arraylist: "+al.size());
		System.out.println("Elements of arraylist:"+al);
		
		//Getting iterator
		Iterator itr=al.iterator();
		System.out.println("RollNo"+" \t"+"Name"+" \t"+"Age");
		while(itr.hasNext())
		{
			Student st=(Student)itr.next();
			System.out.println(st.rollno+" \t"+st.name+" \t"+st.age);
		}
		
	}

}
