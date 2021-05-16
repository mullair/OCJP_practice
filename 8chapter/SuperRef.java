
public class Bat extends Mammal {
	String type; 
	int age;
	public Bat(String type){
		super("elephant");
		this.type=type;
	}
	public Bat(String type, int age){
		this(type);
		this.age=age;}
	
	public String getType(){
		System.out.println("this type " + this.type + "\nsuper type " + super.type);
		return null;
	}

	public void noise(){
		System.out.println("blub in lower class");
	}
	public static void main(String[] args){
		Bat bat = new Bat("Jacob",26);
		bat.getType();
		System.out.println(bat.age+ "\n" + bat.type);
		bat.noise();
	}
}
class Mammal {
	String type;
	String color;
	public Mammal(String type){
		super();
		this.type=type;
	}
	public void noise(){
		System.out.println("blub");
	}
}
