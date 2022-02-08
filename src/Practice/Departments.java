package Practice;

public class Departments {

	
	public static void main(String[] args) {
		int noOfDepartments = 6;
		int deptID = 1;
		String collegeName = "Noorul Islam College of Engineering";
		String university = "Anna University";
		int builtYear = 1975;
		
		
		System.out.println("College Name               : " +collegeName);
		System.out.println("=================================================================================");
		System.out.println("Built Year                 : " +builtYear);
		System.out.println("University                 : " +university);
		System.out.println("Total no of Departments    : " +noOfDepartments + "\n\n");
		while(deptID <= noOfDepartments) {
			getDeptDetails(deptID);
			deptID++;
		}

	}
	
	public static void getDeptDetails(int deptID) {
					
		switch(deptID) {
		case 1:
			printDeptDetails("Computer Science", 75, 35, 40, 77.78);
			break;
		case 2:
			printDeptDetails("Information Technology", 85, 43, 42, 79.45);
			break;
		case 3:
			printDeptDetails("Electronics and Communication", 100, 56, 44, 78.65);
			break;			
		case 4:
			printDeptDetails("Mechanical", 90, 72, 18, 79.98);
			break;
		case 5:
			printDeptDetails("Electrical and Electronics", 98, 53, 45, 80.09);
			break;
		case 6:
			printDeptDetails("Aeronautical", 100, 70, 30, 78.88);
			break;
		}
	}

	public static void printDeptDetails(String deptName, int noOfStudents, int totalBoys, int totalGirls, double avgPercentage) {
		System.out.println("Department Name            : " + deptName + " Engineering");
		System.out.println("==================================================================================");
		System.out.println("Total Number of Students   : " + noOfStudents);
		System.out.println("Total Boys                 : " + totalBoys);
		System.out.println("Total Girls                : " + totalGirls);
		System.out.println("Average Percentage         : " + avgPercentage);
		System.out.println("==================================================================================");
	}
}
