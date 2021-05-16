import java.util.*;
import java.util.TreeSet;
import java.util.List;
import java.util.stream.*;
public class IntStreamJM{
	public static void main(String[] args){
		DoubleStream dub=DoubleStream.iterate(1000,x->x>0.000001,x->x/2);
		dub.forEach(System.out::println);

		
		//System.out.println(inte.sum());
		//System.out.println(inte.average().getAsDouble());
	}
}
