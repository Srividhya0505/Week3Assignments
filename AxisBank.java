package week3.day1;

public class AxisBank extends BankInfo {

	@Override
	public void deposit() {
	System.out.println("Minimum deposite requirement is 1Lakh");
	}

  public static void main(String[] args) {
	BankInfo myBank = new BankInfo ();
	myBank.deposit();
	
	//Runtime Polymorphism - Parent type refers to Child 
	BankInfo myBank1 = new AxisBank();
	myBank1.deposit();
	   
	  
}
}
