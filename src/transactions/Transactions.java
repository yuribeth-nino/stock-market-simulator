package transactions;
/**
*
* @author  Ana Velazco, Yuribeth Contreras
*/
public class Transactions {
    private int id;
    private int companyId;
    private int investorId;
    private int price;
 
    private Transactions(int companyId, int investorId){
 
        this.companyId = companyId;
        this.investorId = investorId;
    }
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public int getCompanyId() {
        return companyId;
    }
 
    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }
 
    public int getInvestorId() {
        return investorId;
    }
 
    public void setInvestorId(int investorId) {
        this.investorId = investorId;
    }
 
    public int getPrice() {
        return price;
    }
 
    public void setPrice(int price) {
        this.price = price;
    }
 
    @Override
    public String toString() {
        String arrayInfo;
        arrayInfo  = "Transactions Id: " + id + "\n";
        arrayInfo += "Company Id: " + companyId + "\n"; 
        arrayInfo += "Investor Id: " + investorId + "\n"; 
        arrayInfo += "Price: " + price + "\n"; 
        return arrayInfo;
         
    }
     
    public static class TransactionsBuilder{
        private int companyId;
        private int investorId;
         
        public TransactionsBuilder (int companyId, int investorId) 
        {
            this.companyId = companyId;
            this.investorId = investorId;
        }
 
        public Transactions build() 
        {
            return new Transactions(companyId, investorId);
        }
}
}
