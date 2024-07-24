import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        starPattern(num);
        starPattern2(num);
        System.out.println();
        reverseStarPattern(num);

    }

    // Pattern1
    /*
     *****
     *****
     *****
     *****
     *****
    */
    static void starPattern(int num){
        for(int i = 0; i<num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Pattern2
    /*

     *
     **
     ***
     ****
     *****

     */
    static void starPattern2(int num){
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Pattern3
    /*

     *****
     ****
     ***
     **
     *

     */
    static void reverseStarPattern(int num){
        for (int i = num; i > 0; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

    }
}