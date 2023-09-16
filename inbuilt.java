
import java.util.*;
public class inbuilt {


public static void ibl(int arr[]){
    for(int i=0; i<arr.length;i++){
      
        System.out.print(arr[i] + " ");

    }
 System.out.println();
}

public static void main(String args[]){
    int arr[] = {3,4,6,3,8};
       Arrays.sort(arr);
      ibl(arr);
}
    
}
