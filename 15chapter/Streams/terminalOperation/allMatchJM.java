import java.util.*;
import java.util.function.*;
import java.util.List;
import java.util.stream.*;
public class allMatchJM{
	public static void main(String[] args){
		Stream<String> str = Stream.generate(()->"Jacob");
		Predicate<String> pred = (s)->s.startsWith("J");
		System.out.println(str.allMatch(pred));

	}
}
