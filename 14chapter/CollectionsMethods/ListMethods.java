import java.util.*;

public class ListMethods{
	public static void main(String[] args){
	List<String> list = new ArrayList<>();
	list.add("jacob");
	list.add("Margaryta");
	list.add(1,"jacob");
	System.out.println("get method: "+list.get(1));
	System.out.println("removed: "+list.remove(2));
	System.out.println("set: "+list.set(1,"Margaryta"));
	list.replaceAll(x -> " replaceall" + x);
	list.forEach(System.out::println);
	}
}
