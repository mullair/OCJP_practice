import java.util.List;
import java.util.stream.*;
public class StreamJM{
	public static void main(String[] args){
		Stream<String> empty= Stream.empty();
		Stream<String> onevalue= Stream.of("hi");
		Stream<Integer> oflist= Stream.of(1,2,3);
		var list = List.of("hi","hi2","hi3");
		Stream<String> formlist= list.stream();
		System.out.println(oflist);

	}
}
