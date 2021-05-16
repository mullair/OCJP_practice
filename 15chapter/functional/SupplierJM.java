import java.util.function.*;
import java.util.ArrayList;
import java.util.Random;
import java.time.LocalDate;
public class SupplierJM{

	public static void main(String[] args){
		Supplier<LocalDate> sup = LocalDate::now;
		System.out.println(sup.get());
		Supplier<ArrayList<String>> sup2 = ArrayList::new;
		ArrayList<String> list = sup2.get();
	}
}

