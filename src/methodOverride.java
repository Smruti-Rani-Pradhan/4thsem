class Bank{
	public double getInterest() {
		return 0.0;
	}
}
class BankA extends Bank{
	public double getInterest() {
		return 3.5;
	}
}

class BankB extends Bank{
	public double getInterest() {
		return 4.0;
	}
}
class BankC extends Bank{
	public double getInterest() {
		return 4.5;
	}
}

public class methodOverride {

	public static void main(String[] args) {
		
    Bank a=new BankA();
    Bank b=new BankB();
    Bank c=new BankC();
    
    System.out.println("Bank A interest rate is:"+a.getInterest());
    System.out.println("Bank B interest rate is:"+b.getInterest());
    System.out.println("Bank C interest rate is:"+c.getInterest());
	}

}
