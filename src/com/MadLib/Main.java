package com.MadLib;

import com.sun.org.apache.xml.internal.utils.StringToStringTable;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
          //Phase 1
        Scanner keyboard;

        keyboard = new Scanner(System.in);

        String name1;
        String pastTenseVerb;
        String place;
        String verbEndingInIng;
        String famousPerson;
        String describingWord;
        String name2;
        String verbEndingWithEd;
        String nounPerson;
        String placeYouWantToVisit;
        String himOrher;
        String firstNameYouUsed;
        String pastTenseVerb2;
        String name1Again;
        String actionWord;
        String name2Repeated;
        String noun2;
        String hisOrHer;
        String pet;
        String place2;
          //Phase2
        System.out.println("Give me a name");
        name1 = keyboard.nextLine();
        System.out.println("Give me a past tense verb");
        pastTenseVerb = keyboard.nextLine();
        System.out.println("Give me a place");
        place = keyboard.nextLine();
        System.out.println("Give me a verb ending in ing");
        verbEndingInIng = keyboard.nextLine();
        System.out.println("Give me a famous person");
        famousPerson = keyboard.nextLine();
        System.out.println("Give me a describing word ");
        describingWord = keyboard.nextLine();
        System.out.println("Give me a new name");
        name2 = keyboard.nextLine();
        System.out.println("Give me a verb ending with ed");
        verbEndingWithEd = keyboard.nextLine();
        System.out.println("Give me a person");
        nounPerson = keyboard.nextLine();
        System.out.println("Give me a place you want to visit");
        placeYouWantToVisit = keyboard.nextLine();
        System.out.println("choose him or her that applies to your first name");
        himOrher = keyboard.nextLine();
        System.out.println("what was the first name you used");
        firstNameYouUsed = keyboard.nextLine();
        System.out.println("Give me another past tense verb");
        pastTenseVerb2 = keyboard.nextLine();
        System.out.println("the first name you used");
        name1Again = keyboard.nextLine();
        System.out.println("Give me an action word");
        actionWord = keyboard.nextLine();
        System.out.println("Give me the second name you used again");
        name2Repeated = keyboard.nextLine();
        System.out.println("Give me a new noun");
        noun2= keyboard.nextLine();
        System.out.println("Choose his or her that applies to the name you chose");
        hisOrHer = keyboard.nextLine();
        System.out.println("Give me a pet");
        pet = keyboard.nextLine();
        System.out.println("Give me a new place");
        place2= keyboard.nextLine();


        //Phase 3
        System.out.println("On a sunny afternoon "+name1);
        System.out.println(" was " +verbEndingInIng);
        System.out.println(" to " +place);
        System.out.println(" with " +hisOrHer +" " +pet+ " and ");
        System.out.println("ran into " +famousPerson+ " who was with " +hisOrHer+ " sister");
        System.out.println(" she said that they  had just " +pastTenseVerb);
        System.out.println(" with her friend " +name2);
        System.out.println(" " +famousPerson+ " said that " +name2Repeated+ " is very " +describingWord);
        System.out.println(" " +name1Again+ "'s sister and " +famousPerson+ " said they quickly "+pastTenseVerb2);
        System.out.println(" from her friend, later that week " +firstNameYouUsed+ " asked "+hisOrHer+ " sister how her week with " +famousPerson+ " was");
        System.out.println(" she started off by telling " +himOrher+ " that they went to " +placeYouWantToVisit);
        System.out.println(",they came back and hung out at " +place2+ " for the day");
        System.out.println("they  " +actionWord+ ", went back to her house and they " +verbEndingWithEd);
        System.out.println(" " +famousPerson+ " wanted to introduce her to their best friend " +nounPerson);
        System.out.println(" " +nounPerson+ " made "+famousPerson+ " and "+name1Again+ "'s sister a " +noun2);

    }
}
