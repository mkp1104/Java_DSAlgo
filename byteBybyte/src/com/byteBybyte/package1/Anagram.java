package com.byteBybyte.package1;

public class Anagram {
public static void main(String[] args) {
	System.out.println(isAnagram("abcd", "bcda"));
}
public static boolean isAnagram(String s1, String s2) {
    if (s1.length() != s2.length()) return false;
 
    s1 = s1.toLowerCase();
    s2 = s2.toLowerCase();
 
    int[] letters = new int[256];
 
    for (char c : s1.toCharArray()) {
    	System.out.println("before letters[c]++  :::   " + letters[c]);
        letters[c]++;
        System.out.println("after letters[c]++  :::   " + letters[c]);
    }
 
    for (char c: s2.toCharArray()) {
    	System.out.println("before letters[c]--  :::   " + letters[c]);
        letters[c]--;
        System.out.println("after letters[c]--  :::   " + letters[c]);
    }
 
    for (int i : letters) {
        if (i != 0) return false;
    }
 
    return true;
}
}
