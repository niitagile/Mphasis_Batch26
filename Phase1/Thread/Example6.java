package multithreadexamples;

class Board{
 synchronized public void printTable(int n) {
		for(int i=1;i<=3;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}

class Student1 extends Thread{
	Board board;
	Student1(Board board){
		this.board=board;
	}
	
	
	@Override
	public void run() {
		
		board.printTable(5);
		
	}
}
class Student2 extends Thread{
	Board board;
	Student2(Board board){
		this.board=board;
	}
	
	
	@Override
	public void run() {
		
		board.printTable(12);
		
	}
}
public class Example6 {

	public static void main(String[] args) {
		Board board=new Board();
		Student1 student1=new Student1(board);
		student1.start();
		Student2 student2=new Student2(board);
		student2.start();

	}

}
