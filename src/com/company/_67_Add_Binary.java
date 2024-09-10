package com.company;

public class _67_Add_Binary {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        String result = "";

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            result = result + (char) sum % 2;
            carry = sum / 2;
        }
        return new StringBuilder(result).reverse().toString();

//        int x = Integer.parseInt(a, 2), y = Integer.parseInt(b, 2);
//        System.out.printf("%s = %d, %s = %d\n", a, x, b, y);
//        return Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
    }


    public static void main(String[] args) {
        _67_Add_Binary obj = new _67_Add_Binary();
        System.out.println(obj.addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101", "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
    }
}



