/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.sql.Date;
import model.WeekdayModel;

/**
 *
 * @author Vlad
 */
public class WeekdayHelper
{

    private WeekdayModel dataProvider;

    public WeekdayHelper(WeekdayModel dataSource)
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
     * @return the weekDayId
     */
    public int getWeekDayId()
    {
        return dataProvider.getWeekDayId();
    }

    /**
     * @param weekDayId the weekDayId to set
     */
    public void setWeekDayId(int weekDayId)
    {
        this.setWeekDayId(weekDayId);
    }

    /**
     * @return the dateCreated
     */
    public Date getDateCreated()
    {
        return dataProvider.getDateCreated();
    }

    /**
     * @param dateCreated the dateCreated to set
     */
    public void setDateCreated(Date dateCreated)
    {
        this.dataProvider.setDateCreated(dateCreated);
    }

    /**
     * @return the appUserId
     */
    public int getAppUserId()
    {
        return dataProvider.getAppUserId();
    }

    /**
     * @param appUserId the appUserId to set
     */
    public void setAppUserId(int appUserId)
    {
        this.dataProvider.setAppUserId(appUserId);
    }
}
