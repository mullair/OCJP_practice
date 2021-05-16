import java.util.*;
public class ComparatorMeth implements Comparable<ComparatorMeth>{
	private int weigth;
	private String name;
	public ComparatorMeth(int weigth, String name){
		this.weigth=weigth;
		this.name=name;
	}
	public int getWeigth(){return weigth;}
	public int compareTo(ComparatorMeth c){
		return name.compareTo(c.name);
	}
	public String toString(){return name;}
	public static void main(String... args){
		Comparator<ComparatorMeth> compa = Comparator.comparing(ComparatorMeth::getWeigth);
		var comps=new ArrayList<ComparatorMeth>();
		comps.add(new ComparatorMeth(2,"Jacob"));
		comps.add(new ComparatorMeth(12,"mack"));
		comps.add(new ComparatorMeth(1,"lenn"));
		Collections.sort(comps);
		System.out.println(comps);
		Collections.sort(comps,compa);
		System.out.println(comps);
	}
}
