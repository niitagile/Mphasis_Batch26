package multithreadexamples;



class Multithread extends Thread{
	@Override
	public void run() {
		System.out.println("I am Thread"+ getName());
	}
}

public class Example4 {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println("Current Thread::"+t);
		Multithread t1=new Multithread();
		t1.setName("First Thread");
		t1.start();
		Multithread t2=new Multithread();
		t2.setName("Second Thread");
		t2.start();
		
		System.out.println("Main Thread End");

	}
	
	/*
	 * Current Thread::Thread[main,5,main]
Main Thread End
I am ThreadSecond Thread
I am ThreadFirst Thread*/
	 

}
