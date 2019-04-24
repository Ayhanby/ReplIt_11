package Methods;

import java.util.Scanner;

public class Q145 {
	 public static void main(String[] args) {
		 
		    Scanner inp = new Scanner(System.in);
		    String s = inp.next();
		    person(s) ;
		    
		  }
		  
		   public static void person(String info) 
			{
			
				//your code here
				String[] arr=info.split(",");
				String name="person name: "+arr[0]+" ";
				String lastname="last name: "+arr[1]+" ";
				String age ="age: "+arr[2];
				System.out.println(name+lastname+age);
			
			}//end person

}
