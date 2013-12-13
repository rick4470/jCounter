/**
 *
 * @author Rick
 */
package library;

import java.sql.SQLException;
import model.AuthenticationModel;

public class AuthenticationHelper 
{
    private AuthenticationModel dataModel;
    
    public AuthenticationHelper(AuthenticationModel model)
    {
        dataModel = model;
    }
    
    /**
     * @param key
     * @return the findLicenseNumber in DB
     * @throws java.sql.SQLException
     */
    public boolean findLicenseID(String key) throws SQLException
    {
        return dataModel.findLicenseNumber(key);
    }

    /**
     * @param licenseNumber the licenseNumber to set
     */
    public void setLicenseNumber(String licenseNumber)
    {
        dataModel.setLicenseNumber(licenseNumber);
    }
    
    
    /**
     * @param key
     * @return the findLicenseNumber in DB
     * @throws java.sql.SQLException
     */
    public boolean findUserByLicense(String key) throws SQLException
    {
        return dataModel.findUserByLicense(key);
    }

    public int getLicenseID()
    {
        return dataModel.getLicenseID();
    }
    
    public int getUserID() throws SQLException
    {
        return dataModel.getUsersID();
    }
}
