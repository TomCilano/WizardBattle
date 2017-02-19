import java.util.Random;
import java.util.Scanner;

/**
 * Created by Tom on 2/16/17.
 */
public class Numbers {
    /**
     * This Method picks a random number between the two numbers passed into the method.
     *
     * @param min
     * @param max
     * @return
     */
    public static int randomInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }

    /**
     * This method takes in a users number selection.
     *
     * @return
     */
    public static int getIntFromUser() {
        Scanner myScanner = new Scanner(System.in);
        int type = myScanner.nextInt();
        while (type == 0) {

        }
        return type;
    }
}
