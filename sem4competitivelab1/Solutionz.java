
import java.util.*; 

class Solutionz { 
  
    public static int lenOfLongIncSubArr(int arr[], 
                                            int n) 
    { 
        
        int max = 1, len = 1; 
        
       
        for (int i=1; i<n; i++) 
        { 
        
            if (arr[i] >=arr[i-1]) 
               { len++; 
                System.out.println("true");
            }else
            { 
          
                if (max <= len)     
                    max = len; 
                    
                      System.out.println("not true");
                len = 1;     
            }     
        } 
        
      
        if (max < len) 
            max = len; 
        
         System.out.println(max);
          System.out.println(len);
        return max+1; 
    } 
    
    
    public static void main(String[] args) 
    { 
        
            
           
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt(); 
      int[] array = new int[n];
      int sum = 0;
      for (int i=0; i<n; i++)
      {
          array[i] = scanner.nextInt();
      }
        int ne = array.length; 
         System.out.println(lenOfLongIncSubArr(array, ne)); 
        } 
    } 
    
