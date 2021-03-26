// A class is the set of instructions that describe 
// how an instance can behave and what information it contains.
public class Store {
  // instance fields
  String productType;
  int inventoryCount;
  double inventoryPrice;
  double price;
  
  // constructor method
  // public is an access level modifier that allows other classes to interact with this class.
  // We create objects (instances of a class) using a constructor method. 
  public Store(String product, int count, double price, double initialPrice) {
    productType = product;
    inventoryCount = count;
    inventoryPrice = price;
	price = initialPrice;
  }
  
    public void advertise() {
		System.out.println("Selling " + productType + "!");
    System.out.println("Come spend some money!");
  }
  
    public void greetCustomer(String customer){
    System.out.println("Welcome to the store, " + customer + "!");
  }
  
   public void increasePrice(double priceToAdd){
    double newPrice = price + priceToAdd;
	price = newPrice;
	System.out.println("the new price is " + newPrice);
  }
  
  public double getPriceWithTax() {
//  double tax = 0.08;
 // double totalPrice = price + (price*tax); 
  double totalPrice = price+price*0.08;
  return totalPrice;
}
  
  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("lemonade", 42, .99,1.5);
    Store cookieShop = new Store("cookies", 12, 3.75,0.1);
    System.out.println(lemonadeStand); 
	System.out.println(lemonadeStand.productType);
    System.out.println("Our first shop sells " + lemonadeStand.productType + " at " + lemonadeStand.inventoryPrice + " per unit.");
    lemonadeStand.advertise();
    System.out.println("Our second shop has " + cookieShop.inventoryCount + " units remaining.");
	lemonadeStand.greetCustomer("yo");
	cookieShop.increasePrice(1.5);
	System.out.println(cookieShop.price);
	double lemonadePrice = lemonadeStand.getPriceWithTax();
  System.out.println(lemonadePrice);
  }
}