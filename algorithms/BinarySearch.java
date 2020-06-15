import edu.princeton.cs.algs4.*;
import java.util.Arrays;
public class BinarySerach{
    
   private static final int NOT_FOUND = -1;
 
   public static int rank(int[] arr,int key){
     int lo = 0;
     int hi = arr.length - 1;
     
     while ( lo <= hi){
        int mid = (lo + hi)/ 2;
        if (arr[mid] == key)
           return mid + 1;
        if (arr[mid] > key)
           hi = mid - 1;
        else lo = mid + 1;
    
     }
     return NOT_FOUND;
 
   }
   
   public static void main(String[] args){
     In in = new In(args[0]);
     int[] whiteList = in.readInt();
     if (rank(whiteList, key) < 0)
         System.out.println(key);
   }

} 
