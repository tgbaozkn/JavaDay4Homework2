
public class CustomerManager implements CustomerService  {

	
	private Customer[] customers;
	public CustomerManager(Customer[] customers) {
	
		this.customers = customers;
	}
	public void log(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Customer is"+ customer.name+ " "+ customer.surname + "saved to db. ");
	}

}
