import java.nio.file.*;
import java.net.URI;

public class PathsJM{
	public static void main(String[] args)throws Exception {
		Path path = Path.of("C:\\develop\\bubs\\nextelement");
		Path path2 = Path.of("develop\\bubs\\nextelement\\..\\nextelement");
		Path path3 = Path.of("fish.txt");

		System.out.println(path);
		System.out.println(path.getNameCount());
		System.out.println(path.getName(0));
		System.out.println(path.subpath(2,3));
		System.out.println("*************");

		System.out.println(path.getParent());
		System.out.println(path.getRoot());
		System.out.println(path.getFileName());
		System.out.println("*************");
		System.out.println(path2.isAbsolute());
		System.out.println(path2.toAbsolutePath());
		System.out.println(path2.resolve(path2));
		System.out.println("********************");

		System.out.println(path3.relativize(path2));
		System.out.println(path2.normalize());
		Path path4 = Paths.get("C:\\develop");
		System.out.println(path4.toRealPath());


		}
	}

