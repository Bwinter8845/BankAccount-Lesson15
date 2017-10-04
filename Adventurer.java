
/**
 * Write a description of class Adventurer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Adventurer
{
    // instance variables
    private int health;
    private int stamina;
    private String name;
    private boolean isMale;
    private int strength;
    private int intelligence;
    
    /**
     * Constructor for objects of class Adventurer
     */
    public Adventurer(String name, boolean isMale, int strength, int intelligence, int health, int stamina )
    {
        // initialise instance variables
        this.name = name;
        this.isMale = isMale;
        this.strength = strength;
        this.intelligence = intelligence;
        this.health = health;
        this.stamina = stamina;
    }
    
    /** 
     * @ returns int value for total weight 
     */
    public int carryWeight()
    {
        return this.strength * 10;
    }
    
    public int getHealth()
    {
        return this.health;
    }
    
    public int getStamina()
    {
        return this.stamina;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String getGender()
    {
        if( isMale )
            return "male";
        else
            return "female";
    }
    
    public int getStrength()
    {
        return this.strength;
    }
    
    public int getIntelligence()
    {
        return this.intelligence;
    }
    

}
