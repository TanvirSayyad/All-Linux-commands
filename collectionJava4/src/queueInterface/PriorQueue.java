package queueInterface;

import java.util.PriorityQueue;

public class PriorQueue {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.offer(1);
		pq.offer(4);
		pq.offer(3);
		pq.offer(2);
		System.out.println(pq);// [1, 2, 3, 4]
		if (!pq.isEmpty()) {

			System.out.println("removed" + pq.poll());// removed 1
			System.out.println("add new " + pq.offer(10));// [2, 4, 3, 10]
			System.out.println(pq);
			System.out.println(pq.peek());// 2
		}

//Output

//add new true


	}

}
