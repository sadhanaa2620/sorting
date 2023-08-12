import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
       
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
       
        quickSort(arr, 0, n - 1);
       
        for (int num : arr) {
            System.out.print(num + " ");
        }
       
        scanner.close();
    }
   
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
           
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }
   
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
       
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
       
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
       
        return i + 1;
    }
}
