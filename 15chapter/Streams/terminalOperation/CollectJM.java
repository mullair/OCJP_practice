import java.util.*;
import java.util.TreeSet;
import java.util.List;
import java.util.stream.*;
public class CollectJM{
	public static void main(String[] args){
		Stream<String> stream = Stream.of("hi","du","bist","toll");
		StringBuilder s=stream.collect(StringBuilder::new,
				StringBuilder::append,
				StringBuilder::append);
		System.out.println(s);
		
		Stream<String> stream2 = Stream.of("hi","du","bist","toll");
		TreeSet s2=stream2.collect(TreeSet::new,
				TreeSet::add,
				TreeSet::addAll);
		System.out.println(s2);
	}

}
