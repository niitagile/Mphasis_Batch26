package stringexample;

public class GetCharsExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String src="Hello class! we are@ learning string";
		char ans[]=new char[8];
		src.getChars(14, 20, ans, 0);
		System.out.println(ans);
		
		String result=src.substring(14, 20);
		System.out.println(result);


	}}