import java.util.*;
public class ArrayListExp{
	public static void main(String... args){
		ArrayList<Object> list=new ArrayList<>();
		list.add("hi");
		list.add(5);
		list.add((short) 0,66);
		
		System.out.println(list.remove("hi"));
		System.out.println(list.remove(0));
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		System.out.println(list.set(0,"set me set you"));
		System.out.println(list);
		list.clear();
		System.out.println(list.isEmpty());
	}
}
