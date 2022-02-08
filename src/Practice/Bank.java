package Practice;

abstract class Bank {
	
	public double interestRate;
	public double homeLoanInterestRate;
	public double carLoanInterestRate;
	public double goldLoanInterestRate;
	public int totalBranches;
	public String bankName;
	public String mainBranchName;	
		
}

//sub class inherits the abstract class
class RBI extends Bank{
		
	public RBI() {
		interestRate = 2.5;
		homeLoanInterestRate = 3.5;
		carLoanInterestRate = 2.15;
		totalBranches = 500;
		bankName = "Reserve Bank of India";
		mainBranchName = "Delhi";
	}
	
	//Implement abstract method getBankDetails()
	/*public void getBankDetails() {
		System.out.println("Reserve Bank of India");
		System.out.println("===============================================================");
		System.out.println("Interest Rate                   		  : " + interestRate);
		System.out.println("Home Loan Interest Rate                   : " + homeLoanInterestRate);
		System.out.println("Car Loan Interest Rate                    : " + carLoanInterestRate);
		System.out.println("Total No of Branches                      : " + totalBranches);
		System.out.println("Main Branch Name                          : " + mainBranchName);
		System.out.println("===============================================================");
	}*/
}

class UnionBank extends Bank{
	public UnionBank() {
		interestRate = 1.95;
		homeLoanInterestRate = 2.95;
		carLoanInterestRate = 2.75;
		totalBranches = 250;
		bankName = "Union Bank";
		mainBranchName = "Bangalore";
	}
	
	//Implement abstract method getBankDetails()
	/*public void getBankDetails() {
		System.out.println("Union Bank");
		System.out.println("===============================================================");
		System.out.println("Interest Rate                   		  : " + interestRate);
		System.out.println("Home Loan Interest Rate                   : " + homeLoanInterestRate);
		System.out.println("Car Loan Interest Rate                    : " + carLoanInterestRate);
		System.out.println("Total No of Branches                      : " + totalBranches);
		System.out.println("Main Branch Name                          : " + mainBranchName);
		System.out.println("===============================================================");
	}*/
}


