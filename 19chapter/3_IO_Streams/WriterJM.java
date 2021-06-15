import java.io.Serializable;
import java.io.*;
public class Writer{
	public static void main(String[] args)throws IOException{
		try(var writer = new PrintWriter("C:\\develop\\writer.txt")){
			writer.write("5");
			writer.print(5);
		}
	}
}

