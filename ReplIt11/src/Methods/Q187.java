package Methods;

import java.util.*;

public class Q187 {
	
	static void removeAll(ArrayList<String> wordList, String targetWord){
		  System.out.println(wordList.removeAll(new ArrayList<>(Arrays.asList(targetWord))));
		}

}
