package Methods;

import java.util.ArrayList;

public class Q186 {
	
	static ArrayList<String> combineAL(ArrayList<String> wordList1, ArrayList<String> wordList2){
		  ArrayList<String> AB=new ArrayList<>();
		  AB.addAll(wordList1);
		  AB.addAll(wordList2);
		  return AB;
		}

}
