import java.util.stream.*;
import java.util.*;
public class Parallel{
	public static void main(String[] args){
		//Option 1 to make para. stream
		Stream<Integer> s1= List.of(1,2,3).stream();
		Stream<Integer> s2= s1.parallel();
		//Option 2 to make para. stream
		Stream<Integer> s3= List.of(1,2,3).parallelStream();
		//Performing parallel decomposition
		long start=System.currentTimeMillis();
		List.of(1,2,3,4,5,6,7,8,9)
			.parallelStream()
			.map(w->doWork(w))
			.forEach(s->System.out.println(s));
		var takenTime=(System.currentTimeMillis()-start)/1000;
		System.out.println("Time: "+takenTime);

	}
	private static int doWork(int input){
		try{
			Thread.sleep(5000);
		}catch(InterruptedException e){}
		return input;
	}
}

