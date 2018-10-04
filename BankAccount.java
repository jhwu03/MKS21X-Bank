public class BankAccount{
  private double balance;
  private int accountID;
  private String password;

  public BankAccount(int accID, double bal, String pass){
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
}
