package Practice;

import java.util.ArrayList;
import java.util.HashMap;

public class AddEditMailService {
	public void addService(ArrayList<String> lstServices, String service) {
		if(lstServices != null && !service.isEmpty()) {
			lstServices.add(service);
			System.out.println("The new Service has been added Successfully");
			System.out.println(lstServices);
		}
		else {
			System.out.println("Something went wrong");
		}
	}
	
	public void addRate(HashMap<String, Double> rates, String service, Double rate) {
		if(rates != null && !service.isEmpty() && rate > 0) {
			rates.put(service, rate);
			System.out.println("The new Rate has been added successfully");
		}
		else {
			System.out.println("Something went wrong");
		}
	}
	
	public void deleteService(ArrayList<String> lstServices, String service) {
		if(lstServices.size() > 0 && !service.isEmpty()) {
			if(lstServices.contains(service)) {
				lstServices.remove(service);
			}
			System.out.println("The new Service has been removed Successfully");
			System.out.println(lstServices);
		}
	}
}
