/**
 * Created by Tom on 9/9/16.
 */
public class Main {

    static String playerType = null;
    static String playerRace = null;
    static String enemyType = null;
    static String magic = null;
    static String weapon = null;
    static String chosenName = null;
    static int playerHealth = 100;
    static int enemyHealth = 100;
    static int minusHealth = 0;
    static int minusplayerHealth = 0;

    public static void main(String[] args) {


        Art.intro();
        Conditionals.nameSelection();
        Conditionals.classSelection();
        Conditionals.weaponSelection();
        Conditionals.spellSelection();
        Art.beginGame();
        Combat.mainCombat();


    }
}






