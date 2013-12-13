package library;

import model.MealItemModel;

public class NutrientHelper extends Subject
{

    private MealItemModel mealItemDataProvider;
//    private FatHelper fat;
//    private CarbohydrateHelper carb;
//    private ProteinHelper protein;

    public NutrientHelper()
    {
//        fat = new FatHelper();
//        carb = new CarbohydrateHelper();
//        protein = new ProteinHelper();
    }

    public NutrientHelper(MealItemModel dataSource)
    {
        mealItemDataProvider = dataSource;
    }

    public void CloneAsNew()
    {
        mealItemDataProvider.IsLoaded = false;
    }

    /**
     * @return the weight
     */
    public double getWeight()
    {
        return mealItemDataProvider.getTotalWeight();
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(double weight)
    {
        this.mealItemDataProvider.setTotalWeight(weight);
        super.NotifyObservers();
    }

    /**
     * @return the fat
     */
//    public FatHelper getFat()
//    {
//        return fat;
//    }

    /**
     * @param fat the fat to set
     */
    public void setFat(double fat)
    {
        //this.fat = fat;
        mealItemDataProvider.setFatWeight(fat); //fat.getWeight());
        super.NotifyObservers();
    }

    /**
     * @return the carb
     */
//    public CarbohydrateHelper getCarb()
//    {
//        return carb;
//    }

    /**
     * @param carb the carb to set
     */
    public void setCarb(double carb)
    {
        //this.carb = carb;
        mealItemDataProvider.setCarbWeight(carb); // carb.getWeight());
        super.NotifyObservers();
    }

    /**
     * @return the protein
     */
//    public ProteinHelper getProtein()
//    {
//        return protein;
//    }

    /**
     * @param protein the protein to set
     */
    public void setProtein(double protein)
    {
        //this.protein = protein;
        mealItemDataProvider.setProteinWeight(protein); // protein.getWeight());
        super.NotifyObservers();
    }

    /**
     * @return the sodium
     */
    public double getSodium()
    {
        return mealItemDataProvider.getSodium();
    }

    /**
     * @param sodium the sodium to set
     */
    public void setSodium(double sodium)
    {
        mealItemDataProvider.setSodium(sodium);
        super.NotifyObservers();
    }
    
    public void setName(String name)
    {
        mealItemDataProvider.setMealItemName(name);
    }
    
    public String getName()
    {
        return mealItemDataProvider.getMealItemName();
    }
    
    public double getCarb()
    {
        return mealItemDataProvider.getCarbWeight();
    }
    
    public double getFat()
    {
        return mealItemDataProvider.getFatWeight();
    }
    
    public double getProtein()
    {
        return mealItemDataProvider.getProteinWeight();
    }
    
    public int getMealId()
    {
        return mealItemDataProvider.getMealID();
    }
    
    public void setMealId(int mealID)
    {
        mealItemDataProvider.setMealID(mealID);
    }
    
    public double getTotalCalories()
    {
        return mealItemDataProvider.getTotalCalories();
    }

    public void setTotalCalories(double totalCalories)
    {
        this.mealItemDataProvider.setTotalCalories(totalCalories);
    }
    
    public void Save()
    {
        mealItemDataProvider.Save();
    }
}
