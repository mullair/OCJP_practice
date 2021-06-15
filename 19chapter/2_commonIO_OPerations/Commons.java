import java.io.File;
import java.io.*;
public class Commons{
	public static void main(String[] args){
		try(var inp= new FileInputStream("C:\\develop\\IO.txt")){
		int b;
		byte[] c = new byte[]{100,122};
		while((b=inp.read())!=-1){
		System.out.print((char) inp.read());
		}
		}catch(IOException e){System.out.println("excpetion");}
		}
	}


