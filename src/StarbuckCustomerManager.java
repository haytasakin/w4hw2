import java.rmi.RemoteException;

public class StarbuckCustomerManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;

	public StarbuckCustomerManager(CustomerCheckService customerCheckService) {
	
	this.customerCheckService=customerCheckService;
	
	}
	
	public void Save(Customer customer) throws Exception{
		if(this.customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);

			
		}
		else {
			System.out.println("not a valid person");
			
		}
		
		

	}


	
	
}
