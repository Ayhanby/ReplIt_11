package Methods;

public class Q158 {

	public String c_profits (int buyPrice,int sellPrice)
	  {
	    //your code here
	    String A="no loss";
	   if(sellPrice > buyPrice)
	        A="profit";
	    else if(sellPrice < buyPrice)
	        A="loss";
	        
	        return A;
	   
	  }
}
