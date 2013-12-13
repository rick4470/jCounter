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

public class MealModel extends Model
{

    private ResultSet data;
    private int mealID;
    private Date mealDate;
    private String mealName;
    private int weekDayID;

    public void loadRowByPrimaryKey(Integer id) throws SQLException
    {
        String sqlStatement = "select * from Meal where MealId = " + id.toString();
        setData(super.executeSelectQuery(sqlStatement));

        if (getData().isBeforeFirst())
        {
            getData().next();

            mealID = getData().getInt("MealID");
            mealName = getData().getString("MealName");
            mealDate = getData().getDate("MealDate");
            weekDayID = getData().getInt("WeekDayID");

            IsLoaded = true;
        }
        else
        {
            IsLoaded = false;
        }

        super.closeConnection();
    }
    
    public int getCurrentIdByWeekday(int weekDayId) throws SQLException
    {
        int result = 0;
        
        String sqlStatement = "select * from Meal where WeekDayID = " + weekDayId + " Limit 1";
        setData(super.executeSelectQuery(sqlStatement));

        if (getData().isBeforeFirst())
        {
            getData().next();

            mealID = getData().getInt("MealID");
            mealName = getData().getString("MealName");
            mealDate = getData().getDate("MealDate");
            weekDayID = getData().getInt("WeekDayID");
            
            IsLoaded = true;
            
            result = mealID;
        }else
        {
            IsLoaded = false;
        }

        super.closeConnection();
        
        return result;
    }
    
    public void loadCurrentRowByPrimaryKey(Integer id) throws SQLException
    {
        String sqlStatement = "select * from Meal where WeekDayID = " + id.toString();
        setData(super.executeSelectQuery(sqlStatement));

        if (getData().isBeforeFirst())
        {
            getData().next();

            mealID = getData().getInt("MealID");
            mealName = getData().getString("MealName");
            mealDate = getData().getDate("MealDate");
            weekDayID = getData().getInt("WeekDayID");

            IsLoaded = true;
        }
        else
        {
            IsLoaded = false;
        }

        super.closeConnection();
    }

    //in new design, default date to current datetime
    public void Save()
    {
        String sqlStatement = "";

        if (!IsLoaded)
        {
            sqlStatement = "INSERT INTO `java`.`Meal` "
                    + "( "
                    + "`MealDate`,"
                    + "`MealName`,"
                    + "`WeekDayID`)"
                    + "VALUES"
                    + "("
                    + " Now(), " //'" + mealDate + "',"
                    + "'" + mealName + "',"
                    + "" + weekDayID + ")";
        }
        else
        {
            sqlStatement = "UPDATE `java`.`Meal` SET "
                    + "`MealDate` = Now(), " //'" + mealDate + "',"
                    + "`MealName` = '" + mealName + "',"
                    + "`WeekDayID` = " + weekDayID
                    + "WHERE `MealID` = " + mealID;

        }

        try
        {
            super.executeInsertUpdateDeleteQuery(sqlStatement);

            super.closeConnection();
        }
        catch (SQLException ex)
        {
            Logger.getLogger(MealModel.class.getName()).log(Level.SEVERE, null, ex);
        }

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
     * @return the mealDate
     */
    public Date getMealDate()
    {
        return mealDate;
    }

    /**
     * @param mealDate the mealDate to set
     */
    public void setMealDate(Date mealDate)
    {
        this.mealDate = mealDate;
    }

    /**
     * @return the mealName
     */
    public String getMealName()
    {
        return mealName;
    }

    /**
     * @param mealName the mealName to set
     */
    public void setMealName(String mealName)
    {
        this.mealName = mealName;
    }

    /**
     * @return the weekDayID
     */
    public int getWeekDayID()
    {
        return weekDayID;
    }

    /**
     * @param weekDayID the weekDayID to set
     */
    public void setWeekDayID(int weekDayID)
    {
        this.weekDayID = weekDayID;
    }
}
