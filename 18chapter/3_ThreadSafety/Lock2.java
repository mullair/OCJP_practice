import java.util.concurrent.atomic.*;
import java.util.concurrent.locks.*;
import java.util.concurrent.*;
public class Lock2{
	public static void main(String[] args){
		Lock lock = new ReentrantLock();
		if(lock.tryLock()){
			try{
				lock.lock();
				System.out.println("obtained twice");
			}
			finally{
				lock.unlock();
			}
		}
		new Thread(()-> System.out.println(lock.tryLock())).start();
	}
}

