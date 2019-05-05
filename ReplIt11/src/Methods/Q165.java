package Methods;

public class Q165 {
	 public static String mergeStrings(String one, String two) {    
		    			String DD="";
					int length=Math.max(one.length(), two.length());
					
				    for(int i=0; i<length; i++){
				    	if (i < one.length()) 
				           DD = DD.concat(""+one.charAt(i));
				        
				        if (i < two.length()) 
				            DD = DD.concat(""+two.charAt(i));
				  }
				    
				    return DD;
		  }

}
