package inerfaceexamples;
interface AccountDetails{
	int active=50;
	void getAccountNo();
	private float getInterest(int balance) {
		return balance*0.06f;
	}
	default void display(int balance) {
		System.out.println("Interest="+getInterest(balance));
	}
	static void rateofinterest() {
		System.out.println("Rate of interest = 6%");
	}
	
}

class MyAccount implements AccountDetails{
	
	
	@Override
	public void getAccountNo() {
		System.out.println("acoount no=19877789");
		display(6000);
		AccountDetails.rateofinterest();
	}
	@Override
	public void display(int balance) {
		System.out.println("Interest=600");
	}
	
}
public class DifferentInterfaceMethods {

	public static void main(String[] args) {
		MyAccount obj=new MyAccount();
		obj.getAccountNo();
		obj.display(7000);

	}

}

/* method overriding means parent method is changed by child method*/
