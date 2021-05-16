public class  AbstractClass2 extends AbstractClass{
	public String getName(){
		return "it works";
	}
	public void printName(){
		System.out.println(getName());
	}
	public static void main(String[] args){
		new AbstractClass2();
	}
}
