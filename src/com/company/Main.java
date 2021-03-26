package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = keyboard.nextLine();

        int words = 1;
        int sentences = 0;
        int letters = 0;

        for (int i  = 0; i  < text.length() - 1; i++){
            if ((text.charAt(i) == ' ') && (text.charAt(i + 1) != ' ')){
                words++;}
        }
        for (char i : text.toCharArray()) {

            // Count Word Letters
            if (Character.isLetterOrDigit(i)) {
                letters++;
            }
        }
        sentences = text.split("[.]").length;
        double L = ((double) letters / (double) words) * 100;
        double S = ((double) sentences / (double) words) * 100;
        int grade = (int) Math.round(0.0588 * L - 0.296 * S - 15.8);

        System.out.println("Sentences: " + sentences);
        System.out.println("Words: " + words);
        System.out.println("Word letters: " + letters);
        if (grade < 1 ){
            System.out.println("Before Grade 1");
        }
        else if (grade >= 16){
            System.out.println("Grade 16+ ");
        }
        else
            System.out.println("Grade: " + grade);
    }
}

