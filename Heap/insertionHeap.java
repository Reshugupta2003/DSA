package DSA.Heap;

public class insertionHeap {   
    // Corrected swap method
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j]; 
        arr[j] = temp;
    }

    public static void printArray(int arr[], int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }

    public static void heapify(int arr[], int n, int i){
        // Find parent index
        int parent = (i-1)/2;

        // max heap: if parent exists and is smaller than the child, swap and heapify
        if (arr[parent] > 0) {
            if (arr[i] > arr[parent]) {
                swap(arr, i, parent);
                heapify(arr, n, parent);
            }
        }
    }

    public static int insertion(int arr[], int n, int value){
        // Increment size of heap
        n++;
        // Insert the value at the last position
        arr[n-1] = value;
        // Restore the max-heap property
        heapify(arr, n, n-1);

        return n;
    }

    public static void main(String[] args) {
        int MAX = 100;

        int arr[] = new int[MAX];

        // Initial elements of the heap
        arr[0] = 100;
        arr[1] = 70;
        arr[2] = 60;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 30;

        int n = 6;
        System.out.println("Before insert, heap elements are: ");
        printArray(arr, n);

        int value = 80;
        n = insertion(arr, n, value);

        System.out.println("After insert, heap elements are: ");
        printArray(arr, n);
    }
}
