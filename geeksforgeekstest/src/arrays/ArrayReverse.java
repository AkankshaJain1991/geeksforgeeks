package arrays;

public class ArrayReverse {
	
	public void arrayrev(int arr[])
	{
		int start = 0;
		int end = arr.length-1;
		for(int i =0; i<arr.length/2; i++)
		{
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] ={-8, -11, 6, 20, 2};
		ArrayReverse ar = new ArrayReverse();
		ar.arrayrev(array);

		for(int i = 0; i<array.length;i++)
		System.out.print(array[i]+" ");
	}

}
