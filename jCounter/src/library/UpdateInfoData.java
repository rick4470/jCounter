/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package library;

/**
 *
 * @author Eatough
 */
public class UpdateInfoData 
{
    private int weight;
    private int height;
    private int activityLevel;

    /**
     * @return the weight
     */
    public int getWeight() 
    {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(String w) 
    {
        weight = Integer.parseInt(w);
    }

    /**
     * @return the height
     */
    public int getHeight() 
    {
        return height;
    }

    /**
     * @param height the height to set
     */
 
    public void setHeight(String f, String i)
    {
        int feet = Integer.parseInt(f);
        int inches = Integer.parseInt(i);
        height = 12 * feet + inches;

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
    public void setActivityLevel(String level) 
    {
        int activityLevel = 0;
        if(level.contains("Low"))
        {
            activityLevel = 1;
        }else if(level.contains("Moderate"))
        {
            activityLevel = 2;
        }else
        {
            activityLevel = 3;
        }
    }
    
    
}
