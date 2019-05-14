package Methods;

public class Q193 {
	public static boolean isPalindrome(String check) {
		   
	    StringBuilder mybuilder=new StringBuilder(check);
	    check=check.replace(" ","");
	    String str=mybuilder.reverse().toString().replace(" ","");
	    if(str.equalsIgnoreCase(check)) return true;
	   
	    return false;

}

}
