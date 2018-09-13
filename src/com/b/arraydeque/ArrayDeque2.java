package com.b.arraydeque;

import java.util.ArrayDeque;

public class ArrayDeque2 {
	public static void main(String[] args) {
		ArrayDeque<String> dq=new ArrayDeque<String>();
		dq.offer("Gupta");
		dq.offer("Bimala");
		dq.add("Bishnu");
		dq.offerFirst("Ruku");
		System.out.println("---After offerFirst Traversal---");
		for(String str:dq)
		{
			System.out.println(str);
		}
		dq.pollLast();
		System.out.println("---After pollLast() Traversal---");
		for(String str:dq)
		{
			System.out.println(str);
		}
		
	}

}
