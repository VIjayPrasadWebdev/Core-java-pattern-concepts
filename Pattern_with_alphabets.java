public class Pattern_with_alphabets {
    public static void main(String []x)
    {
        char letter ='A';
        for(int i=1; i<=6; i++)
        {

            for(int j=1; j<=i; j++)
            {
                System.out.print(letter + " ");
                letter++;
            }

            System.out.println();

        }
    }
}
