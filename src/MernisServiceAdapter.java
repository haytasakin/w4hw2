import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
import java.rmi.RemoteException;



public class MernisServiceAdapter implements CustomerCheckService {

	
	
	@Override
	public boolean CheckIfRealPerson(Customer customer) throws RemoteException {
		
KPSPublicSoapProxy kpsPublic=new KPSPublicSoapProxy();
		
		return kpsPublic.TCKimlikNoDogrula(
				Long.parseLong(customer.getNationalityId()),
				customer.getFirstName().toUpperCase(),
				customer.getLastName().toUpperCase(), 
				customer.getDateOfBirth());
		
				
	}

	
}
