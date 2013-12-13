/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package library;

import java.util.ArrayList;

/**
 *
 * @author Eatough
 */
public class NewFoodData 
{
    private ArrayList<String> foodData;
    private String foodName;
    private double calories;
    private double fat;
    private double carbs;
    private double sodium;
    private double protien;
    private int servings;
    private boolean isValid = false;
    
    public String getFoodName()
    {
        return foodName;
    }
    public void setFoodName(String text)
    {
        foodName = text;
    }
    
    public double getFat()
    {
        return fat;
    }
    public void setFat(String text)
    {
        fat = Double.parseDouble(text);
    }

    /**
     * @return the calories
     */
    public double getCalories() 
    {
        return calories;
    }

    
    public void setCalories(String text) 
    {
        calories = Double.parseDouble(text);
    }

    /**
     * @return the sodium
     */
    public double getSodium() 
    {
        return sodium;
    }

   
    public void setSodium(String text) 
    {
        sodium = Double.parseDouble(text);
    }

   
    public double getProtien() 
    {
        return protien;
    }

   
    public void setProtien(String text) 
    {
        protien = Double.parseDouble(text);
    }

   
    public int getServings() 
    {
        return servings;
    }

    public void setServings(String text) 
    {
        servings = Integer.parseInt(text);
    }
    
    public ArrayList<String> getList()
    {
        foodData = new ArrayList<>();
        foodData.add(foodName);
        foodData.add(Double.toString(calories));
        foodData.add(Double.toString(fat));
        foodData.add(Double.toString(sodium));
        foodData.add(Double.toString(protien));
        
        foodData.add(Integer.toString(servings));
        
        
        return foodData;
    }

    /**
     * @return the carbs
     */
    public double getCarbs()
    {
        return carbs;
    }

    /**
     * @param carbs the carbs to set
     */
    public void setCarbs(double carbs)
    {
        this.carbs = carbs;
    }
    
    public void setValid(boolean torf)
    {
        isValid = torf;
    }
    public boolean isValid()
    {
        return isValid;
    }
}
