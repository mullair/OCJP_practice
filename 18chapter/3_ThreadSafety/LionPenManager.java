import java.util.concurrent.atomic.*;
import java.util.concurrent.locks.*;
import java.util.concurrent.*;
public class LionPenManager{
	private void removeLions() {System.out.println("Lions removed");}
	private void cleanPen() {System.out.println("Pen Cleaned");}
	private void addLions() {System.out.println("Adding Lion");}
	private void performTask(CyclicBarrier c1, CyclicBarrier c2){
		try{
			removeLions();
			c1.await();
			cleanPen();
			c2.await();
			addLions();
		} catch(InterruptedException | BrokenBarrierException e){
			//handle here
		}
	}
	public static void main(String[] args){
		ExecutorService service = null; 
		try{
			service = Executors.newFixedThreadPool(4);
			var manager = new LionPenManager();
			var c1=new CyclicBarrier(4);
			var c2=new CyclicBarrier(4,
					() -> System.out.println("*** Pen cleaned"));
			for(int i=0;i<4;i++)
				service.submit(()->manager.performTask(c1,c2));
		} finally{
			if(service!=null)service.shutdown();
		}
	}
	}
