package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class MailServiceApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		security(input);		
		input.close();
	}
	
	public static void viewProvideInfo(int serviceProviderID) {			
		switch(serviceProviderID) {
		case 1:
			USPS objUSPS = new USPS();
			objUSPS.setServiceProviderInfo();
			objUSPS.getServiceProviderInfo();
			objUSPS.getAvailableServices();
			objUSPS.getRates();				
			break;
		case 2:
			UPS objUPS = new UPS();
			objUPS.setServiceProviderInfo();
			objUPS.getServiceProviderInfo();
			objUPS.getAvailableServices();
			objUPS.getRates();
			break;
		case 3:
			FedEx objFedEx = new FedEx();
			objFedEx.setServiceProviderInfo();
			objFedEx.getServiceProviderInfo();
			objFedEx.getAvailableServices();
			objFedEx.getRates();				
			break;
		default:
			System.out.println("Service Provider doesn't exist!");
		}
	}
	
	public static void security(Scanner input) {
		System.out.println("Are you an Admin? Y/N\n");
		if(input.hasNext()) {
			String isAdmin = input.nextLine();
			if(isAdmin.equalsIgnoreCase("Y")) {
				boolean isAdministrator = getAdminAccess(input);
				if(isAdministrator) {
					System.out.println("\nAccess Granted! Welcome Admin!\n");
					getAdminOptions(input);
				}
				getAdminOptions(input);
			}
			else if(isAdmin.equalsIgnoreCase("N")){
				viewDetails(input, 0);
			}
			else {
				System.out.println("Please say Y/N");
			}
		}
		
	}
	
	public static void welcome() {
		System.out.println("Welcome to the Mail Service Application!\n");
	}
	
	public static boolean getAdminAccess(Scanner input) {
		String username = "";
		String password = "";
		String passCode = "";
		int loginType = 0;
		boolean isGranted = false;
		System.out.println("\nWhat's your Login Preference?\n 1. Credentials \n2. Passcode\n");
		if(input.hasNext()) {
			loginType = input.nextInt();
			Security security = new Security();
			if(loginType == 1) {
				System.out.println("Enter Admin UserName");
				username = input.nextLine();
				if(input.hasNextLine()) {
					username = input.nextLine();
					System.out.println("Enter Admin Password\n");
					if(input.hasNextLine()) {
						password = input.nextLine();
					}					
				}				
				isGranted = security.checkAccess(username, password);
			}
			else {
				System.out.println("Enter Admin PassCode\n");
				passCode = input.nextLine();
				
				isGranted = security.checkAccess(passCode);
			}
		}	
		return isGranted;
	}
	
	public static void getAdminOptions(Scanner input) {
		int providerID = 0;
		int option = 0;
		System.out.println("\nSelect Service Provider : \n1.USPS\n2.UPS\n3.Fed-Ex\n");
		if(input.hasNextInt()) {
			providerID = input.nextInt();
		}
		System.out.println("\nSelect Option : \n1.Add Service\n2.Edit Service\n3.Add Rate\n 4.Edit Rate\n5.Delete Service\n6.Delete Rate\n7.View All\n");
		if(input.hasNextInt()) {
			option = input.nextInt();
		}
		if(option == 7) {
			viewDetails(input, providerID);
		}
		else {
			switch(option) {
			case 1:
				System.out.println("Enter New Service Name");				
				if(input.hasNext()) {
					addEditRemoveService(providerID, "Test", 1);	
				}
				break;
			case 2:
				System.out.println("edit service");
				break;
			case 3:
				System.out.println("Add Rate");
				break;
			case 4:
				System.out.println("Edit Rate");
				break;
			case 5:
				addEditRemoveService(providerID, "Ground", 3);
				break;
			case 6:
				System.out.println("Delete Rate");
			}
		}		
	}
	
	public static void viewDetails(Scanner input, int providerID) {
		if(providerID == 0) {
			System.out.println("Select Service Provider : \n1.USPS\n2.UPS\n3.Fed-Ex\n");
			if(input.hasNextInt()) {
				providerID = input.nextInt();
			}
		}
		viewProvideInfo(providerID);
	}
	
	
	
	public static void addEditRemoveService(int providerID, String newService, int option) {
		if(providerID > 0 && !newService.isEmpty()) {
			ArrayList<String> services = new ArrayList<String>();
			AddEditMailService objAddEdit = new AddEditMailService();
			switch(providerID) {
			case 1:
				USPS objUSPS = new USPS();
				services = objUSPS.getAllServices();
				break;
			case 2:
				UPS objUPS = new UPS();
				services = objUPS.getAllServices();
				break;
			case 3:
				FedEx objFedEx = new FedEx();
				services = objFedEx.getAllServices();
				break;
			}	
			
			switch(option) {
			case 1:
				objAddEdit.addService(services, newService);
				break;
			case 2:
				System.out.println("Edit");;
				break;
			case 3:
				objAddEdit.deleteService(services, newService);
			}
			
		}
	}
}
