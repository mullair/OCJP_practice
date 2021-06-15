import java.io.Serializable;
import java.io.*;
public class Gorilla2 implements Serializable{
		private static final long serialVersionUID=1L;
		private String name;
		private int age;
		private Boolean friendly;
		private transient String favoriteFood;
		public static void main(String[] args) throws IOException,ClassNotFoundException{
			Gorilla2 go=new Gorilla2();
			File file=new File("C:\\develop\\output.txt");
			try(var in=new ObjectInputStream(
						new BufferedInputStream(
							new FileInputStream(file)))){
				while(true){
				Object obj=in.readObject();
				if(obj instanceof Gorilla2){
					System.out.println("it is a gorilla");
				}}
			}catch(EOFException e){System.out.println("End of file reached");}
}
}

