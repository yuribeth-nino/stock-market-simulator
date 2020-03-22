package investor;

import java.util.ArrayList;
/**
*
* @author  Ana Velazco, Yuribeth Contreras
*/
public interface InvestorDAO {
	public ArrayList<Investors> getInvestors();
	//public int getInvestorUniqueID();
	public boolean saveInvestor(Investors investors);

}
