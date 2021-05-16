import java.util.function.*;
import java.util.*;

public class Sorter{
	public static void main(String ... args){
	var list=new ArrayList<Integer>();
	list.add(1);
	list.add(3);
	list.add(5);
	list.add(2);
	System.out.println(list);
	Consumer<List<Integer>> list2=a->Collections.sort(a);
	list2.accept(list);
	System.out.println(list);
	}
}
