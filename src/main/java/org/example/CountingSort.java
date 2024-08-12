package org.example;

public class CountingSort {
    public static String countSort(String arr) {
        int n = arr.length();
        int[] count = new int[26]; // Letters in alphabet
        char[] output = new char[n];

        // Step 1: Count the frequency of each character
        for (int i = 0; i < n; i++) {
            count[arr.charAt(i) - 'a']++;
        }

        // Step 2: Modify the count array to accumulate positions
        for (int i = 1; i < 26; i++) {
            count[i] += count[i - 1];
        }

        // Step 3: Build the output character array
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr.charAt(i) - 'a'] - 1] = arr.charAt(i);
            count[arr.charAt(i) - 'a']--;
        }

        // Step 4: Convert the output array to a string and return it
        return new String(output);
    }

    public static void main(String[] args) {
        String arr = "geeksforgeeks";
        String sortedArr = countSort(arr);

    }

}

