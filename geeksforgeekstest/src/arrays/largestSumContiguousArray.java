package arrays;

public class largestSumContiguousArray {
	
	public void maxSubArray(int arr[])
	{
		int max_so_far = 0;
		int max_ending_here = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			max_ending_here = max_ending_here + arr[i];
			if(max_ending_here<0)
			{
				max_ending_here = 0;
			}
			else if(max_so_far<max_ending_here)
			{
				max_so_far = max_ending_here;
			}
		}
		System.out.println("the max sum is: "+ max_so_far);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		largestSumContiguousArray l = new largestSumContiguousArray();
		l.maxSubArray(arr);

	}

}
