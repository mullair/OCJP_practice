import java.util.*;
import java.util.TreeSet;
import java.util.List;
import java.util.stream.*;
public class DoubleStreamJM{
	public static void main(String[] args){
		IntStream dub=IntStream.rangeClosed(1,6);
		OptionalDouble avg= dub.average();
		System.out.println(avg);
		avg.ifPresent(System.out::println);
		System.out.println(avg.orElseGet(()->Double.NaN));

		
	}
}
