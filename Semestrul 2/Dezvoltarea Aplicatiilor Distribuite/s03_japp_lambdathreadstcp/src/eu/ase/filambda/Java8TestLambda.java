package eu.ase.filambda;

@FunctionalInterface
interface MathOperation {
	int operation(int a, int b);
}

@FunctionalInterface
interface GreetingService {
	void sayMesssage(String message);
}

class MathOpImpl {
	public int operate(int a, int b, MathOperation mathOp) {
		return mathOp.operation(a, b);
	}
}

public class Java8TestLambda {

	public static void main(String[] args) {
		MathOpImpl tester = new MathOpImpl();
		
		MathOperation add = (int a, int b) -> a + b;
		MathOperation sub = (a, b) -> a - b;
		
		System.out.println("7 + 2 = " + tester.operate(7, 2, add));
		System.out.println("7 - 2 = " + tester.operate(7, 2, sub));
		
		GreetingService gs1 = message -> System.out.println("Hello " + message);
		GreetingService gs2 = (String msg) -> {
			System.out.println("Bonjour " + msg);
		};
		
		gs1.sayMesssage("John");
		gs2.sayMesssage("Pierre");

	}

}
