package BankOperation;
import java.util.*;
public class BankOperation{
    Scanner p=new Scanner(System.in);
    String AccName;
    private int PinNo;
    long AccNo;
    double  Balance;
    BankOperation(String AccName,long AccNo,double Balance,int PinNo)
    {
        this.AccName=AccName;
        this.AccNo=AccNo;
        this.Balance=Balance;
        this.PinNo=PinNo;
    }
    void deposit(double amount)
    {
        if(pinvalidation()){
              this.Balance=Balance+amount;
              System.out.println("Amount SuccessFully Credited");
        }
        else{
            System.out.println("Wrong Pin!!!!!!");
        }
    }
    void withdraw(double amount)
    {
        if(pinvalidation()){
        if(amount > this.Balance)
        {
            System.out.println("Hi "+ this.AccName +" Insufficient Balance!!!!");
        }
        else{
             this.Balance=Balance-amount;
             System.out.println("Amount SuccessFully Debited");
        }
        }
        else{
            System.out.println("Wrong Pin!!!");
        }
    }
    boolean pinvalidation()
    {
        System.out.println("Enter your PinNumber:");
        int PinV=p.nextInt();
        if(PinV==this.PinNo)
        {
            return true;
        }
        else{
            return false;
        }
    }
    double BalanceAmount()
    {
        if(pinvalidation())
        {
          return this.Balance;
        }
        else{
            System.out.println("Wrong Pin!!");
            return 0;
        }
    }
    public static void main(String[] args)
    {
       
        BankOperation A1=new BankOperation("ganesh",1247170000153950L,200,1685);
        A1.deposit(500);
        A1.withdraw(500);
        System.out.println("Hi "+A1.AccName+" Your Current balance:"+A1.BalanceAmount());
        BankOperation A2=new BankOperation("Ruby",124717000153951L,5000,1247);
        A2.deposit(2000);
        A2.withdraw(10000);
        System.out.println("Hi "+A2.AccName+" Your Current balance:"+A2.BalanceAmount());
    }
}
