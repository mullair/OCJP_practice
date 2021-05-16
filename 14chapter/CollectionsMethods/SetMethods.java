import java.util.*;

public class SetMethods{
	public static void main(String[] args){
		Set<String> set = new HashSet<>();
		set.add("hi");
		set.add("bla");
		System.out.println(set.remove("bla"));
		Set<String> of = Set.of("hi","jacob");
		of.forEach(System.out::println);

		set.forEach(System.out::println);
		Set.copyOf(set);
	}
}

