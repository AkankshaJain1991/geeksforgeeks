package arrays;

public class SortedRotatedArray {
	
	public int search(int arr[], int l, int h, int key)
	{
		int mid = (l+h)/2;
		if(arr[mid]==key)
		
		return mid;
		
		
		//if first till mid is sorted
		if(arr[l]<=arr[mid])
		{
			if(key>=arr[l] && arr[mid]>=key)
			
				return search(arr, l, mid-1, key);
			
			return search(arr,mid+1, h, key);
		}
		
		
		else if(key>=arr[mid] && arr[h]>=key)
			return search(arr, mid+1, h,key);
			
				return search(arr,l, mid-1, key);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4, 5, 6, 7, 8, 9, 1, 2, 3};
		int key = 1;
		
		SortedRotatedArray s = new SortedRotatedArray();
		System.out.println(s.search(arr, 0, arr.length, key));
		

	}

}
