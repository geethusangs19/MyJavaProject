package Training;

public class JavaVariables {

	public static void main(String[] args) {
		
		int empId = 234;
		String name = "Sangeetha";
		String desig = "Java Developer";
		double salary = 4500.00d;
		double tax = 325.45d;
		double incen = 1240.35d;
		double insur = 105.60d;
		double totSalary = salary + incen - tax - insur;
		
		System.out.println("\tEMPLOYEES PAYROLL DETAILS");
		System.out.println("\t=========================");
		System.out.println("Employee Id       : "+empId);
		System.out.println("Employee Name     : "+name);
		System.out.println("Designation       : "+desig);
		System.out.println("Salary            : "+salary);
		System.out.println("Federal Tax       : " +tax);
		System.out.println("Sales Bonus       : "+incen);
		System.out.println("Insurance         : "+insur);
		System.out.println("========================================");
		System.out.println("Total Salary      : "+totSalary );
		System.out.println("----------------------------------------");
		
	}

}
