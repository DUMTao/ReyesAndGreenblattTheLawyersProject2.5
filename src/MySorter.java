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

    //Two methods; the separator method and the quicksort algorithm
    public static void sort(int[] arr){
        quicksort(arr, 0, arr.length - 1);
    }

    private static int arrayPartition(int[] arr, int low, int high){
        //Get the median of the array
        int pivot = arr[(low + high) / 2];

        while (true){
            while (arr[low] < pivot){
                low++;
            }
            while (arr[high] > pivot){
                high--;
            }

            if (low >= high){
                return high;
            }

            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
    }

    private static void quicksort(int[] arr, int low, int high){
        if (low < high){
            //elements less than pivot, set to the left
            //elements greater than pivot, set to the right
            int pivot = arrayPartition(arr, low, high);

            //recursive; on the left of pivot
            quicksort(arr, low, pivot);

            //recursive; on the right of pivot
            quicksort(arr, pivot + 1, high);
        }
    }

    /*
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
     */

}
