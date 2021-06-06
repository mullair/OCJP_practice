import java.util.concurrent.*;
import java.util.*;
public class ConsistencyErrors{
	public static void main(String[] args){
		// With concurrent exception
		/*
		var foodData=new HashMap<String,Integer>();
		foodData.put("penguin",1);
		foodData.put("penguin2",2);
		for(String key:foodData.keySet()){
			foodData.remove(key);
		}
		*/
		var foodData=new ConcurrentHashMap<String,Integer>();
		foodData.put("penguin",1);
		foodData.put("penguin2",2);
		for(String key:foodData.keySet()){
			foodData.remove(key);
		}
	}
}

