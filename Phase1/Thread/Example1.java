package multithreadexamples;
//First thread of program is main
public class Example1 {

	public static void main(String[] args) {
		Thread t=Thread.currentThread(); //public static Thread currentThread()
		System.out.println("Thread Info::"+t);
		//[main,5,main][threadname,priorty,groupname]
		System.out.println("Thread id::"+t.getId());
		System.out.println("State::"+t.getState());
		System.out.println("Thread still in process::"+t.isAlive());
		t.setPriority(7);
		t.setName("DemoThread");
		System.out.println("Thread info::"+t);
		
		
	}

}
