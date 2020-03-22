package data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
 
import companies.Companies;
import data.Data;
import investor.Investors;
import transactions.Transactions;
 
/**
*
* @author Ana Velazco, Yuribeth Contreras
*/
public class SetUpData {
     
    int numofData = 200;
    //get a maximum of companies of 100
    public static int maxCompanies = 100;
    //get a maximum of investors of 100
    public static int maxInvestors = 100;
     
    public Data sD = new Data();
    //creating my arrays 
    public static ArrayList<Companies> currentCom = new ArrayList();
    public static ArrayList<Investors> currentInv = new ArrayList();
    public static ArrayList<Transactions> currentTran = new ArrayList();
     
    Random rDom = new Random();
     
     
    public void getDataComp() {
        createDataComp();
        fillCompanies();
    }
     
    public void getDataInv() {
        createDataInv();
        fillInvestors();
    }
     
    public void createDataComp() {
        for( int i = 0; i< maxCompanies; i++) {
            currentCom.add(new Companies());
     
        }
    }
    public void createDataInv() {
        for( int i = 0; i< maxInvestors; i++) {
            currentInv.add(new Investors());
        }
    }
    // for each company set a random name from the class Data also set number of shares 
    //and share price in a random way 
    public void fillCompanies() {
        for (Companies c : currentCom) {
            c.setName(sD.name[rDom.nextInt(sD.name.length)]);
            int r = ThreadLocalRandom.current().nextInt(500, 1001);
            c.setNumberShares(r);
            int p = ThreadLocalRandom.current().nextInt(10, 101);
            c.setSharePrice(p);
        }
    }
    // for each investor  set a random name from the class Data also set a random budget 
    //from 1000 to 10000
    public void fillInvestors() { 
        for (Investors i : currentInv) {
             i.setName(sD.investors[rDom.nextInt(sD.investors.length)]);
             int b = ThreadLocalRandom.current().nextInt(1000, 10001);
             i.setBudget(b);
        }
    }
    
    // Get Random companies that have shares
    public int getRandomCompanyID(){
        int comp = currentCom.stream().filter(companies -> companies.getNumberShares() > 0)
                .skip((int) (currentCom.stream().filter(companies -> companies.getNumberShares() > 0)
                .count() * Math.random())).findFirst().get().getNumberShares();
        
        return comp;
    };
    
    // Get Random Investors with enough money in their budget
    public int getRandomInvestorID(){
        int invest = currentInv.stream().filter(investor -> investor.getBudget() > 0)
                .skip((int) (currentInv.stream().filter(investor -> investor.getBudget() > 0)
                .count() * Math.random())).findFirst().get().getBudget();
        
        return invest;
    };
  
 // Check if companies have shares
    public int getMaxCompanyShares(){
        int maxShares = currentCom.parallelStream().max(Comparator.comparing(p -> ((Companies) p).getNumberShares()))
        				.get().getNumberShares();
        return maxShares;
    };
    
 // Find the minimum of the share price
    public int getMinSharePrice(){
        int minSharePrice = currentCom.parallelStream().filter(companies -> companies.getNumberShares() > 0)
                			.min(Comparator.comparing(p -> ((Companies) p).getSharePrice())).get().getSharePrice();
        return minSharePrice;
    };
    
    // Find the maximum of the Investor budget
    public int getMaxInvestorBudget(){
        int maxBudget = currentInv.parallelStream().max(Comparator.comparing(p -> ((Investors) p).getBudget()))
        					.get().getBudget() ;
        return maxBudget;
    };
    
    //Get Companies by ID
    public Companies getCompany(int id){
       
    	Companies comp = currentCom.stream().filter(companies -> id == companies.getNumberShares()).findAny().orElse(null);
        return comp;
    };
    //transactions
    public void transaction(){
    	
    	//try the following rules
        try{
        	
            int invs = getRandomInvestorID();
            int comp = getRandomCompanyID();
          
            // Update companies if 10shares are sold 
            boolean updateSharePrice = getCompany(comp).getSharesSold() > 0 && getCompany(comp).getSharesSold()% 10 == 0;
            
            //the share price should double up
            if (updateSharePrice){	 
                getCompany(comp).setSharePrice(getCompany(comp).getSharePrice()  * 2);
            }
   
        }catch (Exception e){
              System.out.println(e);
        }
    };
   
}
