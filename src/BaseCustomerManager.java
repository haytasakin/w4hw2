import java.rmi.RemoteException;

public class BaseCustomerManager implements CustomerService {

	public void  Save(Customer customer) throws RemoteException, Exception {
		System.out.println("Saved to db"+customer.firstName );
 		
	}


}
