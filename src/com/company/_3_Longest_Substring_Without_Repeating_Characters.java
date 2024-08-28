package com.company;

import java.util.HashSet;
import java.util.Set;

public class _3_Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int maxLen = 0, start = 0;

        for (int end = 0; end < s.length(); end++) {
            while (seen.contains(s.charAt(end))) {
                seen.remove(s.charAt(start));
                start++;
            }
            seen.add(s.charAt(end));
            maxLen = Math.max(maxLen, end + 1 - start);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        _3_Longest_Substring_Without_Repeating_Characters obj = new _3_Longest_Substring_Without_Repeating_Characters();
        System.out.println(obj.lengthOfLongestSubstring("pwwkew"));
    }
}