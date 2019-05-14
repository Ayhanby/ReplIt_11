package OOP;

class Atts {
	  
	   String color, name;
	  int amount;
	  
	  String asString(){
	      return "name: "+name+" color: "+color+" amount: "+amount;
	    }
}

public class Q191 {
	 public static void main(String[] args) {
		   
		   Atts a = new Atts();
		   a.name = "ball";
		   a.color = "red";
		   a.amount = 1;
		   
		   
		    System.out.println(a.asString());
		  }

}
