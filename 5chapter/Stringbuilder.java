public class Stringbuilder{
	public static void main(String... args){
		StringBuilder a= new StringBuilder("Heyhey");
		StringBuilder b= new StringBuilder("Heyheyhey");
		a.append(" blabla");
		a.insert(3,"-between hey-");
		a.delete(0,3);
		a.deleteCharAt(1);
		System.out.println(a);
		b.replace(3,6,"schaaaaaaaaaalllaaaalaaaaaa");
		System.out.println(b);
		b.reverse();
		System.out.println(b);

	}
}
