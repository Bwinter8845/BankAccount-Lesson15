
/**
 * Write a description of class BankAccount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BankAccount
{
    // instance variables - replace the example below with your own
    private double balance;
    private String accountHolder;

    /**
     * Constructor for objects of class BankAccount
     */
    public BankAccount()
    {
        // initialise instance variables
        balance = 0;
        accountHolder = "Null";
    }
    
    public BankAccount( double amount, String name )
    {
        this.balance = amount;
        this.accountHolder = name;
    }
    
    public void deposit( double amount )
    {
        balance += amount; // balance = balance + amount
    }
    
    public void withdraw( double amount )
    {
        if(balance >= amount)
            balance -= amount;
        else
            balance = 0;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    public String getAccountHolder()
    {
        return accountHolder;
    }
    
    public String toString()
    {
        return "Account Holder: " + accountHolder + ", current balance: $" + balance;
    }
}
