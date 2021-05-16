import java.util.function.*;
import java.util.*;

public class ConstructorSupplier{
	public static void main(String ... args){
		Supplier<ArrayList<String>> sup = ArrayList::new;
		Consumer<ArrayList<String>> con = s-> System.out.println(s);
		con.accept(sup.get());

	}
}
