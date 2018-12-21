package arrays;


//find the number occurring odd number of times
public class OddTimes {
	public void getOccurance(int arr[])
	{
		int result = 0;
		for(int i = 0; i< arr.length; i++)
		{
			result = result ^ arr[i];
		}
		System.out.println("the odd one is: "+ result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2, 5};
		OddTimes o = new OddTimes();
		o.getOccurance(arr);
		

	}

}
