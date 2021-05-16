import java.util.function.*;
import java.util.*;

public class UnaryJM{
	public static void main(String ... args){
		BinaryOperator<String> una =String::concat;
		System.out.println(una.apply("Jacob","2"));
		
	}
}

