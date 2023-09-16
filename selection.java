

public class selection {

public static void selectionSort(int arr[]){
    for(int i=0; i<arr.length; i++){
        int minpose=i;
        for(int j=i+1; j<arr.length; j++){
            if(arr[minpose] > arr[j]){
                minpose =j;
            }
        }
        //swapping
        int temp= arr[minpose];
        arr[minpose] = arr[i];
        arr[i] = temp;
    }
}

public static void printarr(int arr[]){
    for(int i=0;i<arr.length; i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}

public static void main(String args[]){
    int arr[] ={6,5,8,9,3};
    selectionSort(arr);
   
    printarr(arr);
}
    
}
