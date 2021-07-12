public class Reflect_mirror_pyramid_pattern {
    public static void main(String []ar)
    {
        for(int i=10; i>=1; i--)
        {
            for(int j=10-i; j>0; j--)

                System.out.print(" ");

            for(int k=i; k>0; k-- )

                System.out.print("*" + " ");

            System.out.println();
        }
        for(int l=1; l<=10; l++)
        {
            for(int m=10-l; m>0; m--)
                System.out.print(" ");
            for(int n=1; n<=l; n++)
                System.out.print("*" + " ");
            System.out.println();
        }
    }
}
