package com.ashish.imp;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueueList {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Queue q = new LinkedList();
        q.offer("B");
        q.offer("C");
        q.offer("D");
        System.out.println(q);

	}

}
