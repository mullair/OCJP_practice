import java.util.function.*;
import java.util.*;

public class Sorter{
	public static void main(String ... args){
		String s="Jacob";
		Predicate<String> pred=s::startsWith;
		System.out.println(pred.test("Ja"));

	}
}
