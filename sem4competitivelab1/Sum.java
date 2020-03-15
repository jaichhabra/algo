import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
class Sum{
     public static int getMin(int[] array){ 
    int minValue = array[0]; 
    for(int i=1;i<array.length;i++){ 
      if(array[i] < minValue){ 
        minValue = array[i]; 
      } 
    } 
    return minValue; 
  } 
   public static void main(String args[]){
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt(); 
      int[] array = new int[n];
      int sum = 0;
      for (int i=0; i<n; i++)
      {
    	  array[i] = scanner.nextInt();
      }
      for( int num : array) {
          sum = sum+num;
      }
    
      if(sum%2==0)
      {
          System.out.print(sum-getMin(array)+"");
          System.out.print(sum+"");
        }
      else
      { 
          System.out.print(sum+"");
          System.out.print(sum-getMin(array)+"");
        }
      
   }
}
