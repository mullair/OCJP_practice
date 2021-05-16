import java.io.*;
class TryWith{
	public static void main(String[] args){
		try( FileInputStream is = new FileInputStream("myfile.txt");
//			FileOutputStrem os = new FileOutputStream("myfile.txt");
			){
			//read file
		}
			System.out.println("<<<<<<<<<<<<<exception>>>>>>>>>>> \n print stacktrace: \n \n");
				 e.printStackTrace();
		}
		finally{
			System.out.println("normal finally");
		}
		
	}
}

