public class Driver{
  public static void main(String[] args) {
    BankAccount a = new BankAccount(10213,100.0,"123");
    System.out.println("account "+ a.getAccountID() + " has " + "$" + a.getBalance() );
    System.out.println("password is " + a.getPass());
    a.setPassword("abcd");
    System.out.println("password is " + a.getPass());

    if( a.withdraw(1000) ){
      System.out.println("Withdrawal success!");
    }else{
      System.out.println("Withdrawal failure");
    }

    if( a.deposit(1000) ){
      System.out.println("deposit success!");
    }else{
      System.out.println("deposit failure");
    }

    if( a.withdraw(1000) ){
      System.out.println("Withdrawal success!");
    }else{
      System.out.println("Withdrawal failure");
    }
    System.out.println(a);
  }


}
