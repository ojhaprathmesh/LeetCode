package com.company;

public class _125_Valid_Palindrome {
    public boolean isPalindrome(String s) {
        StringBuilder temp = new StringBuilder();

        for (char ch : s.toLowerCase().toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                temp.append(ch);
            }
        }

        return temp.toString().equals(temp.reverse().toString());
    }
}
