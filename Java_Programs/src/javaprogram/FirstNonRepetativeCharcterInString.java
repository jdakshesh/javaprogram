package javaprogram;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepetativeCharcterInString {

	public static void main(String[] args) {
		String str = "Amazon";
		char[] ch = str.toLowerCase().toCharArray();
		boolean status = false;
		// Use LinkedHashMap to maintain the order of insertion
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (Character ca : ch) {

			if (map.containsKey(ca)) {
				map.put(ca, map.get(ca) + 1);
			} else {
				map.put(ca, 1);
			}
		}

		for (Character c : map.keySet()) {
			{
				if (map.get(c) == 1) {
					System.out.println("The first non repetative character is: " + c);
					status = true;
					break;
				}

			}

		}
		if (!status) {
			System.out.println("There are not unique character in string");
		}
	}
}
