public class LocalClass {
	private int length = 12;
		public void calculate(){
			int width =10;
			class calculator{
				public void multiply(){
				System.out.println(width*length);
			}
			}
			new calculator().multiply();
		}
			
		public static void main(String[] args){
			var local = new LocalClass();
			local.calculate();
		}
}

