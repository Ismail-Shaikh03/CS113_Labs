import java.util.Random;
public class RollingDice {
    public static void main(String[] args) {
        Random DieGenerator = new Random();
        int die1 = DieGenerator.nextInt(1,7);
        int die2 = DieGenerator.nextInt(1,7);
        int totalRoll = (die1+die2);
        System.out.println("This is roll 1:  " + die1 + " \nAnd this is for roll 2: " + die2 + " \nAnd this is the sum of both rolls: " + totalRoll);
    }
}