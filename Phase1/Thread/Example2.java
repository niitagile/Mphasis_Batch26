package multithreadexamples;

class MyNewThread implements Runnable{

	@Override
	public void run() {
		System.out.println("I am a new Thread");
		
	}
	
}
public class Example2 {

	public static void main(String[] args) {
		Thread t=new Thread(new MyNewThread());
		t.start(); //it automatically calls run() and execute it in same location of main
		//t.run();//it runs your method as normal method and different location
		//t.start();  java.lang.IllegalThreadStateException
	}

}
