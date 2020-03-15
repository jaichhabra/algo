import java.util.Scanner;
class squares1 { 
	 
	static int getMinSquares(int n) 
	{ 
		 
		if (n <= 3) 
			return n; 

		
		int res = n; 

		
		for (int x = 1; x <= n; x++) { 
			int temp = x * x; 
			if (temp > n) 
				break; 
			else
				res = Math.min(res, 1 + getMinSquares(n - temp)); 
		} 
		return res; 
	} 
	public static void main(String args[]) 
	{ Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt(); 
           System.out.println(getMinSquares(n));
	} 
} 

