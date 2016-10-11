package com.ashish.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		Map <String, String> nameMap = new HashMap<String, String>();
		
		for (int i=1; i<5; i++){
			nameMap.put("key"+i, "value"+i);
		}
		
		System.out.println("Map Keys ::: ");
		Set<String> mapKey = nameMap.keySet();
		for (String key : mapKey){
			System.out.println(key);
		}
		
		System.out.println("Map values ::: ");
		for (int i=1; i<5; i++){
			System.out.println(nameMap.get("key"+i));
		}
		
		// Keys and Values together...
		Set<Entry<String, String>> setMap = nameMap.entrySet();
		Iterator<Entry<String, String>> iterator = setMap.iterator();
		while(iterator.hasNext()){
			Entry<String, String> map = iterator.next();
			System.out.println(map.getKey() + ", " + map.getValue());
		}
		
	}

}
