import java.io.File;
public class Test{
	public static void main(String[] args){
		System.out.println(System.getProperty("file.separator"));
		System.out.println(java.io.File.separator);
		var zooFile1 = new File("C:/develop");
		var zooFile2 = new File(zooFile1,"delve/assets");
		System.out.println(zooFile1.exists());
		}
	}

