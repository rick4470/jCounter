/**
 * @author Vlad
 * @author Rick
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MealItemModel extends Model
{
    private ResultSet data;
    private int mealItemID;
    private int mealID;
    private String mealItemName;
    private double totalWeight;
    private double fatWeight;
    private double carbWeight;
    private double proteinWeight;
    private double sodium;
    private double totalCalories;

    public List<Integer> getItemListByMealId(Integer id) throws SQLException
    {
        String sqlStatement = "select mealItemId from MealItem where mealId = " + id.toString();
        setData(super.executeSelectQuery(sqlStatement));

        List<Integer> itemIdList = new ArrayList<>();

        if (getData().isBeforeFirst())
        {
            while (data.next())
            {
                itemIdList.add(getData().getInt("MealItemID"));
            }
        }

        super.closeConnection();
        
        return itemIdList;
    }

    public void loadRowByPrimaryKey(Integer id) throws SQLException
    {
        String sqlStatement = "select * from MealItem where MealID = " + id.toString();
        setData(super.executeSelectQuery(sqlStatement));

        if (getData().isBeforeFirst())
        {
            getData().next();

            mealItemID = getData().getInt("MealItemID");
            mealID = getData().getInt("MealID");
            mealItemName = getData().getString("mealItemName");
            totalWeight = getData().getDouble("TotalWeight");
            fatWeight = getData().getDouble("fatWeight");
            carbWeight = getData().getDouble("carbWeight");
            proteinWeight = getData().getDouble("proteinWeight");
            sodium = getData().getDouble("sodium");
            totalCalories = getData().getDouble("TotalCalories");

            IsLoaded = true;
        }
        else
        {
            IsLoaded = false;
        }

        super.closeConnection();
    }

    public void Save()
    {
        String sqlStatement = "";

        if (!IsLoaded)
        {
            sqlStatement = "INSERT INTO `java`.`MealItem` "
                    + "( "
                    + "`MealID`,"
                    + "`MealItemName`,"
                    + "`TotalWeight`,"
                    + "`FatWeight`,"
                    + "`CarbWeight`,"
                    + "`ProteinWeight`,"
                    + "`Sodium`,"
                    + "`TotalCalories`)"
                    + "VALUES"
                    + "("
                    + mealID + ","
                    + "'" + mealItemName + "',"
                    + totalWeight + ","
                    + fatWeight + ","
                    + carbWeight + ","
                    + proteinWeight + ","
                    + sodium + ","
                    + totalCalories + ")";
        }
        else
        {
            sqlStatement = "UPDATE `java`.`MealItem` SET "
                    + "`MealID` = " + mealID + ","
                    + "`mealItemName` = '" + mealItemName + "',"
                    + "`totalWeight` = " + totalWeight + ","
                    + "`fatWeight` = " + fatWeight + ","
                    + "`carbWeight` = " + carbWeight + ","
                    + "`proteinWeight` = " + proteinWeight + ","
                    + "`sodium` = " + sodium + ","
                    + "`TotalCalories` = " + totalCalories
                    + "WHERE `MealItemID` = " + mealItemID;
        }

        try
        {
            super.executeInsertUpdateDeleteQuery(sqlStatement);

            super.closeConnection();
        }
        catch (SQLException ex)
        {
            Logger.getLogger(MealItemModel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void loadLastMealItemByUserId(int userId) throws SQLException
    {
        String sqlStatement = "select mi.* from mealitem mi "
                                +"inner join meal ml on ml.MealID = mi.MealID "
                                +"inner join weekday wd on wd.WeekDayID = ml.WeekDayID "
                                +"where wd.AppUserId = " + userId
                                +" order by wd.DateCreated desc "
                                +"Limit 1";
         setData(super.executeSelectQuery(sqlStatement));
        
            if (getData().isBeforeFirst())
            {
                getData().next();

                mealItemID = getData().getInt("MealItemID");
                mealID = getData().getInt("MealID");
                mealItemName = getData().getString("mealItemName");
                totalWeight = getData().getDouble("TotalWeight");
                fatWeight = getData().getDouble("fatWeight");
                carbWeight = getData().getDouble("carbWeight");
                proteinWeight = getData().getDouble("proteinWeight");
                sodium = getData().getDouble("sodium");
                totalCalories = getData().getDouble("TotalCalories");

                IsLoaded = true;
            }
            else
            {
                IsLoaded = false;
            }
        
        super.closeConnection();
        
    }

    /**
     * @return the data
     */
    public ResultSet getData()
    {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(ResultSet data)
    {
        this.data = data;
    }

    /**
     * @return the mealItemID
     */
    public int getMealItemID()
    {
        return mealItemID;
    }

    /**
     * @param mealItemID the mealItemID to set
     */
    public void setMealItemID(int mealItemID)
    {
        this.mealItemID = mealItemID;
    }

    /**
     * @return the mealID
     */
    public int getMealID()
    {
        return mealID;
    }

    /**
     * @param mealID the mealID to set
     */
    public void setMealID(int mealID)
    {
        this.mealID = mealID;
    }

    /**
     * @return the mealItemName
     */
    public String getMealItemName()
    {
        return mealItemName;
    }

    /**
     * @param mealItemName the mealItemName to set
     */
    public void setMealItemName(String mealItemName)
    {
        this.mealItemName = mealItemName;
    }

    /**
     * @return the totalWeight
     */
    public double getTotalWeight()
    {
        return totalWeight;
    }

    /**
     * @param totalWeight the totalWeight to set
     */
    public void setTotalWeight(double totalWeight)
    {
        this.totalWeight = totalWeight;
    }

    /**
     * @return the fatWeight
     */
    public double getFatWeight()
    {
        return fatWeight;
    }

    /**
     * @param fatWeight the fatWeight to set
     */
    public void setFatWeight(double fatWeight)
    {
        this.fatWeight = fatWeight;
    }

    /**
     * @return the carbWeight
     */
    public double getCarbWeight()
    {
        return carbWeight;
    }

    /**
     * @param carbWeight the carbWeight to set
     */
    public void setCarbWeight(double carbWeight)
    {
        this.carbWeight = carbWeight;
    }

    /**
     * @return the proteinWeight
     */
    public double getProteinWeight()
    {
        return proteinWeight;
    }

    /**
     * @param proteinWeight the proteinWeight to set
     */
    public void setProteinWeight(double proteinWeight)
    {
        this.proteinWeight = proteinWeight;
    }

    /**
     * @return the sodium
     */
    public double getSodium()
    {
        return sodium;
    }

    /**
     * @param sodium the sodium to set
     */
    public void setSodium(double sodium)
    {
        this.sodium = sodium;
    }

    /**
     * @return the totalCalories
     */
    public double getTotalCalories()
    {
        return totalCalories;
    }

    /**
     * @param totalCalories the totalCalories to set
     */
    public void setTotalCalories(double totalCalories)
    {
        this.totalCalories = totalCalories;
    }
}
