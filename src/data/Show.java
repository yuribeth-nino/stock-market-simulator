package data;
 
import companies.Companies;
import companies.CompanyDAO;
import companies.MYSQLCompanyDAO;
import data.SetUpData;
import investor.InvestorDAO;
import investor.Investors;
import investor.MYSQLInvestorDAO;

/**
*
* @author Ana Velazco, Yuribeth Contreras
*/
 
public class Show {
	
	private CompanyDAO dbCompany = new MYSQLCompanyDAO();
	private InvestorDAO dbInvestor = new MYSQLInvestorDAO();
    
	/**
    *
    * @param setData
    */
    public void dispayAllCompanies(SetUpData setData) {
         
        for(int i = 0; i<SetUpData.currentCom.size(); i++) {
             
            System.out.println("id: "+ (i+1));
            Companies c = SetUpData.currentCom.get(i);
            System.out.println(c);
            dbCompany.saveCompany(c);
             
        }
         
    }
    
     
    public void dispayAllInvestors(SetUpData setData){
         
        for(int i = 0; i<SetUpData.currentInv.size(); i++) {
                     
            System.out.println("id: "+ (i+1));
            Investors in = SetUpData.currentInv.get(i);
            System.out.println(in);
            dbInvestor.saveInvestor(in);
     
        }
    }
 
 
}
