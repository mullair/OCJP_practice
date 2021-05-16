import java.io.*;
public class OrderOps implements AutoCloseable{
	private final int number;
	public OrderOps(int number){this.number=number;}
	public void close(){
		System.out.println("Clsoing"+this.number);
	}
	public static void main(String[] args){
		try(var orderOps = new OrderOps(1);
		var orderOps2 = new OrderOps(2);){
			System.out.println("main body");
			throw new IOException();
		}
		catch(IOException | Error e){
			System.out.println("catchblock");
		}
		finally{ System.out.println("finally blcok");
		}
	}
}
