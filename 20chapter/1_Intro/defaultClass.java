import java.nio.file.*;
import java.net.URI;

public class defaultClass{
	public static void main(String[] args)throws Exception {
		URI a = new URI("file:\\C:\\develop");
		Path b = Paths.get(a);
		Path c=Path.of(a);
		URI d = b.toUri();
		}
	}

