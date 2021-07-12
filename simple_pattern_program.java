
import java.util.Scanner;
public class simple_pattern_program {


        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("How many lines you want to print ");
            int n = s.nextInt();
            for(int a = 0; a<n; a++){
                for(int b = 0; b<=a; b++){
                    System.out.print(" *" + " ");


                }

                System.out.println();
            }


        }
    }


