// Noodle class is our parent class 

class Noodle {
  
  double lengthInCentimeters;
  double widthInCentimeters;
  String shape;
  protected String ingredients;
  String texture = "brittle";
  
  Noodle(double lenInCent, double wthInCent, String shp, String ingr) { 
    this.lengthInCentimeters = lenInCent;
    this.widthInCentimeters = wthInCent;
    this.shape = shp;
    this.ingredients = ingr;
  }
  
  public void cook() { 
    System.out.println("Boiling.");
    this.texture = "cooked"; 
  }
  
  /*final public void review() { 
    this.review = "yummy"; 
  }*/
  
  public boolean isTasty() { 
    return true; 
  }
  
  public String getCookPrep() {
    return "Boil noodle for 7 minutes and add sauce.";
  } 
  
  public static void main(String[] args) {
    // instantiate 
    Spaghetti spaghettiPomodoro = new Spaghetti();
    System.out.println(spaghettiPomodoro.texture);    
	System.out.println(spaghettiPomodoro.shape);
	System.out.println(spaghettiPomodoro.isTasty());
	Pho phoChay = new Pho();
    System.out.println(phoChay.shape);
	Ramen yasaiRamen = new Ramen(); 
    System.out.println(yasaiRamen.isTasty());
	Spaetzle kaesespaetzle = new Spaetzle();
    kaesespaetzle.cook();
	
	// Arrays and ArrayLists 
	Noodle spaghetti, ramen, pho;
    spaghetti = new Spaghetti();
    ramen = new Ramen();
    pho = new Pho();
    Noodle[] allTheNoodles = {spaghetti, ramen,pho};
	for (Noodle noodle : allTheNoodles){
      System.out.println(noodle.getCookPrep());
	} 
  }
}
