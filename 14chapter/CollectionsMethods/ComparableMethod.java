import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ComparableMethod implements Comparable<ComparableMethod>{
	private String name;
	public ComparableMethod(String name){this.name=name;}
	public String toString(){
		return name;
	}
	public int compareTo(ComparableMethod comp){
		return name.compareTo(comp.name);
	}

	public static void main(String... args){
		List<ComparableMethod> list= new ArrayList<>();
		list.add(new ComparableMethod("A"));
		list.add(new ComparableMethod("B"));
		list.add(new ComparableMethod("c"));
		list.add(new ComparableMethod("D"));
		Collections.sort(list);
		list.forEach(System.out::println);
	}
}

