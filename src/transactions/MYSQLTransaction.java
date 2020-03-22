package transactions;

import java.util.ArrayList;
import java.sql.ResultSet;
import data.DataSource;

/**
*
* @author  Ana Velazco, Yuribeth Contreras
*/
public class MYSQLTransaction implements TransactionDAO{
	
		@Override
	public ArrayList<Transactions> getTransactions() {
			
			ArrayList<Transactions> transactions = new ArrayList<Transactions>();
			
			String query = "select * from transactions";
			
			DataSource db = DataSource.getInstance();
			
			ResultSet rs = db.select(query);
			
			try {
				while(rs.next()) {
					
					int id = rs.getInt("id");
					int companyId = rs.getInt("companyid");
					int investorId = rs.getInt("investorId");
					int price = rs.getInt("price");
				}
				
			} catch(Exception e) {
				System.out.println(e);
			}
			
			return transactions;
		}
		
	@Override
	public boolean saveTransactions(Transactions transactions) {
		
		DataSource db = DataSource.getInstance();
		
		
		int companyId = transactions.getCompanyId();
		int investorId = transactions.getInvestorId();
		int price = transactions.getPrice();
		
		String query = " insert into transactions(companyId, investorId, price) values('" + companyId + "', '" + investorId + "', '" + price + "')";
		
		boolean result = db.save(query);
	
		
		return result;
	}

}