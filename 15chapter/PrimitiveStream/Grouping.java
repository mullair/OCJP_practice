import java.util.*;
import java.util.TreeSet;
import java.util.List;
import java.util.stream.*;
public class Grouping{
	public static void main(String[] args){
		var ohMy=Stream.of("tiger","bear","Margo");
		TreeMap <Integer,Set<String>> map = ohMy.collect(Collectors.groupingBy(String::length,
				TreeMap::new,Collectors.toSet()));
		System.out.println(map);
		System.out.println(map.getClass());

	}
}
