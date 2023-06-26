package multithreadexamples;



class MultithreadEx extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=3;i++) {
		System.out.println("I am Thread"+ getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}
}
public class Example5 {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println("Current Thread::"+t);
		MultithreadEx t1=new MultithreadEx();
		t1.setName("First Thread");
		t1.start();
		MultithreadEx t2=new MultithreadEx();
		t2.setName("Second Thread");
		t2.start();
		
		System.out.println("Main Thread End");

	}
	
	
}
