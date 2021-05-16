public class InnerClass{
	private String name="hi";
		protected class Inside{
			public int repeat=3;
			public void run(){
				for(int i=0;i<repeat;i++){
					System.out.println(name);
				}
			}
		}
		public static void main(String[] args){
			InnerClass outer = new InnerClass();
			outer.new Inside().run();
		}
}

