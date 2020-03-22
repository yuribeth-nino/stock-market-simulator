package simulator;

/**
*
* @author  Ana Velazco, Yuribeth Contreras
*/
import data.SetUpData;
import data.Show;
 
 
public class Simulator{
	
 
     static Show show = new Show();
      
    public Simulator(){
 
        }
     
    public static void DisplayComp(SetUpData setData) {
       show.dispayAllCompanies(setData);
    }
     
    public static void DisplayInv(SetUpData setData) {
        show.dispayAllInvestors(setData);
        }
     
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    	 	
        SetUpData com = new SetUpData();
        SetUpData inv = new SetUpData();
         
        //Companies.CompaniesBuilder myBuil = new Companies.CompaniesBuilder();
         
         
       com.getDataComp();
       
       inv.getDataInv();
         
        System.out.println("----Welcome To the Stock Market Simulator-----");
        System.out.println("-------------------Companies------------------");
        DisplayComp(com);
        System.out.println("-------------------Investors------------------");
        DisplayInv(inv);
    	
    }
}
