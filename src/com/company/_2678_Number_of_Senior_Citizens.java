package com.company;

public class _2678_Number_of_Senior_Citizens {
    public int countSeniors(String[] details) {
        int count = 0;
        for (String detail : details) {
            int age = (detail.charAt(11) - '0') * 10 + (detail.charAt(12) - '0');
            if (age > 60) {
                count++;
            }
        }
        return count;
    }
}
