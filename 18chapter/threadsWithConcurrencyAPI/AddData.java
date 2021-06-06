import java.util.concurrent.*;
public class AddData{
	public static void main(String[] args) throws Exception{
		ExecutorService service = null;
		try{
		service = Executors.newSingleThreadExecutor();
		Future<?> result=service.submit(() -> 15+1);
		System.out.println(result.get());
		}finally{
			if(service != null){
				service.shutdown();
			}
		}
		// Example with "awaittermination"
		try{
		service = Executors.newSingleThreadExecutor();
		Future<?> result=service.submit(() -> 15+1);
		}finally{
			if(service != null){
				service.shutdown();
			}
		}
			if(service != null){
				service.awaitTermination(10,TimeUnit.SECONDS);
			}
			if(service.isTerminated()) System.out.println("Finished");
			else System.out.println("At least one task is still running");
	}
}

