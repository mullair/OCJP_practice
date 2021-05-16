import java.util.*;
public class OptionalJM{
	public static Optional<Double> average(int... scores){
		if(scores.length == 0) return Optional.empty();
		int sum=0;
		for(int score:scores) sum+=score;
		return Optional.of((double) sum/scores.length);
	}
	public static void main(String[] args){
	
	Double doub=null;
	Optional<Double> opt = Optional.ofNullable(doub);
	System.out.println(opt);
	opt.ifPresent(System.out::println);
	System.out.println(opt.orElse(Double.NaN));
	System.out.println(opt.orElseGet(()->Math.random()));
	var avg = average(12,2,2,2,2,2,2);
	if(avg.isPresent()) System.out.println(avg.get());
	}
}

