import java.util.function.*;
import java.util.*;

public class SupplierJM{
	public static void main(String ... args){
		Random random=new Random();
		Supplier<Integer> sup=random::nextInt;	
		System.out.println(sup.get());

	}
}
