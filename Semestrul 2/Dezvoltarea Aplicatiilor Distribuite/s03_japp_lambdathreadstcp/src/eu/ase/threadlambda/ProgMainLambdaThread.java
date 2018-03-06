package eu.ase.threadlambda;

public class ProgMainLambdaThread {
	
	public static void main(String[] args) {
		Runnable taskJ7 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Hello J7 " + Thread.currentThread().getName());
				
			}
		};
		
		taskJ7.run();
		
		Thread thJ7 = new Thread(taskJ7);
		thJ7.start();
		//thJ7.start();
		
		Runnable taskJ8 = () -> {
			String thName = Thread.currentThread().getName();
			System.out.println("Hello J8 " + thName);
		};
		
		taskJ8.run();
		
		Thread thJ8 = new Thread(taskJ8);
		thJ8.start();
		//thJ8.start();
		
		System.out.println("FINISHED");

	}

}
