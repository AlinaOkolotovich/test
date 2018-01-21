package com.company;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

/**
 * Created by okolotovich on 1/20/18.
 */
public class Word {
    private String textOfWord;
    private int lengthOfWord;

    public Word() {
    }

    protected String enterWord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a word without spaces.");
        String input = sc.nextLine();
        if (input.contains(" ")) {
            System.out.println("OOPS, the word should not contain spaces, please enter one more time.");
            enterWord();
        } else {
            this.textOfWord = input;
        }
        return this.textOfWord;

    }

    public int getLengthOfWord() {
        this.lengthOfWord = textOfWord.length();
        System.out.println("The length of word is: " + lengthOfWord + " digits");
        return lengthOfWord;
    }


}
