package arrays;

public class ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3, 4, 5, 6, 7};
		int n = arr.length;
		int d = 2;
		rotateArray(arr,n,d);

	}
	public static void rotateArray(int arr[], int size, int key)
	{
		int temp[] = new int [key];
		int result[] = new int[size];
		int i;
		
		for(i=0;i<key;i++)
		{
			temp[i] = arr[i];
		}
		System.out.println("ith index: "+ i);
		int j;
		for(j=0;j<size-key;j++)
		{
			result[j]=arr[i++];
			
		}
		int k = 0;
		while(j<size)
		{
			result[j++] = temp[k++];
		}
		
		for(int m =0; m<result.length; m++) System.out.print(result[m]+ " ");
		
	}

}
