package Practice;

public class Banking {

	static void displayBankDetails(double iRate, double hRate, double cRate, int totBranch, String bankName, String mainBranch) {
		//testing for github commits
		System.out.println(bankName);
		System.out.println("===============================================================");
		System.out.println("Interest Rate                   	  : " + iRate);
		System.out.println("Home Loan Interest Rate                   : " + hRate);
		System.out.println("Car Loan Interest Rate                    : " + cRate);
		System.out.println("Total No of Branches                      : " + totBranch);
		System.out.println("Main Branch Name                          : " + mainBranch);
		System.out.println("===============================================================");
	}
	public static void main(String[] args) {
		//create object of RBI		
		RBI objRBI = new RBI();
		displayBankDetails(objRBI.interestRate, objRBI.homeLoanInterestRate, objRBI.carLoanInterestRate, objRBI.totalBranches, objRBI.bankName, objRBI.mainBranchName);
		
		//create object of union bank
		UnionBank objUBank = new UnionBank();
		displayBankDetails(objUBank.interestRate, objUBank.homeLoanInterestRate, objUBank.carLoanInterestRate, objUBank.totalBranches, objUBank.bankName, objUBank.mainBranchName);
		
	}

}
