

// problemlb2 
import java.util.*; 

class GFG { 

	static int maxCrossingSum(int arr[], int l, 
				int m, int h) 
	{ 
		 
		int sum = 0; 
		int left_sum = Integer.MIN_VALUE; 
		for (int i = m; i >= l; i--) 
		{ 
			sum = sum + arr[i]; 
			if (sum > left_sum) 
			left_sum = sum; 
		} 

		
		sum = 0; 
		int right_sum = Integer.MIN_VALUE; 
		for (int i = m + 1; i <= h; i++) 
		{ 
			sum = sum + arr[i]; 
			if (sum > right_sum) 
			right_sum = sum; 
		} 

		
		 
		return left_sum + right_sum; 
	} 

	
	
	static int maxSubArraySum(int arr[], int l, 
									int h) 
	{ 
	//eleone 
	if (l == h) 
		return arr[l]; 

	//midele
	int m = (l + h)/2; 

	return Math.max(Math.max(maxSubArraySum(arr, l, m), 
					maxSubArraySum(arr, m+1, h)), 
					maxCrossingSum(arr, l, m, h)); 
	} 

	
	public static void main(String[] args) 
	{ 
	int arr[] ={20,10,-20,-25,5,5,15,-10,-10,30,-20,-15,-5,-5,-5};
	int n = arr.length; 
	int max_sum = maxSubArraySum(arr, 0, n-1); 
	
	System.out.println("Maximum contiguous sum is "+max_sum); 
	} 
} 

