package Battle;


import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Tom on 9/9/16.
 */
public class PlayBattle
{

    public static int randomInt (int min, int max){
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }

    public static int getIntFromUser() {
        Scanner myScanner = new Scanner(System.in);
        int type = myScanner.nextInt();
        while (type == 0) {

        }
        return type;
    }
    public Object character;



    public static void main(String[] args) {


        System.out.println("             Welcome to:");
        System.out.println("                            | |\n" +
                "__      ___ ______ _ _ __ __| |\n" +
                "\\ \\ /\\ / / |_  / _` | '__/ _` |\n" +
                " \\ V  V /| |/ / (_| | | | (_| |\n" +
                "  \\_/\\_/ |_/___\\__,_|_|  \\__,_|");
        System.out.println("| |         | | | | | |     \n" +
                "| |__   __ _| |_| |_| | ___ \n" +
                "| '_ \\ / _` | __| __| |/ _ \\\n" +
                "| |_) | (_| | |_| |_| |  __/\n" +
                "|_.__/ \\__,_|\\__|\\__|_|\\___|\n" +
                "                            ");
        System.out.println("A game by Tom Cilano.");
        System.out.println("\n" +
                "\n" +
                "              o\n" +
                "                   O       /`-.__\n" +
                "                          /  \\·'^|\n" +
                "             o           T    l  *\n" +
                "                        _|-..-|_\n" +
                "                 O    (^ '----' `)\n" +
                "                       `\\-....-/^\n" +
                "             O       o  ) \"/ \" (\n" +
                "                       _( (-)  )_\n" +
                "                   O  /\\ )    (  /\\\n" +
                "                     /  \\(    ) |  \\\n" +
                "                 o  o    \\)  ( /    \\\n" +
                "                   /     |(  )|      \\\n" +
                "                  /    o \\ \\( /       \\\n" +
                "            __.--'   O    \\_ /   .._   \\\n" +
                "           //|)\\      ,   (_)   /(((\\^)'\\\n" +
                "              |       | O         )  `  |\n" +
                "              |      / o___      /      /\n" +
                "             /  _.-''^^__O_^^''-._     /\n" +
                "           .'  /  -''^^    ^^''-  \\--'^\n" +
                "         .'   .`.  `'''----'''^  .`. \\\n" +
                "       .'    /   `'--..____..--'^   \\ \\\n" +
                "      /  _.-/                        \\ \\\n" +
                "  .::'_/^   |                        |  `.\n" +
                "         .-'|                        |    `-.\n" +
                "   _.--'`   \\                        /       `-.\n" +
                "  /          \\                      /           `-._\n" +
                "  `'---..__   `.                  .´_.._   __       \\\n" +
                "           ``'''`.              .'      `'^  `''---'^\n" +
                "                  `-..______..-'\n" +
                "\n");

        Scanner myScanner = new Scanner(System.in);
        String PlayerType = "";
        String PlayerRace = "";
        String EnemyType = "";
        String Magic = "";
        String weapon= "";
        int playerHealth = 100;
        int enemyHealth =100;


        System.out.println("Please enter your name?");
        Scanner name = new Scanner(System.in);
        String x = name.next();
        System.out.println("Ok, " + x + " from now on only select 1 or 2!");
        System.out.println("Please select a race:\n1. Elf \n2. Human ");
         int race = getIntFromUser();
        if ( race == 1){
            PlayerRace = "Elf";
            System.out.println("OK: " + x + " the " + PlayerRace);
        }
        else if (race == 2){
            PlayerRace = "Human";
            System.out.println("OK: " + x + " the " + PlayerRace);
        }
        else
        {
            System.out.println("You have failed to follow the rules and so have lost. Please try again!");
        }

        System.out.println("Please choose the number of your preferred class...");
        System.out.println("1. Mage");
        System.out.println("2. Necromancer");


        int type = getIntFromUser();


        if (type == 1)
        {

            PlayerType = "Mage";
            EnemyType ="Necromancer";
            System.out.println("You have selected Mage!");
        }
        else if (type == 2)
        {

            PlayerType = "Necromancer";
            EnemyType ="Mage";

            System.out.println("You have selected Necromancer!");

        }
        else
        {
            System.out.println("You have failed to follow the rules and so have lost. Please try again!");
        }




        System.out.println( x +" the mighty " + PlayerRace +" "+ PlayerType + "! Choose a weapon: \n 1: Staff \n 2: Sword" );
        System.out.println("");

        int weaponInit = getIntFromUser();
         if (weaponInit == 1)
         {
             weapon = "Staff";
             System.out.println("You have selected the Staff! you get + 5 ATTACK \n");
         }
         else if (weaponInit == 2){
             weapon = "Sword";
             System.out.println(" You have selected the Sword, you get + 5 ATTACK!");
             System.out.println("       /\n" +
                     "*//////{<>==================-\n" +
                     "        \\");
         }
         else
         {
             System.out.println("You have failed to follow the rules and so have lost. Please try again!");
         }
        System.out.println("Now select a spell\n 1.Fireball\n 2.Magic Missile");
        int spell = getIntFromUser();
        if (spell ==1)
        {
            Magic = "Fireball";
            System.out.println("You choose Fireball!");
            System.out.println("");
        }
        else if (spell == 2)
        {
            Magic = "Magic Missle";
            System.out.println("You choose Magic Missle!\n\n2");
        }
        else
        {
            System.out.println("You have failed to follow the rules and so have lost. Please try again!");
        }

        System.out.println("          !~.:PREPARE FOR BATTLE!:.~!\n You will be fighting a " + EnemyType +"!");
        System.out.println("                             /\\ \n" +
                "                            /  \\\n" +
                "                           |    |\n" +
                "                         --:'''':--\n" +
                "                           :'_' :\n" +
                "                           _:\"\":\\___\n" +
                "            ' '      ____.' :::     '._\n" +
                "           . *=====<<=)           \\    :\n" +
                "            .  '      '-'-'\\_      /'._.'\n" +
                "                             \\====:_ \"\"\n" +
                "                            .'     \\\\\n" +
                "                           :       :\n" +
                "                          /   :    \\\n" +
                "                         :   .      '.\n" +
                "         ,. _            :  : :      :\n" +
                "      '-'    ).          :__:-:__.;--'\n" +
                "    (        '  )        '-'   '-'\n" +
                " ( -   .00.   - _\n" +
                "(    .'  _ )     )\n" +
                "'-  ()_.\\,\\,   -");
        System.out.println("\n\n\nA fearsome " + EnemyType +" approaches!");
        int minusHealth = 0;
        int minusplayerHealth = 0;
        while (enemyHealth >0 && playerHealth>0){
            System.out.println("Please choose an attack\n1."+ weapon+ "\n2." + Magic );
            int Attack = getIntFromUser();
            if (Attack == 1)
            {
                System.out.println("You swing your "+ weapon);
                int damage = randomInt(0,20);
                if (damage == 0)
                {
                    System.out.println("You've Missed!");
                }
                else if (damage < 8)
                {
                    System.out.println("A weak hit!");
                }
                else if (damage < 13)
                {
                    System.out.println("A decent strike!");
                }
                else if (damage < 19) {
                    System.out.println("A decent strike!");
                }
                else
                {
                    System.out.println("CRITICAL STRIKE!! + 5 damage!\n");
                    damage = damage + 5;
                }

                System.out.println("Your " + weapon + " has done " + damage + " damage!\n");
                minusHealth = enemyHealth - damage;
                int enemyDamage;
                enemyDamage = randomInt(0,20);
                if (enemyDamage ==20){
                    System.out.println("Oh no a CRITICAL STRIKE! you take + 5 damage");
                    enemyDamage = enemyHealth + 5;
            }
                System.out.println(EnemyType +"'s turn!\n\nThe " + EnemyType + " does " + enemyDamage + " damage to you!\n\n");
                minusplayerHealth = playerHealth - enemyDamage;
            }

           else if (Attack == 2)
            {
                System.out.println("You cast your "+ Magic );
                int damage = randomInt(0,20);
                if (damage == 0)
                {
                    System.out.println("You've Missed!");
                }
                else if (damage < 8)
                {
                    System.out.println("A weak hit!");
                }
                else if (damage < 13)
                {
                    System.out.println("A decent strike!");
                }
                else if (damage < 19) {
                    System.out.println("A decent strike!");
                }
                else
                {
                    System.out.println("CRITICAL STRIKE!! + 5 damage!\n");
                    damage = damage + 5;
                }

                System.out.println("You have done " + damage +" damage with your " + Magic + "!");
                minusHealth = enemyHealth - damage;
                int enemyDamage;
                enemyDamage = randomInt(0,20);
                if (enemyDamage ==20)
                {
                    System.out.println("Oh no a CRITICAL STRIKE! you take + 5 damage");
                    enemyDamage = enemyHealth + 5;
                }
                System.out.println(EnemyType +"'s turn!\n\nThe " + EnemyType + " does " + enemyDamage + " damage to you!\n\n");
                minusplayerHealth = playerHealth - enemyDamage;
            }

            enemyHealth = minusHealth;
            playerHealth = minusplayerHealth;

            System.out.println(x + " is at " + playerHealth+"hp");
            System.out.println("The enemy " + EnemyType + " is at " + enemyHealth + "hp\n");

        }
        if (enemyHealth <= 0){

            System.out.println("        _\n" +
                    "              _\\ /_\n" +
                    "              >_X_< \n" +
                    "       .---._  /_\\  _.---.\n" +
                    "     /`.---._`{/ \\}`_.---.`\\\n" +
                    "    | /   ___`{\\_/}`___   \\ |\n" +
                    "    \\ \\.\"`*  `\"{_}\"`  *`\"./ /\n" +
                    "     \\ \\  )\\  _\\ /_  /(  / /\n" +
                    "      \\ *<()( >_X_< )()>* /\n" +
                    "       |._)/._./_\\._.\\(_.|\n" +
                    "       |() () () () () ()|\n" +
                    "       <<o>><<o>><o>><<o>>\n" +
                    "      `\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"`\n");
            System.out.println("You have defeated the "+ EnemyType +"!\n You've won WIZARD BATTLE\n Congratulations!");
        }
        else if (playerHealth <=0)
        {
            System.out.println("                  <     `/     |\n" +
                    "                                 >          (\n" +
                    "                                |   _     _  |\n" +
                    "                                |  |_) | |_) |\n" +
                    "                                |  | \\ | |   |\n" +
                    "                                |            |\n" +
                    "                 ______.______%_|            |__________  _____\n" +
                    "               _/                                       \\|     |\n" +
                    "              |                    " + x +"                     <\n" +
                    "              |_____.-._________              ____/|___________|\n" +
                    "                                |            |\n" +
                    "                                |            |\n" +
                    "                                |            |\n" +
                    "                                |            |\n" +
                    "                                |   _        <\n" +
                    "                                |__/         |\n" +
                    "                                 / `--.      |\n" +
                    "                               %|            |%\n" +
                    "                           |/.%%|          -< @%%%\n" +
                    "                           `\\%`@|     v      |@@%@%%    - mfj\n" +
                    "                         .%%%@@@|%    |    % @@@%%@%%%%\n" +
                    "                    _.%%%%%%@@@@@@%%_/%\\_%@@%%@@@@@@@%%%%%%\n");
            System.out.println("\n you have LOST! please try again!");
        }

    }
}







