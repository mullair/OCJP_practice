public class Helper{
	public static void main(String[] args){
		Season s=Season.WINTER;
		System.out.println(Season.WINTER);
		System.out.println(s== Season.WINTER);
		for(Season i:Season.values()){
			System.out.println(i.ordinal()+ " "+ i.name());
		}
		Season w = Season.valueOf("WINTER");
		System.out.println(w.name());
	}
}

