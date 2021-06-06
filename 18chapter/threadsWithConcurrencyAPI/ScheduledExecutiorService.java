import java.util.*;
import java.util.concurrent.*;
public class ScheduledExecutiorService{
	public static void main(String[] args) throws Exception{
		ScheduledExecutorService service = null;
		try{
		service = Executors.newSingleThreadScheduledExecutor();
		Callable<String> task1=() -> "test";
		Runnable task2=()->System.out.println("hi");
		Future<String> result1=service.schedule(task1,2,TimeUnit.SECONDS);
		Future<?> result2=service.scheduleAtFixedRate(task2,6,5,TimeUnit.SECONDS);
		}
		finally{
			if(service != null){
				service.shutdown();
			}
		}

	}
}

