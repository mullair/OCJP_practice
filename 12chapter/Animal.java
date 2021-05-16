public class Animal{
	private boolean canHop;
	private boolean canSwim;
	private String name;
	public Animal(String name, boolean canHop, boolean canSwim){
		this.name=name;
		this.canHop=canHop;
		this.canSwim=canSwim;
	}
	public boolean canHop(){
		return canHop;
	}
	public boolean canSwim(){
		return canSwim;
	}
	public String toString(){
		return name;
	}
}
