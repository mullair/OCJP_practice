import java.util.function.*;
import java.util.*;

public class PredicateJM{
	public static void main(String ... args){
		Predicate<String> pred=x->x.isEmpty();
		Predicate<String> pred2=x-> x.contains("jacob");
		Predicate<String> combined=pred.negate().and(pred2);
		System.out.println(combined.test("jacob is amazing"));
		//BiPredicate<String,String> bi = String::startsWith;
		//System.out.println(bi.test("CFAnna","CFA"));
	}
}

