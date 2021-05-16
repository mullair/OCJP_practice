import java.util.*;
public class QueueMethods{
	public static void main(String[] args){
		Queue<Integer> queue = new LinkedList<>();
		System.out.println(queue.offer(1));
		System.out.println(queue.add(2));
		System.out.println(queue.offer(3));
		System.out.println(queue.element());
		System.out.println(queue.element());
		System.out.println(queue.element());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
	}
}
