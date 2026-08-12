package javabuoi4;
public class Account{
    String  owner;
    double balance;
    public void deposit(double money){
        balance = balance + money; 
    }
    public void withdraw(double money)
    {
        balance = balance - money;
    }
}