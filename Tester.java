
/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(String[] args)
    {
        Animal bear = new Animal(true, false, 3, 400.25, "bear");
        Animal hummingbird = new Animal(false, true, 1, 0.85, "hummingbird");
        
        Animal sasquatch = new Animal();
        
        //System.out.println("The bear's weight is " + bear.weight + " pounds.");
        
        //System.out.println("The hummingbird's gender is " + hummingbird.getGender() + ".");
        
        //System.out.println("The bear eats " + bear.getFoodType() + ".");
        //System.out.println("The hummingbird eats " + hummingbird.getFoodType() + ".");
        //System.out.println("The sasquatch eats " + sasquatch.getFoodType() + ".");
        
        System.out.println( bear );
        
        System.out.println( hummingbird );
        
        System.out.println( sasquatch );
        
        
    }
}
