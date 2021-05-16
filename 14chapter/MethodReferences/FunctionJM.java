import java.util.function.*;
import java.util.*;

public class FucntionJM{
	public static void main(String ... args){
		Function<Integer,List<String>> fun = ArrayList::new;
		Integer i=2;
		List<String> m=fun.apply(i);
		Consumer<List<String>> con = System.out::println;
		con.accept(m);
	}
}
