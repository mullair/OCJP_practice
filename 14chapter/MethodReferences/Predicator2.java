import java.util.function.*;
import java.util.*;

public class Predicator2{
	public static void main(String ... args){
		Predicate<String> pred=String::isEmpty;
		System.out.println(pred.test("bla"));
	}
}
