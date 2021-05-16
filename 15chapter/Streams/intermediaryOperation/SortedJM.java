import java.util.*;
import java.util.TreeSet;
import java.util.List;
import java.util.stream.*;
public class SortedJM{
	public static void main(String[] args){
		Stream<String> s = Stream.of("hi","a","b","ab","c");
		s.sorted(Comparator.reverseOrder())
			.peek(x->System.out.println(x+"peek"))
			.forEach(System.out::println);

	}
}
