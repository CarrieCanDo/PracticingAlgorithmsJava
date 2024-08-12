package org.example;

public class BubbleSort {
    public static void bubblesort(int arr[], int N) {
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int N = 5;
        int[] arr = {4, 1, 3, 9, 7};

        bubblesort(arr, N);

        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
