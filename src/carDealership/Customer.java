package carDealership;

public class Customer {

	private String name;
	private String address;
	private int cash;
	private int credit;

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCash() {
		return cash;
	}

	public void setCash(int cash) {
		this.cash = cash;
	}

	public void purchaseCar(Vehicle vehicle, Employee emp, boolean finance) {
		if(finance) {
			System.out.println("my name is " + name + " and I am looking to finance this " + vehicle.getName() + ".");
		}else {
			System.out.println("my name is " + name + " and I am looking to buy this " + vehicle.getName() + ".");
		}
		emp.handleCustomer(this, finance, vehicle);
	}
}
