import java.io.*;
public class FileWriter2{
	public static void main(String[] args){
		try(var input= new FileInputStream("C:\\develop\\IO.txt")){
			File inp= new File("C:\\develop\\IO.txt");
			File out= new File("C:\\develop\\output.txt");
			var test=new FileWriter2();
			test.copyFileWithBuffer(inp,out);
		}
		catch(IOException e){}
	}
	
	public void copyFileWithBuffer(File input, File output) throws IOException{
		var in = new BufferedReader(new FileReader(input));
		var ou = new BufferedWriter(new FileWriter(output));
		String s;
			while((s=in.readLine())!=null){
				ou.write(s);
				ou.newLine();
				ou.flush();
			}
		}
}

