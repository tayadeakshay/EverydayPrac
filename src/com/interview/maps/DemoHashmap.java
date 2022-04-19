package com.interview.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoHashmap {

	public static void main(String[] args) {

		Map<String,Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>
		();
		map.put("AAA", 29);
		map.put("DDD", 27);
		map.put("BBB", 23);
		
		//System.out.println("Before : "+map);
		
		map.replace("AAA", 67);
		map.put("BBB", 68);
		//System.out.println("After  : "+map);
		
		for(Map.Entry x:map.entrySet())
		{
			System.out.println(x.getValue());
			if(x.getKey() == "AAA")
			{
				list.add((Integer) x.getValue());
			}
		}
		System.out.println(list);
		
		
	}

}
