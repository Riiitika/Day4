public class insertion {

public static void insertionSort(int []arr)
{
    for(int i=1; i<arr.length-1; i++){
        int curr= arr[i];
        int back = i-1;
        while(back>=0 && arr[back] > curr){
            arr[back+1] = arr[back];
            back--;

        }
        // insertion
        arr[back+1] = curr;
    }
}

public static void printarr(int []arr){
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
    }
}

public static void main(String args[]){
    int []arr={5,6,3,0,7};
    insertionSort(arr);
    printarr(arr);
}
    
}
