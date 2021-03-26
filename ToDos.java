import java.util.ArrayList;

class ToDos {
  
  public static void main(String[] args) {
    //declare and initializing 
        ArrayList<String> toDoList = new ArrayList<String>();
    String toDo1 = "Water plants";
    String toDo2 = "eat";
    String toDo3 = "sleep";
	String toDo4 = "WASH";
    toDoList.add(toDo1);
    toDoList.add(toDo2);
    toDoList.add(toDo3);
    
    System.out.println(toDoList);
    System.out.println(toDoList.size()); 
	toDoList.set(2,"brunch");
    toDoList.remove(toDo1);
	
	int index = toDoList.indexOf("sleep");
	System.out.println(index); 
	
	System.out.println(toDo2.length());
	System.out.println(toDo1.substring(3));
	System.out.println(toDo3.toUpperCase());
	System.out.println(toDo4.toLowerCase());
	System.out.println(toDo2.concat(toDo3)); 
	
	System.out.println(toDo1.equals("true"));
	System.out.println(toDo1.equals("Water plants"));
	// to know the index of the first occurence of a character in a string
	System.out.println(toDo3.indexOf("e"));
	// returns the character located at a String‘s specified index
	String firstName = "dom";  
    String lastName = "bbbb";
	System.out.println(firstName.charAt(0) + lastName.charAt(0));
	
	String line = "The Heav'ns and all the Constellations rung";    
    System.out.println(line.substring(23));
    System.out.println(line.substring(23, 38));
    System.out.println(line.substring(4, 11));  
  }
  
}