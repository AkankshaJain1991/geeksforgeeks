package arrays;

public class MplusNMerge {
	
	public void move(int arr[])
	{
		int i;
		int j = arr.length -1;
		
		for(i = arr.length-1; i>=0; i--)
		{
			if(arr[i] != -1)
			{
				arr[j] = arr[i];
				j--;
			}
		}
	}
	
	public void merge(int arr1[], int arr2[],int array1L, int diff, int arr2L)
	{
		int i = arr2L; //to access non-negative elements of array1
		int j = 0; //to traverse array2
		int k =0; // to iterate over array1
		
		while(k < array1L)
		{
			if((i<array1L && arr1[i]<=arr2[j]) || (j==arr2L))
			{
				arr1[k] = arr1[i];
						k++;
						i++;
			}
			else
			{
				arr1[k] = arr2[j];
				k++;
				j++;
			}
		}
		
		
		
	}
	
	public void printarr(int arr[])
	{
		for(int i = 0; i< arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array1[] = {2, 8, -1, -1, -1, 13, -1, 15, 20};
		int array2[] = {5, 7, 9, 25};
		
		int arr1L = array1.length;
		int arr2L = array2.length;
		int difference = arr1L - arr2L;
		
		System.out.println(arr1L +" " + arr2L + " "+ difference);
		
		MplusNMerge mn = new MplusNMerge();
		mn.move(array1);
		mn.merge(array1, array2, arr1L, difference, arr2L);
		
		mn.printarr(array1);

	}

}
