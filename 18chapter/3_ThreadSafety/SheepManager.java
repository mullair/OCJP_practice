import java.util.concurrent.atomic.*;
import java.util.concurrent.*;
public class SheepManager{
	private static int counter;
	private static AtomicInteger atomicCounter=new AtomicInteger(0);
	private void incrementAndReport(){
		System.out.print((++counter)+" ");
	}
	private synchronized void incrementAndReportAtomic(){
		//synchronized(this){
		System.out.print((atomicCounter.incrementAndGet())+" ");
	//	}
	}
	// RACE CONDITION

	public static void main(String[] args) throws Exception{
		ExecutorService service=null;
		try{
			service=Executors.newFixedThreadPool(20);
			SheepManager mgr=new SheepManager();
			/*for(int i=0;i<10;i++){
				Future<?> r1 = service.submit(() -> mgr.incrementAndReport());
			}*/
			for(int i=0;i<10;i++){
				Future<?> r1 = service.submit(() -> mgr.incrementAndReportAtomic());
			}
		}finally{
			if(service != null){
				service.shutdown();
			}
		}
		// Atomic treatement of race condition = ensure every number once - position still wrong
	}
}

