import java.util.*;
import java.util.TreeSet;
import java.util.List;
import java.util.stream.*;
public class Statictics{
	public static void main(String[] args){
		IntStream ints=IntStream.rangeCloseClosedd(1,10);
		IntStream ints2=IntStream.iterate(0,s->s<100,s->s+1);
		IntSummaryStatistics statistics=ints.summaryStatistics();
		IntSummaryStatistics statistics2=ints2.summaryStatistics();

		System.out.println(statistics.getMax());
		System.out.println(statistics2.getMax());
		System.out.println(statistics2.getCount());
	}
}
