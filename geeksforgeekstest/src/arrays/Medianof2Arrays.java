package arrays;

public class Medianof2Arrays {
	
	public void median(int arr1[], int arr2[])
	{
		System.out.println("in median");
		int m = arr1.length-1;
		int n = arr2.length-1;
		System.out.println("n is: "+n);
		int count =-1;
		
		int arr3[]= new int[m+n];
		
		int k = 0;
		int i =0, j=0;
		
		while(count<n)
		{
			count++;
			if(arr1[i]<arr2[j])
			{
			 arr3[k] = arr1[i];
			 k++;
			 i++;
			 
			}
			else
			{
				arr3[k] = arr2[j];
				k++;
				j++;
			}
			
		}
		System.out.println("count is: "+ count);
		System.out.println("the median is: "+ arr3[count]);
		System.out.println("array3");
		print(arr3);
		
	}
	
	public int CalcMedian(int ar1[], int ar2[], int size)
	{
		if(size <= 0)
		{
			return -1;
		}
		if(size ==1)
		{
			return (ar1[0]+ar2[0])/2;
		}
		if(size == 2)
		{return (max(ar1[0],ar2[0])+min(ar1[0],ar1[1]));}
		
		int m1 = getMedian(ar1,size);
		int m2 = getMedian(ar2,size);
		
		if(m1==m2)return m1;
		
		if(m1<m2)
		{
				return CalcMedian(ar1, ar2,size-size/2+1);
		}
		else
		{
			return CalcMedian(ar1, ar2, size-size/2);
		}
		
	}
	
	private int getMedian(int[] ar1, int n) {
		if(n%2==0)
		{
		return (ar1[n/2]+ ar1[(n/2)+1])/2;	
		}
		else
			return ar1[n/2];
	}

	private int min(int i, int j) {
		
		if(i<j)
		return i;
		else
			return j;
	}

	private int max(int i, int j) {
		
		if(i>j)
			return i;
			else
			return j;
	}

	public void print(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		System.out.print(arr[i]+ " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] = {-1, 2, 3, 5, 11};
		int arr2[] = {4, 6, 8, 12, 25};
		
		Medianof2Arrays m = new Medianof2Arrays();
		m.median(arr1, arr2);
		int size = arr1.length;
		
	//	m.CalcMedian(arr1, arr2, size);
		
		
		
	}

}
