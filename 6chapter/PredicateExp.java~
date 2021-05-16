import java.util.*;
import java.util.function.*;
public class PredicateExp{
	public static void main(String[] args){
		List<Animal> animals = new ArrayList();
		animals.add(new Animal("Trex",false,true));
		animals.add(new Animal("snail",false,false));
		animals.add(new Animal("bird",true,true));
		System.out.println(animals);
		print(animals, a -> a.canHop());
	}
	public static void print(List<Animal> animals, Predicate<Animal> checker){
		for(Animal animal: animals){
			if(checker.test(animal))
			System.out.println(animal + " ");
		}
		System.out.println();
	}
}
