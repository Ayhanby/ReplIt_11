package Methods;

public class Q199 {
	
	public static int[] do_switch(int[] i) 
	 {
	   int j1=i[0],  j2=i[i.length-1];
	   i[0]=j2 ;
	   i[i.length-1] = j1;
	   
	   return i;

		}

}
