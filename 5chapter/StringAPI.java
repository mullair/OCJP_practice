public class StringAPI{
	public static void main(String... args){
		String a= "mar";
		String b= "I like big boots that i can not like";
		String c= "    I like big boots that i can not like    ";
		System.out.println(b.charAt(7));
		System.out.println(b.indexOf("k",4));
		System.out.println(b.substring(7,15));
		System.out.println(b.toUpperCase());
		System.out.println(b.equalsIgnoreCase(a));
		System.out.println(b.startsWith("I"));
		System.out.println(b.replace("b","blabla"));
		System.out.println(c.length());
		System.out.println(c.trim().length());
		System.out.println(c.strip().length());
		System.out.println(c.stripLeading().length());
		System.out.println(c.stripTrailing().length());
	}
}
