import java.util.*;
import java.util.TreeSet;
import java.util.List;
import java.util.stream.*;
public class FlatMapJM{
	public static void main(String[] args){
		var test = List.of("hi","my","name","is");
		Stream<String> teststr=test.stream();
		teststr.forEach(System.out::println);	

		List<String> zero = List.of();
		var one = List.of("1","2");
		var three = List.of("3","4");
		Stream<List<String>> stream = Stream.of(zero,one,three);
		stream.flatMap(m->m.stream())
				.forEach(System.out::println);

	}
}
