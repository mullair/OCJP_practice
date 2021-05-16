import java.util.*;
import java.util.function.*;
public class ListJM{
	public static void main(String[] args){
	String[] list=new String[]{"hi","there"};
	// AsList block
	List<String> asList= Arrays.asList(list);
	asList.set(0,"Set in asList");
	asList.forEach(System.out::println);
	list[1]="ArrayInput";
	asList.forEach(System.out::println);

	// List.of method
	List<String> of = List.of(list);
	list[0]="after Of creation";
	of.forEach(System.out::println);

	// copy method
	List<String> copy = List.copyOf(asList);
	copy.forEach(System.out::println);
}
}

