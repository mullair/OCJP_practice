public enum Season{
	WINTER{
		public void printWeeks(){
			System.out.println("snowwww");
		}},
	SUMMER{
		public void printWeeks(){
			System.out.println("hi summer");
		}},
	SPRING,AUTUMN;
	public  void printWeeks(){
		System.out.println("default");
	}
}
