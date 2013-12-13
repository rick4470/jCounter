/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.*;

/**
 *
 * @author Vlad
 */
public class WeekdayFactory
{

    public static WeekdayHelper CreateInstance()
    {
        WeekdayModel data = new WeekdayModel();

        WeekdayHelper weekday = new WeekdayHelper(data);

        return weekday;
    }

    public static WeekdayHelper CreateInstance(int weekDayId) throws SQLException
    {
        WeekdayModel data = new WeekdayModel();

        data.loadRowByPrimaryKey(weekDayId);

        WeekdayHelper weekday = new WeekdayHelper(data);

        return weekday;
    }
    
    public static WeekdayHelper GetCurrentInstance(int userId) throws SQLException
    {
        WeekdayModel data = new WeekdayModel();

        int weekDayId = data.getCurrentIdByUserId(userId);
        
        if(weekDayId == 0)
        {
            data.setAppUserId(userId);
            data.Save();
            weekDayId = data.getCurrentIdByUserId(userId); //re-getting the id. Limitation of design
        }

        WeekdayHelper weekday = new WeekdayHelper(data);

        return weekday;
    }

    //Creates collection directly
    public static List<WeekdayHelper> CreateCollectionInstance(int userId) throws SQLException
    {
        List<WeekdayHelper> itemCollection = new ArrayList<>();
        WeekdayModel data = new WeekdayModel();

        List<Integer> itemList = data.getLastSevenIdsByUserId(userId);

        if (itemList.size() > 0)
        {
            for (Integer id : itemList)
            {
                WeekdayHelper weekday = CreateInstance(id);
                itemCollection.add(weekday);
            }
        }

        return itemCollection;
    }
}
