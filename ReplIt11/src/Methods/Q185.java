package Methods;

public class Q185 {
	
	public static String extractNum(String s) {
	     String result="";
				    for(int i=0; i<s.length();i++)
				      if( Character.isDigit(s.charAt(i)))
				        result += s.charAt(i);
				    
				   return result;
	    
	   
	  }

}
