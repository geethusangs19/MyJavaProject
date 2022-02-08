package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MailServiceTemplate {

	private String serviceProviderName;
	private String mainBranchName;	
	private String customerCareNo;
	private int totalBranches;
	private ArrayList<String> shippingServices = new ArrayList<String>();	
	//private ArrayList<String> shippingRates = new ArrayList<String>();
	private HashMap<String, Double> shippingRates = new HashMap<String, Double>();
	
	public String getServiceProviderName() {
		return this.serviceProviderName;
	}
	public void setServiceProviderName(String mailProviderName) {
		this.serviceProviderName = mailProviderName;
	}
	
	public String getMainBranchName() {
		return this.mainBranchName;
	}
	public void setMainBranchName(String mainBranch) {
		this.mainBranchName = mainBranch;
	}
	
	public String getCustomerCareNo() {
		return this.customerCareNo;
	}
	public void setCustomerCareNo(String customerCreNo) {
		this.customerCareNo = customerCreNo;
	}
	
	public int getTotalBranches() {
		return this.totalBranches;
	}
	public void setTotalBranches(int totBranches) {
		this.totalBranches = totBranches;
	}
	
	public ArrayList<String> getShippingServices(){
		return shippingServices;
	}
	public void setShippingServices(ArrayList<String> shippingService) {
		this.shippingServices = shippingService;
	}
	
	public HashMap<String, Double> getShippingRates(){
		return shippingRates;
	}
	public void setShippingRates(HashMap<String, Double> shippingRate) {
		this.shippingRates = shippingRate;
	}
}

class USPS extends MailServiceTemplate implements MailServiceProviders
{
	public void setServiceProviderInfo() {
		setServiceProviderName("United States Postal Services");
		setTotalBranches(3000);
		setCustomerCareNo("+1 800-275-8777");
		setMainBranchName("New York");
		
		ArrayList<String> services = new ArrayList<String>();
		services.add("First Class");
		services.add("Parcel Select Ground");
		services.add("Priority Mail");
		services.add("Priority Express");		
		setShippingServices(services);
		
		HashMap<String, Double> rates = new HashMap<String, Double>();
		rates.put("Priority Express", 30.00d);
		rates.put("Priority Mail", 9.50d);
		rates.put("First Class", 6.50d);
		rates.put("Parcel Select Ground", 6.00d);
		setShippingRates(rates);
		
	}
	
	public void getServiceProviderInfo() {
		System.out.println("Service Provider  : " + (getServiceProviderName()));
		System.out.println("=====================================================================");
		System.out.println("Main Branch  : " + (getMainBranchName()));
		System.out.println("Total Branches :" + (getTotalBranches()));
	}
	
	public void getAvailableServices() {
		System.out.println("\nAvailable Services");
		System.out.println("=====================================================================");
		ArrayList<String> services = getShippingServices();
		for(String service : services){
			System.out.println(service);
		}
	}
	
	public void getRates() {
		System.out.println("\nShipping Rates");
		System.out.println("=====================================================================");
		HashMap<String, Double> shippingRates = getShippingRates();
		Iterator<Entry<String, Double>> rates = shippingRates.entrySet().iterator();
		while(rates.hasNext()) {
			Map.Entry<String, Double> rateEntry = rates.next();
			System.out.println(rateEntry.getKey() + " from $" + rateEntry.getValue());			
		}
		System.out.println("=====================================================================\n");
	}
	
	public ArrayList<String> getAllServices(){
		setServiceProviderInfo();
		return getShippingServices();
	}
	
	public HashMap<String, Double> getAllRates(){
		setServiceProviderInfo();
		return getShippingRates();
	}
}

