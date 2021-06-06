import java.util.*;
import java.util.concurrent.*;
public class InvokeAll{
	public static void main(String[] args) throws Exception{
		ExecutorService service = null;
		try{
		service = Executors.newSingleThreadExecutor();
		Callable<String> task1=() -> 15+1+" test";
		Callable<String> task2=()->"hi: ";
		List<Future<String>> result=service.invokeAll(List.of(task1,task2));
		for(Future<String> item: result){
			System.out.println(item.get());
		        }
                }
		finally{
			if(service != null){
				service.shutdown();
			}
		}
                // Same with invoke any
		try{
		service = Executors.newSingleThreadExecutor();
		Callable<String> task1=() -> 15+1+" test";
		Callable<String> task2=()->"hi: ";
		List<Future<String>> result=service.invokeAny(List.of(task1,task2));
		for(Future<String> item: result){
			System.out.println(item.get());
		        }
                }
		finally{
			if(service != null){
				service.shutdown();
			}
		}

	}
}

