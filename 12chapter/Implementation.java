public class Implementation implements InterfaceExp{
	public boolean hasScale(){
		return true;
	}
	public void printSomething(){
		System.out.println("implemented print");
	}
	public void printSuper(){
		InterfaceExp.super.printSomething();
	}

	public static void main(String[] args){
		var imp = new Implementation();
		imp.printSomething();
		printSuper();
		//imp.printSuper();
	}
}

