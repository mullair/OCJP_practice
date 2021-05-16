import java.util.function.*;
import java.util.*;

public class ConsumerJM{
	public static void main(String ... args){
		Consumer<String> con =(x)-> System.out.println(x);
		Consumer<String> con2 =(x)-> System.out.println("2"+x);
		Consumer<String> combined=con.andThen(con2);
		combined.accept("hi");
		//Map<String,Integer> map=new HashMap<>();
		//BiConsumer<String,Integer> bi = (x,y)->map.put(x,y);
		//bi.accept("hi",2);
		//map.values().forEach(System.out::println);

	}
}

