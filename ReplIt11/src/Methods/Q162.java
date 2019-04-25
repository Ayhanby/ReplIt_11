package Methods;

public class Q162 {

	public boolean validateTask(boolean notEmpty,int taskId,int currentId)
	  {
	   boolean DD=false;
		    if(notEmpty==false) DD=false;
		     else if(taskId==currentId+1) DD=true;
		    
		    return DD; 
	    
	  }
}
