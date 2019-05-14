package Methods;

import java.util.ArrayList;

public class Q190 {
	
	static ArrayList<Integer> appendPosSum(ArrayList<Integer> A){
		  ArrayList<Integer> B=new ArrayList<>();
		  for(int i=0; i< A.size(); i++){
		    if(A.get(i)>0) B.add(A.get(i));
		  }
		  int sum=0;
		  for(int z=0; z<B.size(); z++){
		    sum+=B.get(z);
		  }
		  B.add(sum);
		  return B;
		}

}
