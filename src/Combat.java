/**
 * Created by Tom on 2/19/17.
 */
public class Combat extends Main {

    static int damage = Numbers.randomInt(0, 20);
    static int Attack = Numbers.getIntFromUser();
    static int enemyDamage;

    /**
     * This Method contains The logic for combat in this game. The damage of the attack can be altered by changing
     * the parameters in the Numbers.randomInt(0,0) method. Alter that parameter will alter the minimum and maximum
     * damage for an attack(see NOTE).
     * This method also calculates the enemy damage and prints out the remaining hit points after a round of combat.
     * <p>
     * NOTE: The Number that in produced through the Numbers is passed through the method fightFlavor()
     */
    public static void mainCombat() {
        while (enemyHealth > 0 && playerHealth > 0) {
            System.out.println("Please choose an attack\n1." + weapon + "\n2." + magic);
            Attack = Numbers.getIntFromUser();
            // this is a melee attack.
            if (Attack == 1) {
                System.out.println("You swing your " + weapon);
                damage = Numbers.randomInt(0, 20);
                fightFlavor();
                System.out.println("Your " + weapon + " has done " + damage + " damage!\n");
                minusHealth = enemyHealth - damage;

                //Here the enemy attack is calculated. There is flavor text only on a critical hit.
                enemyDamage = Numbers.randomInt(0, 20);
                if (enemyDamage > 18) {
                    System.out.println("Oh no a CRITICAL STRIKE! you take + 5 damage");
                    enemyDamage = enemyHealth + 5;
                }
                System.out.println(enemyType + "'s turn!\n\nThe " + enemyType + " does " + enemyDamage + " damage to you!\n\n");
                minusPlayerHealth = playerHealth - enemyDamage;
            }

            //This is a spell attack (at this point is is no different then a melee attack.)
            if (Attack == 2) {
                System.out.println("You cast your " + magic);
                damage = Numbers.randomInt(0, 20);
                fightFlavor();
                enemyDamage = Numbers.randomInt(0, 20);
                if (enemyDamage > 18) {
                    System.out.println("Oh no a CRITICAL STRIKE! you take + 5 damage");
                    enemyDamage = enemyHealth + 5;
                    System.out.println(enemyType + "'s turn!\n\nThe " + enemyType + " does " + enemyDamage + " damage to you!\n\n");
                    minusPlayerHealth = playerHealth - enemyDamage;

                }
                enemyHealth = minusHealth;
                playerHealth = minusPlayerHealth;

                System.out.println(chosenName + " is at " + playerHealth + "hp");
                System.out.println("The enemy " + enemyType + " is at " + enemyHealth + "hp\n");

                if (enemyHealth <= 0) {

                    Art.winFlavor();

                } else if (playerHealth <= 0) {
                    Art.loseFlavor();
                }
            }
        }
    }

    /**
     * This is flavor text for the damage a player does to the enemy. If the min/max number in the mainCombat()
     * are altered then these parameters need to be alter as well in order for it to make sense.
     */
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
