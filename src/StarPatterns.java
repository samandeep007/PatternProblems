import java.util.Scanner;

public class StarPatterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.println(starPattern(num));
        System.out.println(starPattern2(num));

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

    
}
