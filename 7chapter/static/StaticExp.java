public class StaticExp{
	private static int counter =0;
	public StaticExp(){
		counter++;
	}
	public static void main(String[] args){
		StaticExp staticexp= new StaticExp();
		staticexp.counter++;
		StaticExp.counter++;
		System.out.println(counter);
		staticexp.counter =100;
		System.out.println(counter);
	}
}

