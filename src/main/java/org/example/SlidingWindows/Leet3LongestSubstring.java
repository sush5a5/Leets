package org.example.SlidingWindows;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Leet3LongestSubstring {
    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }


    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();
        int left = 0;
        for (int right = 0; right < n; right++) {
            if (!charSet.contains(s.charAt(right))) {
                charSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                while (charSet.contains(s.charAt(right))) {
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(right));
            }
        }
        System.out.println(charSet.stream().collect(Collectors.toList()));
        return maxLength;
    }

}

