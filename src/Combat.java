/**
 * Created by Tom on 2/19/17.
 */
public class Combat extends Main {

    static int damage = Numbers.randomInt(0, 20);
    static int Attack = Numbers.getIntFromUser();
    static int enemyDamage;


    public static void mainCombat() {
        while (enemyHealth > 0 && playerHealth > 0) {
            System.out.println("Please choose an attack\n1." + weapon + "\n2." + magic);
            Attack = Numbers.getIntFromUser();
            if (Attack == 1) {
                System.out.println("You swing your " + weapon);
                damage = Numbers.randomInt(0, 20);
                fightFlavor();

                System.out.println("Your " + weapon + " has done " + damage + " damage!\n");
                minusHealth = enemyHealth - damage;
                enemyDamage = Numbers.randomInt(0, 20);
                if (enemyDamage == 20) {
                    System.out.println("Oh no a CRITICAL STRIKE! you take + 5 damage");
                    enemyDamage = enemyHealth + 5;
                }
                System.out.println(enemyType + "'s turn!\n\nThe " + enemyType + " does " + enemyDamage + " damage to you!\n\n");
                minusplayerHealth = playerHealth - enemyDamage;
            }


            if (Attack == 2) {
                System.out.println("You cast your " + magic);
                damage = Numbers.randomInt(0, 20);
                fightFlavor();
                System.out.println(enemyType + "'s turn!\n\nThe " + enemyType + " does " + enemyDamage + " damage to you!\n\n");
                minusplayerHealth = playerHealth - enemyDamage;

            }
            enemyHealth = minusHealth;
            playerHealth = minusplayerHealth;

            System.out.println(chosenName + " is at " + playerHealth + "hp");
            System.out.println("The enemy " + enemyType + " is at " + enemyHealth + "hp\n");

            if (enemyHealth <= 0) {

                Flavor.winFlavor();

            } else if (playerHealth <= 0) {
                Flavor.loseFlavor();
            }
        }
    }


    public static void fightFlavor() {
        if (damage == 0) {
            System.out.println("You've Missed!");
        } else if (damage < 8) {
            System.out.println("A weak hit!");
        } else if (damage < 13) {
            System.out.println("A decent strike!");
        } else if (damage < 19) {
            System.out.println("A decent strike!");
        } else {
            System.out.println("CRITICAL STRIKE!! + 5 damage!\n");
            damage = damage + 5;
        }

    }
}
