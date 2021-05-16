import java.util.*;
import java.util.function.*;
import java.util.List;
import java.util.stream.*;
public class ReduceJM{
	public static void main(String[] args){
		//Stream<String> str = Stream.of("Jacob","ist","wunderbar");
		//System.out.println(str.reduce((a,b)-> a+" "+ b).get());
		//System.out.println(str.reduce(" ",String::concat));
		 
		Stream<Integer> inte= Stream.of(2,2,2,2,2);
		System.out.println(inte.reduce(1,(a,b)->a*b));
	}
}
