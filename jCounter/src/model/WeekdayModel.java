/**
 * @author Vlad
 * @author Rick
 */
package model;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WeekdayModel extends Model
{

    private ResultSet data;
    private int weekDayId;
    private Date dateCreated;
    private int appUserId;

    @Override
    public void loadRowByPrimaryKey(Object id) throws SQLException
    {
        String sqlStatement = "select * from WeekDay where WeekDayId = " + id.toString();
        setData(super.executeSelectQuery(sqlStatement));

        if (getData().isBeforeFirst())
        {
            getData().next();

            weekDayId = getData().getInt("WeekDayId");
            dateCreated = getData().getDate("DateCreated");
            appUserId = getData().getInt("AppUserId");

            IsLoaded = true;
        }
        else
        {
            IsLoaded = false;
        }

        super.closeConnection();
    }

    public List<Integer> getLastSevenIdsByUserId(Integer userId) throws SQLException
    {
        String sqlStatement = "select WeekDayId from WeekDay where AppUserId = " + userId.toString() + " order by datecreated desc Limit 7";
        setData(super.executeSelectQuery(sqlStatement));


        List<Integer> itemIdList = new ArrayList<>();

        if (getData().isBeforeFirst())
        {
            while (data.next())
            {
                itemIdList.add(getData().getInt("WeekDayId"));
            }
        }

        super.closeConnection();

        return itemIdList;
    }
    
    public int getCurrentIdByUserId(Integer userId) throws SQLException
    {
        int result = 0;
        
        String sqlStatement = "select * from WeekDay where Date(DateCreated) = Date(Now()) And AppUserId = " + userId.toString() + " Limit 1";
        setData(super.executeSelectQuery(sqlStatement));
        
        if (getData().isBeforeFirst())
        {
            getData().next();
            result = getData().getInt("WeekDayId");
            weekDayId = getData().getInt("WeekDayId");
            dateCreated = getData().getDate("DateCreated");
            appUserId = getData().getInt("AppUserId");

            IsLoaded = true;
        }else{
            IsLoaded = false;
        }

        super.closeConnection();

        return result;
    }

    //Based on our latest design, we default to today's date in every case. One record per day per user is expected
    //The Save method doesn't refresh the data. Need to re-query in factory
    public void Save()
    {
        String sqlStatement = "";

        if (!IsLoaded)
        {
            sqlStatement = "INSERT INTO `java`.`WeekDay` "
                    + "( "
                    + "`DateCreated`,"
                    + "`AppUserId`)"
                    + "VALUES"
                    + "("
                    + " Now()," //"'" + dateCreated + "',"
                    + "" + appUserId + ")";
        }
        else
        {
            sqlStatement = "UPDATE `java`.`Weekday` SET "
                    + "`DateCreated` = Now(), " // '" + dateCreated + "',"
                    + "`AppUserId` = " + appUserId
                    + "WHERE `WeekDayID` = " + weekDayId;

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
     * @return the weekDayId
     */
    public int getWeekDayId()
    {
        return weekDayId;
    }

    /**
     * @param weekDayId the weekDayId to set
     */
    public void setWeekDayId(int weekDayId)
    {
        this.weekDayId = weekDayId;
    }

    /**
     * @return the dateCreated
     */
    public Date getDateCreated()
    {
        return dateCreated;
    }

    /**
     * @param dateCreated the dateCreated to set
     */
    public void setDateCreated(Date dateCreated)
    {
        this.dateCreated = dateCreated;
    }

    /**
     * @return the appUserId
     */
    public int getAppUserId()
    {
        return appUserId;
    }

    /**
     * @param appUserId the appUserId to set
     */
    public void setAppUserId(int appUserId)
    {
        this.appUserId = appUserId;
    }
}
