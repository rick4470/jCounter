/**
 * @author Vlad
 * @author Rick
 */
package library;

import java.sql.Date;
import model.MealModel;

public class MealHelper extends Subject implements Observer
{

    private MealModel dataModel;

    public MealHelper()
    {
    }

    MealHelper(MealModel model)
    {
        dataModel = model;
    }

    public void CloneAsNew()
    {
        dataModel.IsLoaded = false;
    }

    @Override
    public void Update(Subject subjectRef)
    {
        //check who notifies and update needed values. Fire setters to broadcast and bubble the event
    }

    /**
     * @return the mealID
     */
    public int getMealID()
    {
        return dataModel.getMealID();
    }

    /**
     * @param mealID the mealID to set
     */
    public void setMealID(int mealID)
    {
        dataModel.setMealID(mealID);
    }

    /**
     * @return the mealDate
     */
    public Date getMealDate()
    {
        return dataModel.getMealDate();
    }

    /**
     * @param mealDate the mealDate to set
     */
    public void setMealDate(Date mealDate)
    {
        this.dataModel.setMealDate(mealDate);
        super.NotifyObservers();
    }

    /**
     * @return the mealName
     */
    public String getMealName()
    {
        return dataModel.getMealName();
    }

    /**
     * @param mealName the mealName to set
     */
    public void setMealName(String mealName)
    {
        this.dataModel.setMealName(mealName);
        super.NotifyObservers();
    }

    /**
     * @return the weekDayID
     */
    public int getWeekDayID()
    {
        return dataModel.getWeekDayID();
    }

    /**
     * @param weekDayID the weekDayID to set
     */
    public void setWeekDayID(int weekDayID)
    {
        this.dataModel.setWeekDayID(weekDayID);
        super.NotifyObservers();
    }
    
    public void save()
    {
        dataModel.Save();
    }
}
