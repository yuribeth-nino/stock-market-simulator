package investor;

import java.sql.ResultSet;
import java.util.ArrayList;

import data.DataSource;
/**
*
* @author Ana Velazco, Yuribeth Contreras
*/
public class MYSQLInvestorDAO implements InvestorDAO {
	
	@Override
	public ArrayList<Investors> getInvestors() {
		// TODO Auto-generated method stub
ArrayList<Investors> investor = new ArrayList<Investors>();
		
		String query = "select * from investors";
		
		DataSource db = DataSource.getInstance();
		
		ResultSet rs = db.select(query);
		
		try {
			while(rs.next()) {
				
				int id = rs.getInt("id");
				String investorname = rs.getString("investorname");
				int budget = rs.getInt("budget");
				
			}
		} catch(Exception e) {
			System.out.println(e);
		}
		return investor;
	}

	//@Override
	/*public int getInvestorUniqueID() {
		// TODO Auto-generated method stub
		return 0;
	}
	*/
	
	@Override
	public boolean saveInvestor(Investors investors) {
		// TODO Auto-generated method stub
		
		DataSource db = DataSource.getInstance();
		
		String investorName = investors.getName();
		int budget = investors.getBudget();
		
		String query = " insert into investors (investorName, budget) values('" + investorName + "', '" + budget + "')";
		
		boolean result = db.save(query);
	
		return result;
	}
		
	}
	
