package queueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {

	public static void main(String[] args) {

		Queue<Integer> str = new LinkedList<Integer>();

		str.offer(10);
		str.offer(20);
		str.offer(40);
		str.offer(1);

		System.out.println(str.peek());
		
		if (!str.isEmpty()) {
			System.out.println(str.poll());

		} else {
			System.out.println("Stop");

		}
		
		// TODO Auto-generated method stub

	}

}
