/**
 * @author Vlad
 * @author Rick
 */
package model;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppUserModel extends Model
{

    private ResultSet data;
    private int userId;
    private String firstName;
    private String lastName;
    private String gender;
    private Date DOB;
    private double weight;
    private double height;
    private int activityLevel;
    private double targetWeight;
    private double initialWeight;
    private int licenceID;

    /**
     * @return the firstName
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    /**
     * @return the userId
     */
    public int getUserId()
    {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(int userId)
    {
        this.userId = userId;
    }

    /**
     * @return the lastName
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    /**
     * @return the gender
     */
    public String getGender()
    {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender)
    {
        this.gender = gender;
    }

    /**
     * @return the DOB
     */
    public Date getDOB()
    {
        return DOB;
    }

    /**
     * @param DOB the DOB to set
     */
    public void setDOB(Date DOB)
    {
        this.DOB = DOB;
    }

    /**
     * @return the weight
     */
    public double getWeight()
    {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    /**
     * @return the height
     */
    public double getHeight()
    {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height)
    {
        this.height = height;
    }

    /**
     * @return the activityLevel
     */
    public int getActivityLevel()
    {
        return activityLevel;
    }

    /**
     * @param activityLevel the activityLevel to set
     */
    public void setActivityLevel(int activityLevel)
    {
        this.activityLevel = activityLevel;
    }

    /**
     * @return the targetWeight
     */
    public double getTargetWeight()
    {
        return targetWeight;
    }

    /**
     * @param targetWeight the targetWeight to set
     */
    public void setTargetWeight(double targetWeight)
    {
        this.targetWeight = targetWeight;
    }

    public void loadRowByLicenseId(int id) throws SQLException
    {
        String sqlStatement = "select * from AppUser where LicenseID = " + id;

        loadData(sqlStatement);
    }

    public void loadRowByPrimaryKey(Integer id) throws SQLException
    {
        String sqlStatement = "select * from AppUser where UserID = " + id.toString();

        loadData(sqlStatement);
    }

    private void loadData(String sqlStatement) throws SQLException
    {
        data = super.executeSelectQuery(sqlStatement);
        setData();

        super.closeConnection();
    }

    private void setData() throws SQLException
    {
        if (data.isBeforeFirst())
        {
            data.next();

            userId = data.getInt("UserID");
            firstName = data.getString("firstName");
            lastName = data.getString("lastName");
            DOB = data.getDate("DOB");
            activityLevel = data.getInt("ActivityLevel");
            gender = data.getString("Gender");
            weight = data.getDouble("Weight");
            height = data.getDouble("Height");
            targetWeight = data.getDouble("TargetWeight");
            licenceID = data.getInt("LicenseID");
            initialWeight = data.getDouble("InitialWeight");

            IsLoaded = true;
        }
        else
        {
            IsLoaded = false;
        }
    }

    public void Save()
    {
        String sqlStatement = "";

        if (!IsLoaded)
        {
            sqlStatement = "INSERT INTO `java`.`AppUser` "
                    + "( "
                    + "`LicenseID`,"
                    + "`FirstName`,"
                    + "`LastName`,"
                    + "`Gender`,"
                    + "`DOB`,"
                    + "`Weight`,"
                    + "`Height`,"
                    + "`ActivityLevel`,"
                    + "`TargetWeight`,"
                    + "`InitialWeight`)"
                    + "VALUES"
                    + "("
                    + "'" + licenceID + "',"
                    + "'" + firstName + "',"
                    + "'" + lastName + "',"
                    + "'" + gender + "',"
                    + "'" + DOB + "',"
                    + weight + ","
                    + height + ","
                    + activityLevel + ","
                    + targetWeight + ","
                    + initialWeight + ")";
        }
        else
        {
            sqlStatement = "UPDATE `java`.`appuser` SET "
                   // + "`FirstName` = " + "'" + firstName + "',"
                   // + "`LastName` = '" + lastName + "',"
                   // + "`Gender` = " + "'" + gender + "',"
                   // + "`DOB` = '" + DOB + "',"
                    + "`Weight` = " + weight + ","
                    + "`Height` = " + height + ","
                    + "`ActivityLevel` = " + activityLevel + ","
                   // "`TargetWeight` = " + targetWeight + ","
                   // + "`InitialWeight` = " + "'" + initialWeight + "'"
                    + "WHERE `UserID` = " + userId;

        }

        try
        {
            super.executeInsertUpdateDeleteQuery(sqlStatement);

            super.closeConnection();
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * @return the licenceID
     */
    public int getLicenceID()
    {
        return licenceID;
    }

    /**
     * @param licenceID the licenceID to set
     */
    public void setLicenceID(int licenceID)
    {
        this.licenceID = licenceID;
    }

    /**
     * @return the initialWeight
     */
    public double getInitialWeight()
    {
        return initialWeight;
    }

    /**
     * @param initialWeight the initialWeight to set
     */
    public void setInitialWeight(double initialWeight)
    {
        this.initialWeight = initialWeight;
    }
}
