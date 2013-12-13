/**
 * @author rick
 * 
 * 
 */

package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import library.AuthenticationFactory;
import library.AuthenticationHelper;

public class AuthenticationModel extends Model
{
    private ResultSet data;
    private int ID;
    private String licenseNumber;
    private int userID;
    
    public void loadRowByPrimaryKey(Integer id) throws SQLException
    {
        String sqlStatement = "select * from License where ID = " + id.toString();
        
        data = super.executeSelectQuery(sqlStatement);

        if (data.isBeforeFirst())
        {
            data.next();
            
            ID = data.getInt("ID");
            this.setLicenseNumber(data.getString("LicenseNumber"));
            
            IsLoaded = true;
        }
        else
        {
            IsLoaded = false;
        }

        super.closeConnection();
    }

    /**
     * @return the ID
     */
    public int getID()
    {
        return ID;
    }
    
    /**
     * @param key
     * @return the ID
     * @throws java.sql.SQLException
     * checks if user with entered password is a valid one
     */
    public boolean findUserByLicense(String key) throws SQLException
    {
        AuthenticationHelper authHelper = AuthenticationFactory.CreateInstance();
        authHelper.findLicenseID(key);
        
        String sqlStatement = "SELECT * from `AppUser` "
                      + "WHERE "
                      + "LicenseID = '"+authHelper.getLicenseID()+"'";
        
        data = super.executeSelectQuery(sqlStatement);

        if (data.isBeforeFirst())
        {
            data.next();
            
            userID = data.getInt("UserID");
            this.setLicenseNumber(data.getString("LicenseID"));
        }
        else
        {
            IsLoaded = false;
        }

        super.closeConnection();
        
        return userID != 0;
        
    }
    /**
     * @param key
     * @return the licenseNumber
     * @throws java.sql.SQLException
     */
    public boolean findLicenseNumber(String key) throws SQLException
    {
        String sqlStatement = "SELECT * from `License` "
                        + "WHERE "
                        + "LicenseNumber = '"+key+"'";
        
        data = super.executeSelectQuery(sqlStatement);

        if (data.isBeforeFirst())
        {
            data.next();
            
            ID = data.getInt("ID");
            this.setLicenseNumber(data.getString("LicenseNumber"));
        }
        else
        {
            IsLoaded = false;
        }

        super.closeConnection();
        
        return getLicenseNumber() != null && !licenseNumber.isEmpty();
    }

    /**
     * @param licenseNumber the licenseNumber to set
     */
    public void setLicenseNumber(String licenseNumber)
    {
        this.licenseNumber = licenseNumber;
    }
    
    public int getLicenseID()
    {
        return ID;
    }

    /**
     * @return the licenseNumber
     */
    public String getLicenseNumber()
    {
        return licenseNumber;
    }
    
    public int getUsersID()
    {
        return userID;
    }
}
