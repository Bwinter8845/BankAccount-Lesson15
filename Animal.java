
/**
 * Write a description of class Animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animal
{
    // instance variables - replace the example below with your own
    boolean eatsMeat;
    boolean isMale;
    int age;
    double weight;
    String name;
    
    
    /**
     * Constructor for objects of class Animal
     */
    // overload
    public Animal(boolean eat, boolean male, int a, double w, String n ) // the order of our variables MATTERS!
    {
        eatsMeat = eat;
        isMale = male;
        age = a;
        weight = w;
        name = n;
    }
    // overload of constructor method
    public Animal()  // initialize default values of our instance variables
    {
        eatsMeat = false;
        isMale = false;
        age = 0;
        weight = 0;
        name = "Animal";
    }
    
    public String getGender()
    {
        if( isMale )
            return "male";
        else
            return "female";
    }
    
    public String getFoodType()
    {
        if( eatsMeat )
        {
            return "meat";
        }
        else
        {
            return "fruits and vegetables";
        }
    }
    
    public String toString()
    {
        return "Animal Name: " + name + ", Eats: " + getFoodType() + ", Gender: " + getGender() 
                + ", Age: " + age + ", Weight: " + weight + ".";
    }

}
