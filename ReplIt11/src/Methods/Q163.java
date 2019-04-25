package Methods;

public class Q163 {
	
	public boolean simpleRoomBook(boolean isAvailable,int month, int day, int year)
	  {
	    
	   boolean EE=false;
	   
		    if(year==2018)
		      if(!(month==7&&(day>=1&&day<=8)))
		        if(isAvailable==true)
		          EE=true;
		    
		    return EE;
	  }

}