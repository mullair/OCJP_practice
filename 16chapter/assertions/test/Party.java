package test;
public class Party{
	public static void main(String[] args){
		int guestnumber=3;
		System.out.println("before assertion");
		assert 1 < -5:"it fails message";
		System.out.println("after assertion");
	}
}
