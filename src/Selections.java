import java.util.Scanner;

/**
 * Created by Tom on 2/19/17.
 */
public class Selections extends Main {

    /**
     * This method deals with player name selection.
     */
    public static void nameSelection() {
        System.out.println("Please enter your name?");
        Scanner name = new Scanner(System.in);
        chosenName = name.next();
        System.out.println("Ok, " + chosenName + " from now on only select 1 or 2!");
        System.out.println("Please select a race:\n1. Elf \n2. Human ");
        int race = Numbers.getIntFromUser();
        if (race == 1) {
            playerRace = "Elf";
            System.out.println("OK: " + chosenName + " the " + playerRace);
        } else if (race == 2) {
            playerRace = "Human";
            System.out.println("OK: " + chosenName + " the " + playerRace);
        } else {
            System.out.println("You have failed to follow the rules and so have lost. Please try again!");
        }
    }

    /**
     * This method deals with class selection (there is currently no real difference between the two.)
     */
    public static void classSelection() {
        System.out.println("Please choose the number of your preferred class...");
        System.out.println("1. Mage");
        System.out.println("2. Necromancer");

        int type = Numbers.getIntFromUser();


        if (type == 1) {

            playerType = "Mage";
            enemyType = "Necromancer";
            System.out.println("You have selected Mage!");
        } else if (type == 2) {

            playerType = "Necromancer";
            enemyType = "Mage";

            System.out.println("You have selected Necromancer!");

        } else {
            System.out.println("You have failed to follow the rules and so have lost. Please try again!");
        }

    }

    /**
     * This is your weapon selection (there is currently no real difference between the two.)
     */
    public static void weaponSelection() {
        System.out.println(chosenName + " the mighty " + playerRace + " " + playerType + "! Choose a weapon: \n 1: Staff \n 2: Sword");
        System.out.println("");

        int weaponInit = Numbers.getIntFromUser();
        if (weaponInit == 1) {
            weapon = "Staff";
            System.out.println("You have selected the Staff! you get + 5 ATTACK \n");
        } else if (weaponInit == 2) {
            weapon = "Sword";
            System.out.println(" You have selected the Sword, you get + 5 ATTACK!");
            System.out.println("       /\n" +
                    "*//////{<>==================-\n" +
                    "        \\");
        } else {
            System.out.println("You have failed to follow the rules and so have lost. Please try again!");
        }
    }

    /**
     * This is your spell selection (there is currently no real difference between the two.)
     */
    public static void spellSelection() {
        System.out.println("Now select a spell\n 1.Fireball\n 2.Magic Missile");
        int spell = Numbers.getIntFromUser();
        if (spell == 1) {
            magic = "Fireball";
            System.out.println("You choose Fireball!");
            System.out.println("");
        } else if (spell == 2) {
            magic = "Magic Missile";
            System.out.println("You choose Magic Missile!\n\n2");
        } else {
            System.out.println("You have failed to follow the rules and so have lost. Please try again!");
        }
    }
}
