import java.util.*;
import java.util.List;
import java.util.stream.*;
public class FindAnyJM{
	public static void main(String[] args){

		Stream <String> stre= Stream.generate(()->"jacob");
		//stre.forEach(System.out::println);
		stre.findAny().ifPresent(System.out::println);
		Stream<String> str= Stream.of("Jan","Jacob","Margo","Lennart");
		 str.findAny().ifPresent(System.out::println);

	}
}
