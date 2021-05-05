
public class CustomerManager implements CustomerService  {

	
	private Customer[] customers;
	public CustomerManager(Customer[] customers) {
	
		this.customers = customers;
	}
	public void log(String customer) {
		// TODO Auto-generated method stub
		System.out.println("Customer is"+ customer + "saved ");
	}

}
