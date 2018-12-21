package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

public class frequencyOfEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2, 5, 2, 8, 5, 6, 8, 8};
		sortByFreq(arr);

	}

	public static void sortByFreq(int arr[])
	{
		LinkedHashMap<Integer, Integer> hmap = new LinkedHashMap<>();
		for(int i: arr)
		{
			
			if(hmap.containsKey(i))
			{
				hmap.put(i,hmap.get(i)+1);
			}
			else
				hmap.put(i,1);
		}
		
		LinkedHashSet<Integer> hset = new LinkedHashSet<Integer>(hmap.keySet());
		System.out.println("set is: "+ hset);
		
		List<Integer> list = new ArrayList<Integer>(hmap.values());
		
		Collections.sort(list);
		System.out.println("list is: "+ list);
		
		Iterator<Integer> li = list.iterator();
		while(li.hasNext())
		{
			int listItem = li.next();
			for(Integer i: hset)
			{
				if(hmap.get(i)==listItem){
					int temp = (int) i;
					hset.remove(i);
				{
					for(int j =0; j<listItem; j++){
						System.out.print(temp +" ");}
					break;
				}
				}
			}
		}
	}
}
