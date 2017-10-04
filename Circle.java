
/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle
{
    // instance variable
    double radius;
    
    // constructor
    public Circle(double r)
    {
        radius = r;
    }
    
    // Area method
    public double area()
    {
        return Math.PI*radius*radius;
    }
    
    // Circumference method
    public double circumference()
    {
        return 2*Math.PI*radius;
    }
    
    public String toString()
    {
        double d = area();
        d = Math.round(d*100)/100.0;
        
        double c = circumference();
        c = Math.round(c*100)/100.0;
        
        
        return "This circle has " + d + " area and " + c + " circumference.";
    }

    
}
