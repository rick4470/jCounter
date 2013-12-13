/**
 * @author Rick
 * Helper class that stores all of the data for 
 * the fields in the new users view.  to be used in the controller
 * to proccess the data.
 */
package library;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NewUserData
{
    private ArrayList<String> usersData;
    private String firstName = null;
    private String lastName = null;
    private String gender = null;
    private String month = null;
    private String day = null;
    private String year = null;
    private int weight = 0;
    private int height = 0;
    private String activityLevel = null;
    private int targetWeight = 0;
    private boolean isMyDataValid = false;
    
    
    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String text)
    {
        firstName = text;
    }

    public void setLastName(String text)
    {
        lastName = text;
    }
    
    public String getLastName()
    {
        return lastName;
    }

    public void setGender(String text)
    {
        gender = text;
    }
    
    public String getGender()
    {
        return gender;
    }
    
    public void setDOB(String m, String d, String y)
    {
        month = m;
        day = d;
        year = y;
    }
    
    public Date getDOB()
    {
        java.sql.Date tempDate = null;
        try {
            String date = year+"/"+month+"/"+day;
            SimpleDateFormat javaDate = new SimpleDateFormat("yyyy/MM/dd");
            java.util.Date javaD = javaDate.parse(date);
            tempDate = new Date(javaD.getTime());
        } catch (ParseException ex) {
            Logger.getLogger(NewUserData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tempDate;
    }

    public void setWeight(String w)
    {
        if(!w.isEmpty())
        {
            weight = Integer.parseInt(w);
        }
    }
    
    public int getWeight()
    {
        return weight;
    }

    public void setHeight(String f, String i)
    {
        if(!f.isEmpty() && !i.isEmpty())
        {
            int feet = Integer.parseInt(f);
            int inches = Integer.parseInt(i);
            height = 12 * feet + inches;
        }

    }
    
    public int getHeight()
    {
        return height;
    }


    public void setActivityLevel(String aL)
    {
        activityLevel = aL;
    }
    
    public int getActivityLevel()
    {
        int level = 0;
        if(activityLevel.contains("Low"))
        {
            level = 1;
        }else if(activityLevel.contains("Moderate"))
        {
            level = 2;
        }else{
            level = 3;
        }
        
        return level;
    }

    public void setTargeWeight(String tW)
    {
        if(!tW.isEmpty())
        {
            targetWeight = Integer.parseInt(tW);
        }
    }
    
    public int getTargeWeight()
    {
        return targetWeight;
    }
    
    private ArrayList<String> getList()
    {
        usersData = new ArrayList<>();
        usersData.add(firstName);
        usersData.add(lastName);
        usersData.add(gender);
        usersData.add(month);
        usersData.add(day);
        usersData.add(year);
        usersData.add(Integer.toString(weight));
        usersData.add(Integer.toString(height));
        usersData.add(activityLevel);
        usersData.add(Integer.toString(targetWeight));
        
        return usersData;
    }

    /**
     * Check the data for a new user, by removing spaces and
     * check for empty values,if it is valid then return true,
     * if it's not valid return back false to class boolean.
     */
    public void checkIfValid()
    {
        ArrayList<String> userData = getList();
        
        for (String info : userData) 
        {
            String noSpaces = info.replaceAll("\\s+","");
            if(noSpaces != null && !noSpaces.isEmpty())
            {
                isMyDataValid = true;
            }else{
                isMyDataValid = false;
                break;
            }
        }
    }
    
    public boolean isTheDataValid()
    {
        return isMyDataValid;
    }

}
