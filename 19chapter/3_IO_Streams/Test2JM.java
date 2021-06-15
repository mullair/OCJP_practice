import java.io.*;
public class Test2JM{
	public static void main(String[] args){
		try(var input= new FileInputStream("C:\\develop\\IO.txt")){
			File inp= new File("C:\\develop\\IO.txt");
			File out= new File("C:\\develop\\output.txt");
			var test=new Test2JM();
			test.copyFileWithBuffer(inp,out);
		}
		catch(IOException e){}
	}
	
	public void copyFileWithBuffer(File input, File output) throws IOException{
		var inputStream = new BufferedInputStream(new FileInputStream(input));
		var outputStream = new BufferedOutputStream(new FileOutputStream(output));
			var buffer= new byte[1024];
			int lengthRead;
			while((lengthRead=inputStream.read(buffer))>0){
				outputStream.write(buffer,0,lengthRead);
				outputStream.flush();
			}
		}
}

