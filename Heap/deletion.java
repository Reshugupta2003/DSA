package DSA.Heap;

public class deletion {   
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

 public static int delete(int arr[], int n){
   // Get the last element
   int lastElement = arr[n-1];

   // Replace root with last element
   arr[0] = lastElement;

   // Decrease size of heap by 1
   n--;
   // Call heapify on the reduced heap
   heapify(arr, n, 0);
   return n;
 }

 public static void main(String[] args) {
   int arr[] = {100, 70, 60, 40, 50};
   int n = arr.length;

   System.out.println("Before deletion, heap elements are: ");
   printArray(arr, n);

   n = delete(arr, n);
   System.out.println("After deletion, heap elements are: ");
   printArray(arr, n);
 }
}