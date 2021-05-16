import java.util.*;
import java.util.List;
import java.util.stream.*;
public class InfinitStream{
	public static void main(String[] args){
		//Stream<Double> s = Stream.generate(Math::random);
		//Stream<Integer> s1 = Stream.iterate(1,n-> n<100,n->++n);
		//s.forEach(System.out::println);
		//System.out.println(s1.min((s2,s3)->s2-s3).get());
		//s.findFirst().ifPresent(System.out::println);

		Stream<String> str= Stream.of("Jan","Jacob","Margo","Lennart");
		Optional<String> min = str.min((x,y)-> x.length()-y.length());
		min.ifPresent(System.out::println);

	}
}
