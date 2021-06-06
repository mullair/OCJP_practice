public class Polling{
	private static int counter;
	public static void main(String[] args) throws InterruptedException{
		new Thread(() -> {
			for(int i=0;i<5000;i++){
			Polling.counter++;
			}}).start();
		while(Polling.counter <5000){
			System.out.println("not finished");
			try{
			Thread.sleep(1000);
			}catch(Exception e){
			}
		}
		System.out.println("Finished");
	}
}
		
