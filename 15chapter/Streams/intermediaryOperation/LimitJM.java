import java.util.*;
import java.util.TreeSet;
import java.util.List;
import java.util.stream.*;
public class LimitJM{
	public static void main(String[] args){
		Stream<String> stream = Stream.generate(()->"jacob"); 
		stream.limit(5)
			.distinct()
			.forEach(System.out::println);

		Stream<Integer> stream2 = Stream.iterate(1,(n)->n<100,n-> n+1);
		stream2.skip(5)
			.forEach(System.out::println);
	}
}
