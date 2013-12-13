/**
 * @author Eatough
 * @author Rick
 * Controller that takes care of the output for
 * the dashbaord tab.
 */
package library;
import java.sql.Date;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Calendar;


public class DashboardData 
{
    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private int weight;
    private int inches;
    private int feet;
    private String activityLevel;
    private int weightDifference;
    private int weightToGo;
    private String BMI;
    private int todaysCalories;
    private int weeksCalories;
    private double BMR;
    private String lastMeal;
    private String differenceText;
    private int calories;
    private String foodName;
    private String lastMealCalories;
    

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
     * @return the age
     */
    public int getAge() 
    {
        return age;
    }

    /**
     * @param dob
     */
    public void setAge(Date dob) 
    {
         java.util.Date date = Calendar.getInstance().getTime();
        int currentYear = date.getYear() + 1900;
        int currentMonth = date.getMonth() + 1;
        int currentDay = date.getDate();
        int birthYear = dob.getYear() + 1900;
        int birthMonth = dob.getMonth() + 1;
        int birthDay = dob.getDate();
        int years = currentYear - birthYear - 1;
        if (currentMonth > birthMonth
                || currentMonth == birthMonth && currentDay >= birthDay) 
        {
            years++;
        }
        age = years;
    }

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
    public void setWeight(double weight) 
    {
        this.weight = (int)weight;
    }

    /**
     * @return the activityLevel
     */
    public String getActivityLevel() 
    {
        return activityLevel;
    }

    /**
     * @param activity
     */
    public void setActivityLevel(int activity) 
    {
        if(activity == 1)
        {
            activityLevel = "Low (less than 30 min/day)";
        }
        else if(activity ==2)
        {
            activityLevel = "Moderate (about 30 min/day)";
        }
        else
        {
            activityLevel = "High (2 or more hrs/day)";
        }
    }

    /**
     * @return the weightDifference
     */
    public int getWeightDifference() 
    {
        return weightDifference;
    }

    /**
     * @param current
     * @param start
     */
    public void setWeightDifference(double current, double start) 
    {
        if(current > start)
        {
            weightDifference = (int)current - (int)start;
            differenceText = "You have gained";
        }
        else
        {
            weightDifference = (int)start - (int)current;
            differenceText = "You have lost";
        }
    }

    /**
     * @return the weightToGo
     */
    public int getWeightToGo() 
    {
        return weightToGo;
    }

    /**
     * @return 
     */
    
    public String getDifferenceText()
    {
        return differenceText;
    }
    
    public void setWeightToGo(double current, double target) 
    {
        if(current <= target)
        {
            weightToGo = (int)target - (int)current;
        }
        else
        {
            weightToGo = (int)current - (int)target;
        }
    }

    /**
     * @return the BMI
     */
    public String getBMI() 
    {
        return BMI;
    }

    /**
     * @param height
     * @param weight
     */
    public void setBMI(double height, double weight) 
    {
        double bodyMassIndex = (weight / (height * height)) * 703;
        NumberFormat formatter = new DecimalFormat("#0.00");
        String bmi = "" + formatter.format(bodyMassIndex);
        BMI = bmi;
    }

    /**
     * @return the todaysCalories
     */
    public int getTodaysCalories() 
    {
        return todaysCalories;
    }

    /**
     * @param todaysCalories the todaysCalories to set
     */
    public void setTodaysCalories(int todaysCalories) 
    {
        this.todaysCalories = todaysCalories;
    }

    /**
     * @return the weeksCalories
     */
    public int getWeeksCalories() 
    {
        return weeksCalories;
    }

    /**
     * @param weeksCalories the weeksCalories to set
     */
    public void setWeeksCalories(int weeksCalories) 
    {
        this.weeksCalories = weeksCalories;
    }

    /**
     * @return the lastMeal
     */
    public String getLastMeal() 
    {
        return lastMeal;
    }

    /**
     * @param lastMeal the lastMeal to set
     */
    public void setLastMeal(String lastMeal) 
    {
        this.lastMeal = lastMeal;
    }

    /**
     * @return the inches
     */
    public int getInches() 
    {
        return inches;
    }

    /**
     * @param inches the inches to set
     */
    public void setInches(double inches) 
    {
        this.inches = (int)inches%12;
    }

    /**
     * @return the feet
     */
    public int getFeet() 
    {
        return feet;
    }

    /**
     * @param inches
     */
    public void setFeet(double inches) 
    {
        feet = (int)inches/12;
    }

    /**
     * @return the BMR
     */
    public double getBMR() 
    {
        return BMR;
    }

    /**
     * @param inches
     * @param weight
     * @param activity
     * @param gender
     * @param years
     */
    public void setBMR(double inches, double weight, int activity, 
                        String gender, int years) 
    {
        double mult;
        if(activity == 1)
        {
            mult = 1.3;
        }
        else if(activity == 2)
        {
            mult = 1.45;
        }
        else
        {
            mult = 1.53;
        }
        double burnRate;
        if("m".equals(gender))
        {
           burnRate = 66+(6.23*weight)+(12.7*inches)-(6.8*(double)years);
        }
        else
        {
           burnRate = 655+(4.35*weight)+(4.7*inches)-(4.7*(double)years);
        }
        
        double bmr = (burnRate*mult)-350;
        
        BMR = bmr;
    }

    /**
     * @return the calories
     */
    public int getCalories() {
        return calories;
    }

    /**
     * @param calories the calories to set
     */
    public void setCalories(int calories) 
    {
        this.calories = calories;
    }

    /**
     * @return the foodName
     */
    public String getFoodName() 
    {
        return foodName;
    }

    /**
     * @param foodName the foodName to set
     */
    public void setFoodName(String foodName) 
    {
        this.foodName = foodName;
    }
    
    public void setLastMealCalories(String number)
    {
        lastMealCalories = number;
    }

    public String getLastMealCalories()
    {
        return lastMealCalories;
    }
    
}


