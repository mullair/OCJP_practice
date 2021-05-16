import java.util.*;
import java.util.TreeSet;
import java.util.List;
import java.util.stream.*;
public class MapJM{
	public static void main(String[] args){
		Stream<String> stream= Stream.of("hi","moin","guten Tag","Servus");
		stream.map((s)->s+ " Jacob, wie gehts?")
			.map(String::length)
			.forEach(System.out::println);
	}
}
