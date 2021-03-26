public class SavingsAccount {
  
  int balance; 
  
  // constructor 
  public SavingsAccount(int initialBalance ){
    balance = initialBalance; 
  }
  
  /**
   *  public means that other classes can access this method.
   *  The void keyword means that there is no specific output from the method. 
   *  Method Signature is the methods name and its parameter type. 
   */ 
  
  public void checkBalance(){
  System.out.println("Hello!");
  System.out.println("Your balance is " + balance);
} 

  public void deposit(int amountToDeposit){
    balance = balance + amountToDeposit;
    System.out.println("You just deposited " + amountToDeposit);
  }
  
    public int withdraw(int amountToWithdraw){
    balance = balance - amountToWithdraw; 
    System.out.println("You just withdrew " + amountToWithdraw);
    return amountToWithdraw;
  }
  
  public static void main(String[] args){
    SavingsAccount savings = new SavingsAccount(2000);
    savings.withdraw(300);
    savings.checkBalance();
    savings.deposit(600);   
    savings.checkBalance();
    savings.deposit(600);    
    savings.checkBalance();
	//check.balance(); //wont work as error with static declaration 
    
  }       
}
