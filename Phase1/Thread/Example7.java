package multithreadexamples;
class ChatWindow{
	boolean turn=false;
	synchronized void Question(String ques) {
		
		if(turn==true) {
			try {
				wait(); //method of Object class
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}//if end
		
		System.out.println(ques);
		turn =true;
		notify();// method of object class which provide signal to next thread
	}
	synchronized void Answer(String ans) {
		if(turn==false) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}//if end
		
		System.out.println(ans);
		turn=false;
		notify();
			
	}
}
class Teacher extends Thread{
	ChatWindow chat;
	String ques[]= {"What is JDK","What is JVM", "What is data type"};
	public Teacher(ChatWindow chat) {
		this.chat=chat;
		
	}
	
	@Override
	public void run() {
		
		for(int i=0;i<ques.length;i++) {
			chat.Question(ques[i]);
		}
	}
}
class Student extends Thread{
	ChatWindow chat;
	String ans[]= {"Java Development Kit","Java Virtua Machine", "Type of values"};
	public Student(ChatWindow chat) {
		this.chat=chat;
		
	}
	@Override
	public void run() {
		
		for(int i=0;i<ans.length;i++) {
			chat.Answer(ans[i]);
		}
	}
	
}
public class Example7 {

	public static void main(String[] args) {
		ChatWindow chat=new ChatWindow();
		Teacher teacher=new Teacher(chat);
		Student student=new Student(chat);
		teacher.start();
		student.start();

	}

}
