import java.io.Serializable;
import java.io.*;
public class Gorilla implements Serializable{
		private static final long serialVersionUID=1L;
		private String name;
		private int age;
		private Boolean friendly;
		private transient String favoriteFood;
		public static void main(String[] args){
			Gorilla go=new Gorilla();
			File file=new File("C:\\develop\\output.txt");
			try(var out=new ObjectOutputStream(
						new BufferedOutputStream(
							new FileOutputStream(file)))){
				out.writeObject(go);
				out.flush();
			}catch(Exception e){}
		}
}

