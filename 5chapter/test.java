import java.util.*;
public class test{
	public static void main(String[] args){
		ArrayList<Integer> intlist= new ArrayList<>();
		intlist.add(1);
		intlist.set(0,2);
		System.out.println(intlist);
		ArrayList<String> stringlist= new ArrayList<>();
		String[] stringarray = stringlist.toArray(new String[3]);
		for(String i:stringarray){
			System.out.println(i);
		}
	}
}
		
