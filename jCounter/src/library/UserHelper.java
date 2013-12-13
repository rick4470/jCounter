/**
 * @author Vlad
 * @author Rick
 */
package library;

import java.sql.Date;
import model.AppUserModel;

public class UserHelper 
{
    private AppUserModel dataProvider;
    
    public UserHelper(AppUserModel dataSource)
    {
        dataProvider = dataSource;
    }

    public void CloneAsNew()
    {
        dataProvider.IsLoaded = false;
    }

    public void Save()
    {
        dataProvider.Save();
    }

    /**
     * @return the firstName
     */
    public String getFirstName()
    {
        return dataProvider.getFirstName();
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName)
    {
        this.dataProvider.setFirstName(firstName);
    }

    /**
     * @return the userId
     */
    public int getUserId()
    {
        return dataProvider.getUserId();
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(int userId)
    {
        this.dataProvider.setUserId(userId);
    }

    /**
     * @return the lastName
     */
    public String getLastName()
    {
        return dataProvider.getLastName();
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName)
    {
        this.dataProvider.setLastName(lastName);
    }

    /**
     * @return the gender
     */
    public String getGender()
    {
        return dataProvider.getGender();
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender)
    {
        this.dataProvider.setGender(gender);
    }

    /**
     * @return the DOB
     */
    public Date getDOB()
    {
        return dataProvider.getDOB();
    }

    /**
     * @param DOB the DOB to set
     */
    public void setDOB(Date DOB)
    {
        this.dataProvider.setDOB(DOB);
    }

    /**
     * @return the weight
     */
    public double getWeight()
    {
        return dataProvider.getWeight();
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(double weight)
    {
        this.dataProvider.setWeight(weight);
    }

    /**
     * @return the height
     */
    public double getHeight()
    {
        return dataProvider.getHeight();
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height)
    {
        this.dataProvider.setHeight(height);
    }

    /**
     * @return the activityLevel
     */
    public int getActivityLevel()
    {
        return dataProvider.getActivityLevel();
    }

    /**
     * @param activityLevel the activityLevel to set
     */
    public void setActivityLevel(int activityLevel)
    {
        this.dataProvider.setActivityLevel(activityLevel);
    }

    /**
     * @return the targetWeight
     */
    public double getTargetWeight()
    {
        return dataProvider.getTargetWeight();
    }

    /**
     * @param targetWeight the targetWeight to set
     */
    public void setTargetWeight(double targetWeight)
    {
        this.dataProvider.setTargetWeight(targetWeight);
    }

    /**
     * @param licenseId
     */
    public void setLicenseNumber(int licenseId)
    {
        dataProvider.setLicenceID(licenseId);
    }

    /**
     * @return the initialWeight
     */
    public double getInitialWeight()
    {
        return dataProvider.getInitialWeight();
    }

    /**
     * @param initialWeight the initialWeight to set
     */
    public void setInitialWeight(double initialWeight)
    {
        this.dataProvider.setInitialWeight(initialWeight);
    }
}
