import java.util.*;

public class MySorter {
    /**
     * Returns the authors' names.
     * @return  The names of the authors of this file.
     */
    public static String getAuthors() {
        return "Kamil Reyes and Matt Greenblatt";
    }

    //private static volatile boolean foundSolution = false;
    //test
    //Two methods; the separator method and the quicksort algorithm
    public static void sort(int[] arr){
        //<<threads go here>>
    }

    private static int arrayPartition(int[] arr, int low, int high){
        //Get the median of the array
        int pivot = arr.length() / 2;
        int ptr = (low - 1); //Pointer

        //Traverse through all the elements
        for (int j = low; j < high; j++){
            if (arr[j] <= pivot){
                //if element smaller than pivot is found, swap with i++
                ptr++;
                int temp = arr[ptr];
                arr[ptr] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[ptr + 1];


        return;
    }

    private static void quicksort(int[] arr, int low, int high){
        if (low < high){
            //elements less than pivot, set to the left
            //elements greater than pivot, set to the right
            int pivot = arrayPartition(arr, low, high);

            //recursive; on the left of pivot
            quicksort(arr, low, pivot - 1);

            //recursive; on the right of pivot
            quicksort(arr, pivot + 1, high);
        }
    }

}
