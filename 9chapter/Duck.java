public class Duck implements InterfaceCanSwim,InterfaceCanJump{
	public void jumpInWater(){
		System.out.println("hi");
	}
	public static void main(String[] args){
		new Duck().jumpInWater();
	}
}

