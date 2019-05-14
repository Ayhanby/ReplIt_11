package Methods;

public class Q188 {
	
	 public static boolean isError(String line) {
		   return ( line.substring(0, line.indexOf(" ")).equals("error") ) ? true : false;
	  }

}
