public class Anonymous {
	abstract class SaleTodayOnly{
		abstract int dollarsOff();
	}
	public int admisison(int basePrice){
		SaleTodayOnly sale = new SaleTodayOnly(){
			int dollarsOff() {return 3;};
		};
			return basePrice - sale.dollarsOff();
	}
		public static void main(String[] args){
			var local = new Anonymous();
			System.out.println(local.admisison(4));
		}
}

