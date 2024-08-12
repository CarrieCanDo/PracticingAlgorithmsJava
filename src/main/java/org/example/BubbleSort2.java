package org.example;

public class BubbleSort2 {
    public static void bubblesort2(int arr[], int N) {
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
        int N = 10;
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        bubblesort2(arr, N);

        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

