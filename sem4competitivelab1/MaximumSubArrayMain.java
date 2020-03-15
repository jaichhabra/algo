
public class MaximumSubArrayMain {
 

 public int eleForMaxSubArray(int[] arr) {
  int maxEndHere = 0;
  int maxSoFar = 0;
  for (int i = 0; i < arr.length; i++) {
   maxEndHere += arr[i];
   if (maxEndHere < 0) {
    maxEndHere = 0;
   }
   if (maxSoFar < maxEndHere) {
    maxSoFar = maxEndHere;
   }
  }
  return maxSoFar;
 }
 

 public int eleForMaxSubArrayForNegativ(int[] arr) {
  int maxEndHere = arr[0];
  int maxSoFar = arr[0];
  for(int i=1;i<arr.length;i++){
   maxEndHere = Math.max(arr[i], maxEndHere+arr[i]);
   maxSoFar = Math.max(maxSoFar,maxEndHere);
  }
  return maxSoFar;
 }
 
 public static void main(String args[]) {
  int arr[] = {80,100,110,90,65,70,75,90,80,70,100,80,65,60,55,50}; 
  MaximumSubArrayMain maxSum = new MaximumSubArrayMain();
  System.out.println("Maximum subarray is  " + maxSum.eleForMaxSubArray(arr));
  
 }
}
 