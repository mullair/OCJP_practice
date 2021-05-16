public class Basic{
	void fly(){
		throw new RuntimeException();
	}
	void start(){
		try{
			fly();}
		catch(Error | RuntimeException e){
			System.out.println("works");
		//	e.printStackTrace();
		}
	}
	public static void main(String[] args){
		var b=new Basic();
		b.start();
	}
}

