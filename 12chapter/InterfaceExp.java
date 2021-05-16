public interface InterfaceExp{
	boolean hasScale();
	default void printSomething(){
		System.out.println("default print");
	}
}