class UPS extends MailServiceTemplate implements MailServiceProviders
{
	public void setServiceProviderInfo() {
		setServiceProviderName("United Shipping Services");
		setTotalBranches(3000);
		setCustomerCareNo("+1 866-493-7140");
		setMainBranchName("Chicago");
		
		ArrayList<String> services = new ArrayList<String>();
		services.add("Ground");
		services.add("Next Day Air");
		services.add("Next Day Air Saver");
		services.add("Second Day Air");
		services.add("Three Day Select");
		setShippingServices(services);
		
		HashMap<String, Double> rates = new HashMap<String, Double>();
		rates.put("Ground", 8.00d);
		rates.put("Next Day Air", 85.00d);
		rates.put("Next Day Air Saver", 65.00d);
		rates.put("Second Day Air", 55.00d);
		rates.put("Three Day Select", 35.00d);
		setShippingRates(rates);
		
	}
	
	public void getServiceProviderInfo() {
		System.out.println("Service Provider  : " + (getServiceProviderName()));
		System.out.println("=====================================================================");
		System.out.println("Main Branch  : " + (getMainBranchName()));
		System.out.println("Total Branches :" + (getTotalBranches()));
	}
	
	public void getAvailableServices() {
		System.out.println("\nAvailable Services");
		System.out.println("=====================================================================");
		ArrayList<String> services = getShippingServices();
		for(String service : services){
			System.out.println(service);
		}
	}
	
	public void getRates() {
		System.out.println("\nShipping Rates");
		System.out.println("=====================================================================");
		HashMap<String, Double> shippingRates = getShippingRates();
		Iterator<Entry<String, Double>> rates = shippingRates.entrySet().iterator();
		while(rates.hasNext()) {
			Map.Entry<String, Double> rateEntry = rates.next();
			System.out.println(rateEntry.getKey() + " from $" + rateEntry.getValue());			
		}
		System.out.println("=====================================================================\n");
	}
	
	public ArrayList<String> getAllServices(){
		setServiceProviderInfo();
		return getShippingServices();
	}
	
	public HashMap<String, Double> getAllRates(){
		setServiceProviderInfo();
		return getShippingRates();
	}
}

class FedEx extends MailServiceTemplate implements MailServiceProviders
{
	public void setServiceProviderInfo() {
		setServiceProviderName("Fed-Ex Shipping Services");
		setTotalBranches(1800);
		setCustomerCareNo("+1 800-419-4343");
		setMainBranchName("Newark");
		
		ArrayList<String> services = new ArrayList<String>();
		services.add("Ground");
		services.add("Next Day Air");
		services.add("Second Day Air");
		services.add("Three Day Select");		
		setShippingServices(services);
		
		HashMap<String, Double> rates = new HashMap<String, Double>();
		rates.put("Ground", 8.50d);
		rates.put("Next Day Air", 75.00d);
		rates.put("Second Day Air", 40.00d);
		rates.put("Three Day Select", 25.00d);
		setShippingRates(rates);
		
	}
	
	public void getServiceProviderInfo() {
		System.out.println("Service Provider  : " + (getServiceProviderName()));
		System.out.println("=====================================================================");
		System.out.println("Main Branch  : " + (getMainBranchName()));
		System.out.println("Total Branches :" + (getTotalBranches()));
	}
	
	public void getAvailableServices() {
		System.out.println("\nAvailable Services");
		System.out.println("=====================================================================");
		ArrayList<String> services = getShippingServices();
		for(String service : services){
			System.out.println(service);
		}
	}
	
	public void getRates() {
		System.out.println("\nShipping Rates");
		System.out.println("=====================================================================");
		HashMap<String, Double> shippingRates = getShippingRates();
		Iterator<Entry<String, Double>> rates = shippingRates.entrySet().iterator();
		while(rates.hasNext()) {
			Map.Entry<String, Double> rateEntry = rates.next();
			System.out.println(rateEntry.getKey() + " from $" + rateEntry.getValue());			
		}
		System.out.println("=====================================================================\n");
	}
	
	public ArrayList<String> getAllServices(){
		setServiceProviderInfo();
		return getShippingServices();
	}
	
	public HashMap<String, Double> getAllRates(){
		setServiceProviderInfo();
		return getShippingRates();
	}
}
