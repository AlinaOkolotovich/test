package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by okolotovich on 1/20/18.
 */
public class Sentence extends Word {
    private int numberOfWords;
    private String[] sentence;
    private int k;
    private char newValue;
    public Sentence() {
    }

    /* Assuming that sentence is an array of words the next method will create an array of Strings */
    public void createSentenсe(){
        Sentence testSentence = new Sentence();
        Scanner sc = new Scanner(System.in);
        int input;
        System.out.println("Please, set, how many words will your sentence contain.");
        input = sc.nextInt();
        this.numberOfWords = input;

        String[] inputStrings = new String[this.numberOfWords];
        for(int i=0; i<input; i++){
            Word w = new Word();
            inputStrings[i]=w.enterWord();
        }
        for (int i=0; i<input; i++){
            System.out.print(inputStrings[i]+" ");
        }
        this.sentence=inputStrings;
    }

    /* The following method will change every k-th digit (for ex. every second, if k=2) in a word to the value sent in param "newValue" is */
    public String[] changeElementToNew(){
        enterParamaterK();
        enterNewValue();
        String[] newSentence = this.sentence;
        for (int i=0; i<sentence.length;i++){
            if (newSentence[i].length()<k){
        }
            else {
                String stringToChange = newSentence[i];
                char[] newChars = stringToChange.toCharArray();
                newChars[k-1] = this.newValue;
                newSentence[i] = String.valueOf(newChars);
                this.sentence[i]=newSentence[i];
            }
        }
        for (int i=0; i<sentence.length; i++){
            System.out.print(newSentence[i]+" ");
        }
        return this.sentence;
    }

    private int enterParamaterK(){
        try{
            int k;
            Scanner sc = new Scanner(System.in);
            System.out.println("Please, enter parameter k:");
            k=sc.nextInt();
            this.k=k;

        }catch (InputMismatchException e){
                System.out.println("OOPS, k should be a number.");
                enterParamaterK();
        }
        return k;
        }



    private char enterNewValue(){
        String enteredValue;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a new value without spaces:");
        enteredValue=sc.nextLine();
        if (enteredValue.length()!=1&&enteredValue!=" "){
            System.out.println("OOPS, the new value should consist of 1 digit, please enter correct value.");
            enterNewValue();
        }
        else {
            this.newValue = enteredValue.charAt(0);
        }
        return this.newValue;
    }


}


