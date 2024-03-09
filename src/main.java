import ArrayTask1.GroupAnagrams;
import DoubleLinkedList.BrowserHistory;
import DoubleLinkedList.LRUCache;
import LinkedListTask2.SwapNodes;
import stack.BasicCalculator;
import stack.EvaluateReverse;
import task4.ProductofArrayExceptSelf;
import task4.RemoveAllAdjacentDuplicates;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class main {


    public static void main(String[] args){


        String s = "0123456789102";

        int x = 0;
        int[] allTrueArray = new int[10];
        for (int i = 0; i < 10; i++) {
            allTrueArray[i] = 1;
        }
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int res = 0;
        int min = Integer.MAX_VALUE;
        int freq = 0;
        for (int i = 0; i < s.length(); i++) {
            int [] arr = new int[10];
            for (int j = 0; j < s.length(); j++) {
                arr[s.charAt(j) - '0'] = 1;
                if (Arrays.equals(allTrueArray,arr)){
                    int ma = j;
                    if (ma < min){
                        min = ma;
                        freq =1;
                    }else if (ma == min){
                        freq++;
                    }
                }
            }
        }
        System.out.println(freq);

    }

    public static int countRepetitions(String text, String substring) {
        int count = 0;
        int index = 0;

        while ((index = text.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length(); // Move the search index past the current substring
        }

        return count;
    }

    public static int countOccurrences(String s) {
        // Minimum length required to contain all digits 0-10
        int minLen = 11;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            // Check if remaining string length is enough to contain all digits
            if (s.length() - i < minLen) {
                break;
            }

            // Create a set of characters in the current substring
            Set<Character> digits = new HashSet<>();
            for (int j = i; j < i + minLen; j++) {
                digits.add(s.charAt(j));
            }

            // Check if the set contains all digits from 0 to 10
            if (digits.equals(Set.of('0', '1', '2', '3', '4', '5', '6', '7', '8', '9'))) {
                count++;
            }
        }

        return count;
    }

    public static int findShortestSubstringCount(String S) {
        int[] frequency = new int[10]; // Frequency array for digits 0 to 9
        Arrays.fill(frequency, 0);

        int left = 0; // Left pointer
        int count = 0; // Count of valid substrings

        for (int right = 0; right < S.length(); right++) {
            char currChar = S.charAt(right);
            if (currChar >= '0' && currChar <= '9') {
                frequency[currChar - '0']++; // Update frequency for the current digit
            }

            // Slide the window to the right
            while (Arrays.stream(frequency).allMatch(freq -> freq > 0)) {
                // Valid substring found
                count += S.length() - right; // Add the count of valid substrings ending at the current position
                char leftChar = S.charAt(left);
                if (leftChar >= '0' && leftChar <= '9') {
                    frequency[leftChar - '0']--; // Remove the leftmost digit from the frequency
                }
                left++; // Move the left pointer
            }
        }

        return count;
    }
}
