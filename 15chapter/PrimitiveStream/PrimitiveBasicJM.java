import java.util.*;
import java.util.TreeSet;
import java.util.List;
import java.util.stream.*;
public class PrimitiveBasicJM{
	public static void main(String[] args){
		Stream<Integer> inte=Stream.of(1,2,3);
		System.out.println(inte.mapToInt(x->x).sum());
	}
}
