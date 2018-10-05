public class BankAccount{
  private double balance;
  private int accountID;
  private String password;

  public BankAccount( double bal, int accID, String pass){
    balance = bal;
    accountID = accID;
    password = pass;
  }
  public String toString(){
    return accountID + "\t" + balance;
  }
  public double getBalance(){
    return balance;
  }
  public int getAccountID(){
    return accountID;
  }
  public String getPass(){
    return password;
  }
  public void setPassword(String newPass){
    password = newPass;
  }
  public boolean deposit(double amount){
    if(amount < 0){
      return false;
    }
    balance = balance + amount;
    return true;
  }
  public boolean withdraw(double amount){
    if((amount < balance) && (balance > 0 )){
      balance = balance - amount;
      return true;
    }
    return false;
  }
  private boolean authenticate(String passwordd){
    if(this.password.equals(passwordd)){
      return true;
    }
    return false;
  }
  public boolean transferTo(BankAccount other, double amount, String password){
    return ((other.authenticate(password)) && (this.withdraw(amount) && other.deposit(amount)));
    }
  }
