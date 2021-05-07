

public class StarbucksCustomerManager implements CustomerService {  
	private PersonCheckService _personcheckservice;
	@Override
	public void log(Customer customer) {
		// TODO Auto-generated method stub
		if(_personcheckservice.CheckIfRealPerson(customer))
		{
			System.out.println("The Starbucks Customer's national identity is ture.");

			System.out.println(customer.name + customer.surname);
		}
		else {
			System.out.println("Not a valid person");
		}
	}
	
	
	

}
