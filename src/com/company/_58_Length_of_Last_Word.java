package com.company;

class _58_Length_of_Last_Word {

    public int lengthOfLastWord(String s) {
        s = s.trim();
        int index = s.lastIndexOf(' ') + 1;
        return (s.substring(index, s.length())).length();
    }

    public static void main(String[] args) {
        _58_Length_of_Last_Word obj = new _58_Length_of_Last_Word();
        System.out.println((obj.lengthOfLastWord("Hello World")));
    }
}
