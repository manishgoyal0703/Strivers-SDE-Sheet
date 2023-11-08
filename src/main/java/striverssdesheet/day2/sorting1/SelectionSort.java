package striverssdesheet.day2.sorting1;

public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        selectionSort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static void selectionSort(int[] arr, int n){
        for (int i = 0; i < n-1; i++) {
            int min_index = i;
            for (int j = i+1; j < n; j++) {
                if(arr[min_index]>arr[j]){
                    min_index = j;
                }
                int temp = arr[i];
                arr[i] = arr[min_index];
                arr[min_index] = temp;

            }
        }
    }


}
