package arrays;

import java.util.Arrays;

public class Checkpair {
	
	public void checkPairs(int[] arr, int sum)
	{
		for(int i = 0; i < arr.length-1; i++)
		{
			for(int j = i+ 1; j < arr.length; j++)
			{
		
				if(arr[i] + arr[j] == sum)
				{
					System.out.println("the pairs are: "+ arr[i]+ " and "+ arr[j]);
				}
		
			}
		}
	
	}
	
	public void optimizedCheckpair(int arr[], int sum)
	{
		Arrays.sort(arr);
		int low = 0;
		int high = arr.length -1;
		while(low<high)
		{
			if(arr[low]+ arr[high] == sum)
			{System.out.println("pairs are: "+ arr[low] + " and "+ arr[high]);
			break;}
			else if(arr[low]+ arr[high] > sum)
			{
				high--;
			}
			else if(arr[low]+ arr[high] < sum)
			{
				low++;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,-1, 3, 6, -11, -5, 2, 7};
		int sum = 5;
		
		
		Checkpair ck = new Checkpair();
		//ck.checkPairs(arr, sum);
		
		ck.optimizedCheckpair(arr, sum);
		

	}

}
