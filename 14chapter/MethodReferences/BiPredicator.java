import java.util.function.*;
import java.util.*;

public class BiPredicator{
	public static void main(String ... args){
		BiPredicate<String,String> pred=String::startsWith;
		System.out.println(pred.test("bla","b"));
	}
}
