package com.b.arraydeque;

import java.util.ArrayDeque;

public class ArrayDeque1 {
	public static void main(String[] args) {
		ArrayDeque<String> dq=new ArrayDeque<String>();
		dq.add("Bishnu");
		dq.add("Ruku");
		dq.add("Rupa");
		dq.add("Rubina");
		System.out.println("---Traversing elements---");
		System.out.println("Name");
		for(String str:dq)
		{
			System.out.println(str);
		}
	}

}
