import java.io.*;
public class TestJM{
	public static void main(String[] args){
		try(var input= new FileInputStream("C:\\develop\\IO.txt")){
		var test=new TestJM();
		//test.printData(input);
		System.out.println("\nbreak");
		test.readData(new BufferedInputStream(input));
		}
		catch(IOException e){}
	}
	
	public void printData(InputStream input) throws IOException{
			int b;
			while((b=input.read())!= -1){
			System.out.print((char) b);
			}
		}
	public void readData(InputStream input) throws IOException{
		System.out.print((char) input.read());
		if(input.markSupported()){
			input.mark(1);
			System.out.println((char)input.read());
			input.skip(1);
			System.out.println((char)input.read());
			input.reset();
			 }
		System.out.print((char)input.read());
		System.out.print((char)input.read());
		System.out.print((char)input.read());
		

	
	}
}

