package transactions;

import java.util.ArrayList;
/**
*
* @author  Ana Velazco, Yuribeth Contreras
*/
public interface TransactionDAO {
	
		public ArrayList<Transactions> getTransactions();
		
		public boolean saveTransactions(Transactions transactions);


}
