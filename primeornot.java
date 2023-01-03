import java.util.Scanner;
class primeornot 
{
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.print("Enter a Low range value (minimum '2'): " );
        int start = s.nextInt();
        System.out.print("Enter a High range value : " );
        int end = s.nextInt();        
        int count =0;
        for(int i = start; i<=end; i++)
        {
            count=0;
            for(int j=1; j<=start; j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
               System.out.println("prime no:"+i);
            }
        }
    }
}