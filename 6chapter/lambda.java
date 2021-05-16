public class lambda{
	public static void main(String[] args){
		MyLambda myLambdaFunction = () -> System.out.println("Hi i am lambda");
		myLambdaFunction.foo();
		MyLambda2 addIntegers = (a, b)  -> a+b;
		System.out.println(addIntegers.foo2(1,2));
	}
	interface MyLambda{
		void foo();
	}
	interface MyLambda2{
		int foo2(int a, int b);
	}
}
