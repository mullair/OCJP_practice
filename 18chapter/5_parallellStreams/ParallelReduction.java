import java.util.stream.*;
import java.util.*;
public class ParallelReduction{
	public static void main(String[] args){
		System.out.println(List.of(1,2,3,4,5,6,7,8,9)
			.parallelStream()
			.findAny().get());
		// reduce()
		System.out.println(List.of("a","b","b","a","F","U")
			.parallelStream()
			.reduce("",(s1,c) -> s1+c,(s2,s3)-> s2+s3));

	}
}
