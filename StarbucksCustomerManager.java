
public class StarbucksCustomerManager implements CustomerService {

	@Override
	public void log(String customer) {
		// TODO Auto-generated method stub
		System.out.println("The Starbucks Customer's national identity is ture.");
		System.out.println(customer);
	}
	public void isRealPerson(StarbucksCustomer customer) {
		if (customer.nationalityId.length() == 11) {
			System.out.println("Your identity number is true.");
		}
	}

}
