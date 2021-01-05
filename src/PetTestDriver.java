/**
 * @author Marissa Gonçalves
 * Date: March 2, 2018
 * Purpose: To run and the methods of the main class Pet and the subclasses Dog, Cat and Duck.
 */

public class PetTestDriver 
{
    
    /**
     * To run and test every method in super class Pet and its subclasses, determining an appropriate output.
     * @param args The classic name which a String array is named for a driver program.
     */
    public static void main (String[] args)
   {
       
      Dog fido = new Dog ("Fido", "medium"); //age is 1, gender is random
      System.out.println(fido);
      fido.growUp();
      System.out.println(fido);
      fido.growUp();
      System.out.println(fido);
      fido.growUp();
      System.out.println(fido);
      fido.guardHome();
      fido.pant();
      
      
      
      boolean spayed = true;
      Cat garfield = new Cat("Garfield", spayed); //age is 1, gender is random
      garfield.growUp();
      System.out.println(garfield);
      garfield.catchMice();
      garfield.purr();
      
      
      
      Duck daffy = new Duck("Daffy"); //age is 1, gender is random
      System.out.println(daffy);
      daffy.growUp();
      System.out.println(daffy);
      daffy.growUp();
      System.out.println(daffy);
      daffy.layAnEgg();
      System.out.println(daffy);
      daffy.layAnEgg();
      System.out.println(daffy);
      daffy.swim();
      daffy.fly();
      
      
      //Practice Polymorphism
      Pet p1 = new Dog("Oscar","large");
      p1.talk(); //at run-time, our pet dog Oscar will talk!
      
      p1 = garfield;
      p1.talk(); //at run-time, our pet dog Oscar will talk!
      
      Pet p2 = new Duck("Donald");
      p2.talk(); //at run-time, our pet dog Oscar will talk!
         
       
   }
   
    
}
