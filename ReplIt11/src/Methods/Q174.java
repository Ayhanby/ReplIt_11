package Methods;

import java.util.*;

public class Q174 {
	public static String lameDb(String db, String op,String id,String data)
	  {
	     data=id+data;
			    String[] myarrays=db.split("#");
			    ArrayList<String> mylist=new ArrayList<>();
			    mylist.addAll(Arrays.asList(myarrays));
			    int number=Integer.parseInt(id);
			    if(op.equals("add")||op.equals("delete")||op.equals("edit")) {
			    	if(op.equals("add")) mylist.add(number-1, data);
			    	else if (op.equals("delete")) mylist.remove(number-1);
			    	else {
			    		mylist.add(number-1, data);
			    		mylist.remove(number);
			    	}
			    }
			    myarrays=mylist.toArray(new String[mylist.size()]);
			    String AA="";
			    for(String each:myarrays) {
			    	AA+=("#"+each);
			   } 
			    return AA.replaceFirst("#", "");
	    
	  }//end lameDb
	  
	  
	   public static void main(String[] args) 
	   {
	    
	     
	     System.out.print(
	       lameDb("1etsy#2wooden#3spoon","add","4","aaa")+"\n"
	       );
	       
	      System.out.print(
	       lameDb("1tst#2bla#3foo","edit","2","bbb")+"\n"
	       );
	       
	      System.out.print(
	       lameDb("1tst#2bla#3foo","delete","1","")+"\n"
	       );
	       
	        System.out.print(
	       lameDb("1tst#2bla#3foo","none","1","")+"\n"
	       );
	     
	   }

}
