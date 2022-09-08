/*
 * Author Name: Aditya Chaurasia
 * Date: 08-09-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.aditya;

import java.util.Scanner;

public class AlphabetChecker {
    public static void main(String[] args) {


    }
    /**
     * Prints "vowel" if the input character is a vowel, "consonant" if the input character is a consonant,
     * and "invalid" if the input character is neither a vowel nor a consonant.
     */
    public void printVowelOrConsonant(char alphabet) {
        if (alphabet == 'a' || (alphabet == 'e') || (alphabet == 'i') || (alphabet == 'o') || (alphabet == 'u')) {
            System.out.println("vowel");
        } else if (alphabet == 'b' || alphabet == 'c' || alphabet == 'd' || alphabet == 'f' || alphabet == 'g' || alphabet == 'h' || alphabet == 'j' || alphabet == 'k' || alphabet == 'l' || alphabet == 'm' || alphabet == 'n' || alphabet == 'p' || alphabet == 'q' || alphabet == 'r' || alphabet == 's' || alphabet == 't' || alphabet == 'v' || alphabet == 'w' || alphabet == 'x' || alphabet == 'y' || alphabet == 'z')
            System.out.println("consonant");
        else System.err.println("invalid");
    }
}