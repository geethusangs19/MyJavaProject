package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentRecords {

	public static void main(String[] args) {
		
		System.out.println("Enter Department ID(1-6)\n");
		Scanner input = new Scanner(System.in);
		int deptId = input.nextInt();
		input.close();
		Departments.getDeptDetails(deptId);
		getStudentDetails(deptId);
	
	}
	
	public static void getStudentDetails(int deptID) {
		ArrayList<String> studentNames = new ArrayList<String>();
		ArrayList<String> birthPlaces = new ArrayList<String>();
		switch(deptID) {
		case 1:
			studentNames.add("Deepthy Vishnu"); studentNames.add("Aadhitya Raghavan"); 
			studentNames.add("Reshma Vishal"); studentNames.add("Vinay Sarja");
			birthPlaces.add("Palakkad"); birthPlaces.add("Chennai");
			birthPlaces.add("Hyderabad"); birthPlaces.add("Bangalore");
			printStudentDetails(studentNames, birthPlaces, 100);
			break;
		case 2:
			studentNames.add("Anand Ramakrishnan"); studentNames.add("Amaya Shetty"); 
			studentNames.add("Priya Nandha"); studentNames.add("Shravan Kumar");
			birthPlaces.add("Trichy"); birthPlaces.add("Mumbai");
			birthPlaces.add("Coimbatore"); birthPlaces.add("Chennai");
			printStudentDetails(studentNames, birthPlaces, 200);
			break;
		case 3:
			studentNames.add("Keerthana Anand"); studentNames.add("Ajith Sivaprakasam"); 
			studentNames.add("Preethi Goyal"); studentNames.add("Adrian Kumar");
			birthPlaces.add("Erode"); birthPlaces.add("Madurai");
			birthPlaces.add("Mumbai"); birthPlaces.add("Palakkad");
			printStudentDetails(studentNames, birthPlaces, 300);
			break;			
		case 4:
			studentNames.add("Karthick Gurumoorthy"); studentNames.add("Parvathy Menon"); 
			studentNames.add("Ameera Akmal"); studentNames.add("Natesh Prabhu");
			birthPlaces.add("Chennai"); birthPlaces.add("Palakkad");
			birthPlaces.add("Hyderabad"); birthPlaces.add("Nagercoil");
			printStudentDetails(studentNames, birthPlaces, 400);
			break;
		case 5:
			studentNames.add("Arvind Kumar"); studentNames.add("Alwin Vijay"); 
			studentNames.add("Adrian Kumar"); studentNames.add("Vijay Shekar");
			birthPlaces.add("Trichy"); birthPlaces.add("Chennai");
			birthPlaces.add("Coimbatore"); birthPlaces.add("Mumbai");
			printStudentDetails(studentNames, birthPlaces, 500);
			break;
		case 6:
			studentNames.add("Vijay Joshep"); studentNames.add("Vidhya Anand"); 
			studentNames.add("Arjun Krishna"); studentNames.add("Nandha Vishwa");
			birthPlaces.add("Chennai"); birthPlaces.add("Madurai");
			birthPlaces.add("Hyderabad"); birthPlaces.add("Palakkad");
			printStudentDetails(studentNames, birthPlaces, 600);
			break;
		default:
			System.out.println("This Department doesn't Exist");
			break;
		}

	}
	
	public static void printStudentDetails(ArrayList<String> studentNames, ArrayList<String> birthPlaces, int studentIDGenerator) {
		
		System.out.println("Student Details");
		System.out.println("=================================================================================");
		int myInt = 0;
		int totalStudents = studentNames.size();
		while(myInt < totalStudents) {
			System.out.println("Student Name               : " + studentNames.get(myInt));
			System.out.println("Student ID                 : " + (++studentIDGenerator));
			System.out.println("Birth Place                : " + birthPlaces.get(myInt));
			System.out.println("\n\n");
			myInt++;
		}
		
	}
}
