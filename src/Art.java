/**
 * Created by Tom on 2/16/17.
 */
public class Art extends Main {
    /**
     * The methods in this class concern themselves with the ASCII art in this game.
     */

    public static void intro() {
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
    }

    public static void winFlavor() {
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
        System.out.println("You have defeated the " + enemyType + "!\n You've won WIZARD BATTLE\n Congratulations!");

    }

    public static void beginGame() {

        System.out.println("          !~.:PREPARE FOR BATTLE!:.~!\n You will be fighting a " + enemyType + "!");
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
        System.out.println("\n\n\nA fearsome " + enemyType + " approaches!");
        System.out.print("Please press 1 to continue!");
    }

    public static void loseFlavor() {
        System.out.println("                  <     `/     |\n" +
                "                                 >          (\n" +
                "                                |   _     _  |\n" +
                "                                |  |_) | |_) |\n" +
                "                                |  | \\ | |   |\n" +
                "                                |            |\n" +
                "                 ______.______%_|            |__________  _____\n" +
                "               _/                                       \\|     |\n" +
                "              |                    " + chosenName + "                     <\n" +
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
