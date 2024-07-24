import java.util.Scanner;

public class StarPatterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.println(starPattern(num));
        System.out.println(starPattern2(num));
        System.out.println(starPattern3(num));
        System.out.println(numberPattern(num));
        System.out.println(starPattern4(num));

    }

    static String starPattern(int num){
        StringBuilder str = new StringBuilder();
        for(int i = 0; i<num; i++){
            for (int j = 0; j < num; j++) {
                str.append("*");
            }
            str.append("\n");
        }
        return str.toString();
    }

    static String starPattern2(int num){
        StringBuilder str = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i ; j++) {
                 str.append("*");
            }
            str.append("\n");
        }
        return str.toString();
    }

    static String starPattern3(int num){
        StringBuilder str = new StringBuilder();
        for(int i = num; i>0; i--){
            for (int j = 1; j <= i ; j++) {
                str.append("*");
            }
            str.append("\n");
        }
        return str.toString();
    }

    static String numberPattern(int num){
        StringBuilder str = new StringBuilder();
        for (int i = 1; i <= num ; i++) {
            for (int j = 1; j <= i ; j++) {
                str.append(j + " ");
            }
            str.append("\n");
        }
        return str.toString();
    }

    static String starPattern4(int num) {
        StringBuilder str = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                str.append("*");
            }
            str.append("\n");
        }
        for(int i = num-1; i>0; i--){
            for (int j = 1; j <= i; j++) {
                str.append("*");
            }
            str.append("\n");
        }

        return str.toString();
    }

    //Let's do the same using one outer and one inner loop

}
