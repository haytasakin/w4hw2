import java.rmi.RemoteException;

public interface CustomerCheckService  {


	boolean CheckIfRealPerson = false;

	boolean CheckIfRealPerson(Customer customer) throws RemoteException;
}
