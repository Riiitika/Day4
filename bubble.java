public class bubble{

public static void bubbleSort(int[] arr){

    for(int i=0; i<arr.length-1; i++){
        for(int j=0; j<arr.length-1-i; j++){
            if(arr[j] > arr[j+1]){
                //swapping
                int temp= arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;

            }

        }

    }
   

}
 public static void printarr(int [] arr){
          for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println( );
    }

public static void main(String args[]){

    int [] arr= { 5,4,3,6,4};
    bubbleSort(arr);
    printarr(arr);
}
}