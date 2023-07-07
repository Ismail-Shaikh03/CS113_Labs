import java.util.Scanner;
public class Lab5 {

    public static void main (String[] args ){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please give a face value of a Die(1-6): ");

        Die d1 = new Die();
        d1.setFaceValue(scan.nextInt());
        System.out.println("First die: "+  d1);

        Die d2 = new Die();
        int counter = 0;

        while(d1.compareTo(d2) != 0){
            System.out.println("Second die: " +d2);
            if (d1.getFaceValue() < d2.getFaceValue())
                counter++;

            d2.roll();

        }
        System.out.println("D1 equals D2 ");
        System.out.println("How many times Random values from d2 were greater than d1: "+ counter);
    }
}
