package com.hk;

public class Main {

    public static void main(String[] args) {

        String s1 = "aabaa";
        String s2 = "abac";
        String s3 = "a";
        isPalindrome(s1);
        isPalindrome(s2);
        isPalindrome(s3);
    }

    public static boolean isPalindrome(final String input) {
        String reversed = new StringBuilder(input).reverse().toString();

        System.out.println("Original input : " + input);
        System.out.println("Reversed : " + reversed);
        System.out.println(input.equals(reversed) ? input + " is palindromic." : input + " is not palindromic");

        return input.equals(reversed);
    }
}
