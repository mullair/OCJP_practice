import java.io.File;
public class Filecheck{
	public static void main(String[] args){
		var file= new File("C:/develop");
		if(file.exists()){
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isDirectory());
			System.out.println(file.isFile());
			System.out.println(file.getParent());
			System.out.println(file.getName());
			System.out.println(file.lastModified());
			System.out.println(file.length());
			for(File item:file.listFiles()){
				System.out.println(item.getName());
			}
		}
	}
}

