package NewPackage;
import java.util.ArrayList;

/*
This problem was asked by Twitter.
Implement an autocomplete system. That is, given a query string s and a set of all possible query strings, return all strings in the set that have s as a prefix.
For example, given the query string de and the set of strings [dog, deer, deal], return [deer, deal].
Hint: Try preprocessing the dictionary into a more efficient data structure to speed up queries.

Note to self: Preprocess this into a tree structure or trie where each node/leaf is represented by a letter of a word

Author: Conor Evans
 */
public class Main {
	
	public static void main(String[] args)
	{
		String[] dictionary = {"dog", "deer", "deal", "cat", "mood", "delete", "doubt", "deter"};
		
		String searchQuery = "de";
		
		System.out.println(autocomplete(dictionary, searchQuery).toString());
	}

	private static ArrayList<String> autocomplete(String[] dictionary, String searchQuery) {
		ArrayList<String> matches = new ArrayList<String>();
		for(String word : dictionary) {
			if(word.startsWith(searchQuery)) {
				matches.add(word);
			}
		}
		
		return matches;
	}
}
