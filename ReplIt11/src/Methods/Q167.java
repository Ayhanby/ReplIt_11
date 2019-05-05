package Methods;

public class Q167 {
	public static void main(String[] args) {
	    System.out.println(coverString("java methods", "me") ) ; //java [me]thods
	  }
	  
	  public static String coverString(String main, String coverME) {
	    String newstr="["+coverME+"]";
					 
		if(main.contains(coverME)) 
			main=main.replaceAll(coverME,newstr);
		else 
			main="["+main+"]";

					    return main;
	    
	  }
}
