import java.util.Scanner;
class factorialadd
{
    static Scanner s= new Scanner(System.in);
    public static void main(String [] args )
    {
        System.out.print("Enter a number :");
        int n = s.nextInt();
        System.out.println("The given input is : "+n);
        int r = 0;
        int mul=1;
        int a=0;

        while(n>0)
        {
            a=n%10;

            for(int i =1; i<=a; i++)
            {
                mul *= i;
            }
            
            r += mul;
            mul = 1;
            n /= 10;
        }
        System.out.println("The total factorial of given number is :"+r);
    }   
}
