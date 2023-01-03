import java.util.*;
class otpformat
{
	static Scanner d=new Scanner(System.in);
	public static void main(String [ ]args)throws Exception
	{
		double o=Math.random()*9999+9999;
		int otp=(int)o;
		System.out.println("\nYour otp is "+otp);
		System.out.print("Enter your otp : ");
		int otp1 = d.nextInt();
		System.out.println("\nOtp verification sucessfull!");
	}
}