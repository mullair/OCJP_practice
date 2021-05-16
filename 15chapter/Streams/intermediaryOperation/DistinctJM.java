import java.util.*;
import java.util.TreeSet;
import java.util.List;
import java.util.stream.*;
public class DistinctJM{
	public static void main(String[] args){
		Stream<String> stream = Stream.of("hi","a","a","b","c");
		stream.distinct()
			.filter((s)->s.substring(0,1).equals("a"))
			.forEach(System.out::println);
	}
}
