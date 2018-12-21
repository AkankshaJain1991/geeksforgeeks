package arrays;

import java.util.HashMap;
import java.util.HashSet;

import javax.activation.MailcapCommandMap;

public class MaxElement {
	
	public void usingMap(int arr[])
	{
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		for(int i: arr)
		{
			if(hmap.containsKey(i))
			{
				hmap.put(i, hmap.get(i)+1);
			}
			else
				hmap.put(i, 1);
		}
		HashSet<Integer> hset = new HashSet<Integer>(hmap.keySet());
		int maxCount = 0;
		int maxElement = 0;
		
		for(Integer i : hset)
		{
			if(hmap.get(i)>maxCount)
			{
				maxCount = hmap.get(i);
				maxElement = i;
			}
		}
		System.out.println("majority Element: "+ maxElement);
		System.out.println("count: "+ maxCount);
		System.out.println(arr.length);
		
		if(maxCount>=(arr.length/2))
		{System.out.println(maxElement + " is the majority element");}
		else
			System.out.println(maxElement + " is not the majority element");		
	}
	
	public void MooresVoting(int arr[])
	{
		int candidate = findCandidate(arr);
		
		int MajorityCount =  MajorityCount(arr, candidate);
		
		if(MajorityCount >= arr.length/2)
		{
			System.out.println("Element "+ candidate + " is a majority element.");
		}
		else
			System.out.println("Element "+ candidate + " is not a majority element.");
	}
	
	public int findCandidate(int arr[])
	{
		int maxIndex = 0;
		int count = 1;
		
		for(int i = 1; i<arr.length;i++)
		{
			if(arr[maxIndex] == arr[i])
			{
				count++;
			}
			else count--;
			if(count == 0)
			{
				maxIndex = i;
				count = 1;
			}
		}
		return arr[maxIndex];
	}
	
	public int MajorityCount(int arr[], int cand)
	{
		int count = 0;
		for(int i = 0; i< arr.length; i++)
		{
			if(arr[i] == cand)
				count++;
		}
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = { 3, 3, 4, 2, 4, 4, 2, 4, 4};
		MaxElement e = new MaxElement();
		//e.usingMap(arr);
		
		e.MooresVoting(arr);

	}

}
