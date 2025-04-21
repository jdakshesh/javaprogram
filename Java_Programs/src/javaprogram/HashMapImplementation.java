//Hasmap is not sorted
package javaprogram;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapImplementation {

	public static void main(String[] args) {
		// creating object of Hashmap data structure and define key-value pair data type
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		// use 'put' method to insert key value pair into hashmap
		map.put(1, "supriyo");
		map.put(2, "dakshesh");

		// use 'get' method to retireve data/value, hashmap retireve data using key
		System.out.println(map.get(1));

		// use entrySet method to retireve all the values of hashmap
		// store the entrySet into a variable(variable type will be Set casted as Entry<key,value>
		Set<Entry<Integer, String>>entrySet = map.entrySet();
		
		//now iterate through variable entrySet using advance for loop using Entry as data type
		for(Entry<Integer, String> entry:entrySet)
		{
			System.out.println("They key value pair is "+entry.getKey()+ " "+entry.getValue() );
		}
        
	}

}
