import java.util.*;
import java.util.TreeSet;
import java.util.List;
import java.util.stream.*;
public class Paritioning{
	public static void main(String[] args){
		var ohMy=Stream.of("tiger","bear","Margo");
		Map<Boolean,Set<String>> map=ohMy.collect(Collectors.partitioningBy(s->s.length()>4,Collectors.toSet()));
		System.out.println(map);
		System.out.println(map.getClass());

	}
}
