package Methods;

import java.util.Arrays;

public class Q175 {
	
	public int findMax(int[] a){
	    Arrays.sort(a);
	    return a[a.length-1];
	  }
	  
	  public double findMax(double[] a){
	      Arrays.sort(a);
	    return a[a.length-1];
	  }

}
