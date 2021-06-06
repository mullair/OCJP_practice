import java.util.concurrent.*;
import java.util.*;
public class CopyOnWrite{
	public static void main(String[] args){
		List<Integer> favNumbers=new CopyOnWriteArrayList<>(List.of(1,2,3));
		for(Integer n:favNumbers){
			System.out.print(n+" ");
			favNumbers.add(9);
		}
		System.out.println();
		System.out.println("Size: "+favNumbers.size());

		// same with arrayset
		Set<Integer> favNumbers2=new CopyOnWriteArraySet<>(Set.of(1,2,3));
		for(Integer n:favNumbers2){
			System.out.print(n+" ");
			favNumbers.add(9);
		}
		System.out.println();
		System.out.println("Size: "+favNumbers2.size());

		// LinkedBlockingQueue
		try{
		var blockingQueue = new LinkedBlockingQueue<Integer>();
		blockingQueue.offer(12);
		blockingQueue.offer(3,4,TimeUnit.SECONDS);
		System.out.println(blockingQueue.poll());
		System.out.println(blockingQueue.poll(10,TimeUnit.MILLISECONDS));
		}catch(InterruptedException e){}


	}
}
