
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer[] customers = { new StarbucksCustomer() , new NeroCustomer()};
		CustomerManager cmanager = new CustomerManager(customers);
		Customer tugba = new Customer(1,"tugba","özkan","05-09-1995");
		StarbucksCustomer starbucksCustomer = new StarbucksCustomer();
		cmanager.log(tugba);
		starbucksCustomer.name = tugba.name;
		starbucksCustomer.id = 2 ;
		starbucksCustomer.datetime = tugba.datetime;
		starbucksCustomer.nationalityId = "11122233344";
		StarbucksCustomerManager customerManager = new StarbucksCustomerManager();
		
		
	}

	
}
