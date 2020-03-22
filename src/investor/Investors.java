package investor;
/**
*
* @author Ana Velazco, Yuribeth Contreras
*/
public class Investors {
	 //set attributes
    private String name;
    private int budget;
    
 // Defining the constructor        
private Investors(String name, int budget) {
             
    this.name = name;
    this.budget = budget;
}
         
public Investors() {
 
}
//getters and setters methods
public String getName() {
    return name;
}
 
public void setName(String name) {
    this.name = name;
}
 
public int getBudget() {
    return budget;
}
 
public void setBudget(int budget) {
    this.budget = budget;
}

//toString method return values of the investors class
public String toString() {
     
    String arrayInfo;
    arrayInfo = "Investor name: " + name + "\n";
    arrayInfo += "Random Budget: " + budget + "\n";
    return arrayInfo;
}
//instantiated without the need of an instance of the investors class as it is static
public static class InvestorsBuilder{
	 // Same attributes as the investors class
    private String name;
    private int budget;
 
	//defining the mandatory attributes
    public InvestorsBuilder(String name, int budget){
        this.name = name;
        this.budget = budget;
    }
    
    //method to return the instantiation of the companies
    public Investors build(){
        return new Investors(name, budget);
    }
}
 
}
