package pond.duck;
public class Fatherduck {
	private String noise = "quack";
	private void quack(){
		System.out.println(noise);
	}
	private void makeNoise(){
		quack();
	}
}
