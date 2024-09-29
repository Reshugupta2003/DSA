package DSA.Heap;

public class heapSort{

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];  // Swap elements in the array, not the indices
        arr[i] = arr[j]; 
        arr[j] = temp;
  }
  public static void printArray(int arr[], int n){
     for(int i=0; i<n; i++){
        System.out.print(arr[i] + " ");
     }
     System.out.println();
  }
    public static void heapify(int arr[], int n, int i){
        // Initialize largest as root
        int largest = i;
        
        int l  = 2 * i + 1; // left child
        int r  = 2 * i + 2; // right child
      
        // If left child is larger than root
        if(l < n && arr[l] > arr[largest]){
          largest = l;
        }
      
        // If right child is larger than the largest so far
        if(r < n && arr[r] > arr[largest]){
          largest = r;
        }
      
        // If largest is not root
        if(largest != i){
         swap(arr, i, largest);
      
        // Recursively heapify the affected sub-tree
         heapify(arr, n, largest);
        }
    }
    public static void heapsort(int arr[], int n){
      for(int i = (n/2) -1; i>=0; i--){
          heapify(arr, n, i);
      }
      for(int i = n-1; i>0; i--){
        swap(arr, i, 0);
        heapify(arr, i, 0);
      }
    }
    public static void main(String[] args) {
        
        int arr[] = {13,11,7,12,5};

        heapsort(arr, arr.length);

        printArray(arr, arr.length);
    }
}