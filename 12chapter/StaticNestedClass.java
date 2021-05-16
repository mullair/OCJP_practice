public class StaticNestedClass{
	static class Inside{
		private int price =3;
		}
		public static void main(String[] args){
			var nessy = new Inside();
			System.out.println(nessy.price);
		}
}

