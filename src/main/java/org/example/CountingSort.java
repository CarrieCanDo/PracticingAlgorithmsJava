package org.example;


public class CountingSort {
    public static String countSort(String arr) {
        // Create a count array to store the count of each character
        int[] count = new int[26];

        // Count the occurrences of each character in the input string
        for (char c : arr.toCharArray()) {
            count[c - 'a']++;
        }

        // Build the sorted string using the count array
        StringBuilder sortedString = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            while (count[i] > 0) {
                sortedString.append((char) (i + 'a'));
                count[i]--;
            }
        }

        return sortedString.toString();
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(countSort("edsab")); // Output: abdes
        System.out.println(countSort("geeksforgeeks")); // Output: eeeefggkkorss
    }
}
