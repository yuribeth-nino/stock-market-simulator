package companies;

import java.util.ArrayList;
/**
*
* @authorAna Velazco, Yuribeth Contreras
*/
public interface CompanyDAO {
	public ArrayList<Companies> getCompanies();
	//public int getCompanyUniqueID();
	public boolean saveCompany(Companies companies);

}
