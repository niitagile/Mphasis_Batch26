package multithreadexamples;

class MyNewThread1 extends Thread{

	@Override
	public void run() {
		System.out.println("I am a new Thread");
		
	}
	
}
public class Example3 {

	public static void main(String[] args) {
		MyNewThread1 t=new MyNewThread1();
		t.start(); //it automatically calls run() and execute it in same location of main
		//t.run();//it runs your method as normal method and different location
		//t.start();  java.lang.IllegalThreadStateException
	}

}
