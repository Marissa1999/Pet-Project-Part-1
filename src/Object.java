import java.util.ArrayList;
import java.util.Random;

/**
 * @author Marissa Gonçalves
 * Date: March 2, 2018
 * Purpose: To run the main methods that the other super and subclasses possess.
 */

public class Object 
{
   
    /**
     * Allows the gender to be selected randomly.
     */
    protected static Random rand = new Random();
    
    /**
     * Allows the name to have type String.
     */
    protected String name;
    
    /**
     * Allows the age to have type integer.
     */
    protected int age;
    
    /**
     * Allows the gender to have type boolean.
     */
    protected char gender;
   
    /**
     * Allows the size to have type String.
     */
    protected String size;
    
    /**
     * Allows the neutered variable to have type boolean.
     */
    protected boolean neutered;
    
    /**
     * Allows the number of eggs to have type integer.
     */
    protected int eggs;
                       
     /**
     * Returns the name of the pet, whether it is a dog, cat or duck.
     * @return The name of the pet.
     */
    public String getName()
    {
       return this.name;  
    }
    
    /**
     * Returns the age of the pet, whether it is a dog, cat or duck.
     * @return The age of the pet.
     */
    public int getAge()
    {
        return this.age;
    }
    
    /**
     * Returns the gender of the pet, whether it is a dog, cat or duck.
     * @return The gender of the pet.
     */
    public char getGender()
    {
        return this.gender;
    }
    
    /**
     * Increments the age by 1.
     */
    public void growUp()
    {
        this.age++;
    }
    
     /**
     * Prints out the repeated statements from the other subclasses.
     * @return The statement to state the information about the pet.
     */
    @Override
    public String toString()
    { 
       
       String result = "";
       
       switch (this.gender)
       {
           case 'M': result += "I'm " + getName() + ", a " + getAge() + "-year old male pet"; break;
           case 'm': result += "I'm " + getName() + ", a " + getAge() + "-year old male pet"; break;
           case 'F': result += "I'm " + getName() + ", a " + getAge() + "-year old female pet"; break;
           case 'f': result += "I'm " + getName() + ", a " + getAge() + "-year old female pet"; break;
       }
       
       return result;   
       
    }
    
    /**
     * Returns true if the variables name, age and gender are all equal to the other variables.
     * @param other The other Pet object.
     * @return True, if all the instance variables in this super is class are equal to the other variables.
     */
    public boolean equals(Object other)
    {
        if (other == null)
        {
            return false;
        }
        
        if(! (other instanceof Pet))
        {
            return false;
        }
        
        return this.name.equals(other.name)
        && this.age == other.age
        && this.gender == other.gender;
    }
    
    
    
}




