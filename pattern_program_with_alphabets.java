
import java.util.Scanner;
public class pattern_program_with_alphabets {
    public static void main(String[] args) {
        char  character = 'A';
        Scanner x = new Scanner(System.in);

        System.out.println("How many lines you want to print");
        int n = x.nextInt();

        for(int a = 1; a<=n; a++){

            for(int b = 1; b<=a; b++){

                System.out.print(character);
                character++;


            }

            System.out.println();
        }


    }
}




