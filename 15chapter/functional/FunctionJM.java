import java.util.function.*;
import java.util.*;

public class FunctionJM{
	public static void main(String ... args){
		Function<String,String> fun=x->x.toUpperCase();
		Function<String,String> fun2=x->x+" i am the second step";
		Function<String,String> combined=fun2.compose(fun);
		System.out.println(combined.apply("hi"));
		//BiFunction<String,String,String> fun=String::concat;
		//System.out.println(fun.apply("hi","Werder"));
	}
}

