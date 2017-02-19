import java.util.Random;
import java.util.Scanner;

/**
 * Created by Tom on 2/16/17.
 */
public class Numbers {

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
}
