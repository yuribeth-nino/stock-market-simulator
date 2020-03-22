package companies;

import java.sql.ResultSet;
import java.util.ArrayList;

import data.DataSource;
/**
*
* @author  Ana Velazco, Yuribeth Contreras
*/

public class MYSQLCompanyDAO implements CompanyDAO {
	
	//get all companies
	@Override
	public ArrayList<Companies> getCompanies() {
		// TODO Auto-generated method stub
		
		ArrayList<Companies> companies = new ArrayList<Companies>();
		
		String query = "select * from companies";
		
		DataSource db = DataSource.getInstance();
		
		ResultSet rs = db.select(query);
		
		try {
			while(rs.next()) {
				
				int id = rs.getInt("id");
				String Companyname = rs.getString("Companyname");
				int numberofshares = rs.getInt("numberofshares");
				int sharedprice = rs.getInt("sharedprice");
				
			}
		} catch(Exception e) {
			System.out.println(e);
		}
		
		return companies;
	}

	/*@Override
	public int getCompanyUniqueID() {
		// TODO Auto-generated method stub
		
		return 0;
	}
	*/
	//save companies
	@Override
	public boolean saveCompany(Companies companies) {
		// TODO Auto-generated method stub
		
		DataSource db = DataSource.getInstance();
		
		String companyName = companies.getName();
		int numbershares = companies.getNumberShares();
		int sharePrice = companies.getSharePrice();
		
		String query = " insert into companies (companyName, numberShares, sharePrice) values('" + companyName + "', '" + numbershares + "', '" + sharePrice + "')";
		
		boolean result = db.save(query);
	
		
		return result;
	}

}
