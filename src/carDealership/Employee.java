package carDealership;

public class Employee {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	private boolean runCreditHistory(Customer customer){
		if(customer.getCredit() <= 600) {
			return true;
		}else {
			return false;
		}
	}
	
	public void handleCustomer(Customer customer, boolean finance, Vehicle vehicle) {
		if(finance == true) {
			boolean credit = runCreditHistory(customer);
			if(credit) {
				System.out.println("I think we can work out a finance option");
			} else {
				System.out.println("We ran your credit and are not going to be able to finance this car for you");
			}
		}
		if(customer.getCash() >= vehicle.getPrice()) {
			System.out.println("Seems like everything is in order lets get you into your new " + vehicle );
		} else {
			System.out.println("Sorry I dont think you can afford this car.");
		}
	}
}
