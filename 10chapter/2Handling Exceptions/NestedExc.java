public class NestedExc{
	public static void main(String[] args){
	StringBuilder result = new StringBuilder();
	String v = null;
	try{
		try{result.append("before_");
		v.length();
		}
		catch(NullPointerException e){
			result.append("catch_");
			throw new RuntimeException();
		}
		finally{
			result.append("finally_");
	}
	}
	catch(RuntimeException e){
		result.append("done");
	}
		System.out.println(result);
	}
}
