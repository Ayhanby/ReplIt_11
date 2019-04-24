package Q94_Q108;

import java.util.Scanner;

public class Q98 {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String sentence = scan.nextLine();
	    int Jnum=0, Pnum=0;
	    while(sentence.contains("java") || sentence.contains("python")){
	    	
	      if(sentence.contains("python")){
	      sentence=sentence.replaceFirst("python","");
	       Pnum++;
	      }
	      
	      if (sentence.contains("java")){
	         sentence=sentence.replaceFirst("java","");
	          Jnum++;
	      }
	      
	    }
	    
	    boolean AA=false;
	    if(Jnum==Pnum) AA=true;
	      System.out.println(AA);
	    
	  }

}
