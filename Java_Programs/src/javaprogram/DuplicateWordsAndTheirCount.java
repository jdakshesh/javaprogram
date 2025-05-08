package javaprogram;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWordsAndTheirCount {

	public static void main(String[] args) {
		String str = "This is a test of duplicate string, let us us us check it. Go ahead check this string for duplicate srting and count.";
		str = str.replaceAll("[^a-z A-Z 0-9]", "");
		String words[]= str.toLowerCase().trim().split(" ");
		Map<String,Integer> map = new HashMap<String,Integer>();
		for(String word: words)
		{
			if(map.containsKey(word))
			{
				map.put(word, map.get(word)+1);
			}
			else
			{
				map.put(word, 1);
			}
		}
		for(String wr: map.keySet())
		{
			if(map.get(wr)>1)
			{
				System.out.println("The duplicate word is "+ wr+" and the count is: "+ map.get(wr));
			}
		}
	}

}
