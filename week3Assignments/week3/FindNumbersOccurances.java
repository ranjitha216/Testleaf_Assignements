package assignments.week3;

import java.util.Map;
import java.util.TreeMap;

public class FindNumbersOccurances {

	public static void main(String[] args) {
		// FindNumberOccurances
		
		int[] input ={2,3,5,6,3,2,1,4,2,1,6,-1};
		
		Map<Integer, Integer> map= new TreeMap<Integer, Integer>();
		
		for (int i : input) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i)+1);
				
			}else {
				map.put(i, 1);
			}
			
		}
		System.out.println(map);

	}

}
