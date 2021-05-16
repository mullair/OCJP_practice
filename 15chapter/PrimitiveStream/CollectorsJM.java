import java.util.*;
import java.util.TreeSet;
import java.util.List;
import java.util.stream.*;
public class CollectorsJM{
	public static void main(String[] args){
		var ohMy = Stream.of("lion","bear","tiger");
		//String result = ohMy.collect(Collectors.joining(" , "));
		//Double result = ohMy.collect(Collectors.averagingInt(String::length));
		TreeSet<String> result = ohMy.collect(Collectors.toCollection(TreeSet::new));

		System.out.println(result);

	}
}
