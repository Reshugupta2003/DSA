import java.util.*;

public class SlidingWindow {

    static void printMax(int[] arr, int k, int n) {

        Deque<Integer> Qi = new LinkedList<>();

        int i;
        for (i = 0; i < k; ++i) {

            while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()]) 
                Qi.removeLast();

            Qi.addLast(i);
        }

        for (i = k; i < n; ++i) {

            System.out.print(arr[Qi.peek()] + " ");

            while ((!Qi.isEmpty()) && Qi.peek() <= i - k)
                Qi.removeFirst();

            while ((!Qi.isEmpty()) && arr[i] >= arr[Qi.peekLast()])
                Qi.removeLast();

            Qi.addLast(i);
        }

        System.out.print(arr[Qi.peek()]);
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 7, 9, 12, 11, 25};
        int k = 3;

        printMax(arr, k, arr.length);
    }
}