package com.company;

public class _2678_Number_of_Senior_Citizens {
    public int countSeniors(String[] details) {
        int count = 0;
        for (int i = 0; i < details.length; i++) {
            if (Integer.parseInt(details[i].substring(11, 13)) > 60) {
                count++;
            }
        }
        return count;
    }
}
