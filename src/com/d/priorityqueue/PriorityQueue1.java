package com.d.priorityqueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue1 {
	public static void main(String[] args) {
		PriorityQueue<String> pq=new PriorityQueue<String>();
		pq.add("Bishnu");
		pq.add("Ruku");
		pq.add("Rupa");
		pq.add("Rubina");
		System.out.println("Size: "+pq.size());
		System.out.println("Head: "+pq.element());
		System.out.println("Head: "+pq.peek());
		System.out.println("---Traversing queue Using Iterator");
		Iterator itr=pq.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		pq.remove();
		pq.poll();
		System.out.println("---After removing two elements---");
		Iterator<String> itr1=pq.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
	}

}
