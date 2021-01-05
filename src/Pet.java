/**
 * @author Marissa Gonçalves
 * Date: March 2, 2018
 * Purpose: To run variables and methods that the other subclasses possess.
 */

public abstract class Pet extends Object
{
    
    /**
     * Initializes the name from the called method, sets the age to 1 and allows the gender to be random.
     * @param name The called name of the pet from the driver class.
     */
    public Pet (String name)
    {
        this.name = name;
        this.age = 1;
        String genders = "MmFf";
        this.gender = genders.charAt(rand.nextInt(genders.length()));
    }
    
     /**
     * Returns the name of the pet, whether it is a dog, cat or duck.
     * @return The name of the pet.
     */
    @Override
    public String getName()
    {
       return super.getName();  
    }
    
    /**
     * Returns the age of the pet, whether it is a dog, cat or duck.
     * @return The age of the pet.
     */
    @Override
    public int getAge()
    {
        return super.getAge();
    }
    
    /**
     * Returns the gender of the pet, whether it is a dog, cat or duck.
     * @return The gender of the pet.
     */
    @Override
    public char getGender()
    {
        return super.getGender();
    }
    
    /**
     * Increments the age by 1.
     */
    @Override
    public void growUp()
    {
        super.growUp();
    }
    
    /**
     * Prints out the repeated statements from the other subclasses.
     * @return The statement to state the information about the pet.
     */
    @Override
    public String toString()
    { 
        return super.toString();
    }
    
    /**
     * Returns true if the variables name, age and gender are all equal to the other variables.
     * @param other The other Pet object.
     * @return True, if all the instance variables in this super is class are equal to the other variables.
     */
    @Override
    public boolean equals(Object other)
    {
        return super.equals(other);
    }
    
    /**
     * Prints the repeated statement, to determine which pet is about to talk.
     */
    public void talk()
    {
        System.out.print("Hi there, this is " + getName() + " talking: ");
    }
    
    /**
     * Allows the Pet class, not being able to speak, implement the representation in the other subclasses.
     * @return An empty String method, since it is already abstract.
     */
    public abstract String speak();

   
}
