import java.util.concurrent.atomic.*;
import java.util.concurrent.locks.*;
import java.util.concurrent.*;
public class LockJM{
	private static int counter;
	public static void count(Lock lock){
		lock.lock();
		System.out.println((counter++));
		lock.unlock();
	}
		public static void main(String[] args){
			Lock lock=new ReentrantLock();
			ExecutorService service = null;
			try{
				LockJM classins = new LockJM();
				service = Executors.newFixedThreadPool(5);
				for(int i=0;i<10;i++) {
					service.submit(() -> 
						count(lock));
					}
				if(lock.tryLock()){
					try{
						System.out.println("Lock obtained entering protected code");
					}
					finally{
						lock.unlock();
					}
				}
			}finally{
				if(service != null) service.shutdown();
			}
		}
}

