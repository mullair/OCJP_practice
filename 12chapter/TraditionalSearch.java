import java.util.*;
import java.util.function.Predicate;
public class TraditionalSearch{
	public static void main(String[] args){
		var list= new ArrayList<Animal>();
		list.add(new Animal("jacob",true,true));
		list.add(new Animal("margo",false,true));
		list.add(new Animal("margo2",false,false));
		print(list,a -> a.canHop());
		print(list,a-> a.canSwim() && !a.canHop());

	}

	private static void print(ArrayList<Animal> list,Predicate<Animal> pred){
		for(Animal a: list){
			if(pred.test(a)){
				System.out.println(a +" and it can hop! " +a.canHop());
			}
		}
	}
}
