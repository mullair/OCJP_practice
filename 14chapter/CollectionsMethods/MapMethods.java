import java.util.* ;
import java.util.function.*;

public class MapMethods{
	public static void main(String[] args){
		Map<String,String> map= new HashMap<>();
		map.put("Jacob","nice");
		map.put("Margo","lovely");
		map.put("Lennart","grumpy");
		BiFunction<String,String,String> mapper=(v1,v2) -> v1.length() > v2.length() ? v1 : v2;
		System.out.println(map);
		map.merge("Jacob","niiiiccceee",mapper);
		map.merge("Lennart","dumb",mapper);
		System.out.println(map);
		/*map.forEach((k,v)->System.out.println(k+" value: "+v));
		System.out.println(map.replace("Jacob","Pilot"));
		System.out.println(map.getOrDefault("Jacob","default"));
		map.putIfAbsent("Michel","dangerous");
		map.replaceAll((k,v)-> " is " +v);
		map.forEach((k,v)->System.out.println(k+v));
		
		//map.keySet().forEach(System.out::println);
		//System.out.println("is empty: "+map.isEmpty());
		System.out.println("containsKey jacob: "+map.containsKey("Jacob"));
		System.out.println("containsvalue nice: "+map.containsValue("nice"));
		System.out.println("get jacob: "+map.get("Jacob"));
		for(String i:map.values()){
			System.out.println(i);
		}
		System.out.println("sizee: "+map.size());
		map.clear();
		System.out.println("is empty after clear(): "+map.isEmpty());
	*/	
	}
}

