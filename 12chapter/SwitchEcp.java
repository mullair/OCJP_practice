public class SwitchEcp{
	public static void main(String[] args){
		Season s = Season.SPRING;
		switch(s){
			case SUMMER: Season.SUMMER.printWeeks();break;
			case WINTER: Season.WINTER.printWeeks();break;
			case SPRING: Season.SPRING.printWeeks();break;
			default: System.out.println("is it summer yet?");
		}
	}

}

