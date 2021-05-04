import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.*;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BaseCustomerManager customerManager=new StarbuckCustomerManager(new MernisServiceAdapter());
		customerManager.Save(new Customer(1,"SAKÝN","HAYTA","111111111",1994));
		
		
	}

}
