package Best;

public class Childbranch extends BankExercise implements BankFunction {
         
	double totalamount = 0;
	public Childbranch(double amt) {
		super(amt);
		this.totalamount = amt;
		// TODO Auto-generated constructor stub
	}

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		Childbranch cb = new Childbranch(100);
		System.out.println("Before witdraw/deposite your bank amount : "+cb.totalamount);
		cb.increasement(100.0);
		cb.decreasement(700.0);
	}

	@Override
	public void increasement(double amt) {
		totalamount += amt;
		System.out.println("Afer Deposite "+amt+" is "+totalamount);
	}

	@Override
	public void decreasement(double amt) {
		
		// TODO Auto-generated method stub
		totalamount -= amt;
		System.out.println("Afer deposit "+amt+" is "+totalamount);
	}

}


