import java.util.*;
import java.util.function.*;
public class General{
	public static void main(String[] args){
	Collection<String> birds = new ArrayList<>();
	System.out.println(birds.isEmpty());
	System.out.println(birds.size());
	birds.add("h1");
	birds.add("h2");
	birds.add("h3");
	birds.add("h4");
	birds.add("b5");
	birds.add("h6");
	System.out.println(birds.contains("h1"));
	birds.remove("h1");
	birds.forEach(System.out::println);
	birds.removeIf(String::isEmpty);
	birds.forEach(System.out::println);
	birds.clear();
	System.out.println(birds.size());
}
}

