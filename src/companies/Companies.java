package companies;

/**
*
* @author  Ana Velazco, Yuribeth Contreras
*/
public class Companies {
	
    //set attributes 
    private String name;
    private int numberShares;
    private int sharePrice;
    private int sharesSold;
    
 // Defining the constructor
    private Companies(String name, int numberShares, int sharePrice) {
         
        this.name = name;
        this.numberShares = numberShares;
        this.sharePrice = sharePrice;
    }
     
    public Companies() {
         
    }
    //getters and setters methods
    public String getName() {
        return name;
    }
     
    public void setName(String name) {
        this.name = name;
    }
     
    public int getNumberShares() {
        return numberShares;
    }
 
    public void setNumberShares(int numberShares) {
        this.numberShares = numberShares;
    }
 
    public int getSharePrice() {
        return sharePrice;
    }
 
    public void setSharePrice(int sharePrice) {
        this.sharePrice = sharePrice;
    }
 
    public int getSharesSold() {
		return sharesSold;
	}

	public void setSharesSold(int sharesSold) {
		this.sharesSold = sharesSold;
	}

	//with this method we can return values of the companies class
    public String toString() {
         
        String arrayInfo;
        arrayInfo = "Company name: " + name + "\n";
        arrayInfo += "Random Number of Shares: " + numberShares + "\n";
        arrayInfo += "Random Share Price: " + sharePrice + "\n";
        return arrayInfo;
    }
    
    //instantiated without the need of an instance of the Companies class as it is static
    public static class CompaniesBuilder{

    // Same attributes as the companies class    
    private String name;
    private int numberShares;
    private int sharePrice;
    
     	//defining the mandatory attributes
        public CompaniesBuilder (String name, int numberShares, int sharePrice){
             
            this.name = name;
            this.numberShares = numberShares;
            this.sharePrice = sharePrice;
        }
        
        //method to return the instantiation of the companies
        public Companies build()
        {
             
            return new Companies(name, numberShares, sharePrice);
             
        }
}
 
}
