import java.util.*;
import java.util.TreeSet;
import java.util.List;
import java.util.stream.*;
public class CollectMaps{
	public static void main(String[] args){
		var ohMy=Stream.of("tiger","bear","Margo");
		Map <Integer,String> map = ohMy.collect(Collectors
				.toMap(String::length,s->s,(x,y)-> x +" "+ y,TreeMap::new));
		System.out.println(map);
		System.out.println(map.getClass());

	}
}
