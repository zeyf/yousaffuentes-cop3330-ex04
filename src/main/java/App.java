/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 zain yousaffuentes
 */

import java.util.Scanner;


public class App {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);


        System.out.println("Enter a noun: ");
        String noun = s.nextLine();

        System.out.println("Enter a verb: ");
        String verb = s.nextLine();

        System.out.println("Enter an adjective: ");
        String adjective = s.nextLine();

        System.out.println("Enter an adverb: ");
        String adverb = s.nextLine();

        System.out.println(String.format("Do you %s your %s %s %s? That's hilarious!", verb, adjective, noun, adverb));
    }
}

