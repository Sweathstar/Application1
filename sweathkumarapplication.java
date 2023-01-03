import java.util.Scanner;
public class sweathkumarapplication {
	static boolean loop = true;
	static Scanner a=new Scanner(System.in);
	public static void main(String[] args)throws Exception {
		do{
			loop=true;
		System.out.println("\t\t\"Welcome to application\"");
		System.out.println("\n Here's out list of Features\n");
		System.out.println("\n1.Part 1.\n2.Part 2.\n3.About Us.\n4.Exit.\n");
		System.out.println("\nSelect An Feature:\n");
		int num1=a.nextInt();
		switch(num1) {
		case 1:{
			do{
				loop=true;
			System.out.println("\n\t\t\tPart-1");
			System.out.println("\n1.Swiggy features.\n2.Programming.\n3.Exit.");
			System.out.print("\nEnter Your Input : ");
			int num2=a.nextInt();
			switch(num2) {
			case 1:{
				swiggy.main(args);
				break;
			}
			case 2:{
					do{
						loop=true;
				System.out.println("\n1.Number Programming.\n2.Exit");
				int num3=a.nextInt();
				switch(num3) {
					case 1:{
						do{
							loop=true;
						System.out.println("\n1.Prime Number\n2.Fibonacci Series.\n3.Factorial Add.\n4.Exit");
						int num4=a.nextInt();
						switch(num4) {
						case 1:{
							primeornot.main(args);
							break;
						}
						case 2:{
							Fibonacci.main(args);
							break;
						}
						case 3:{
							factorialadd.main(args);
							break;
						}
						case 4:{
		            		loop=false;
			            	break;
			            }
						default:{ 
							System.out.println("Invalid Input!");
							break;
						}
						}
						}while(loop);
						loop=true;
						break;
					}
				}
			}while(loop);
			loop=true;
			}
			case 3:{
				loop=false;
				break;
			}
			default:{ 
				System.out.println("Invalid Input!");
				break;
			}
			}
		}while(loop);
		loop=true;
		break;
		}
		case 2:{
			do{
			loop=true;
			System.out.println("\n\t\t\tPart-2");
			System.out.println("\n1.Insert & Read Sim.\n2.Ball & Bag\n3.Exit");
			System.out.print("\nEnter Your Input : ");
			int num5=a.nextInt();
			switch(num5) {
			case 1:{
				UserInterface.main(args);
				break;
			}
			case 2:{
				UserInterfaceBall.main(args);
				break;
			}
			case 3:{
				loop=false;
				break;
			}
			default:{ 
				System.out.println("Invalid Input!");
				break;
			}
			}
			}while(loop);
			loop=true;
			break;
		}
		case 3:{
			do{
					loop=true;
			System.out.println("\n\t\t\tAbout Us");
			System.out.println("\n1.Qspiders.\n2.About Creator.\n3.Exit.");
			System.out.print("\nEnter Your Input : ");
			int num6=a.nextInt();
			switch(num6) {
			case 1:{
				do{
						loop=true;
				System.out.println("\n\t\t\tQSPIDERS");
				System.out.println("\n1.Java.\n2.Development.\n3.Database.\n4.Exit.");
				int num7=a.nextInt();
				switch(num7){
					case 1:{
						System.out.print("\n\t\t\tJava - Syed Tabrez\n");
						System.out.println("\nMy Java instructor, Sir Syed Tabrez, is an outstanding teacher and mentor. \nHis vast knowledge and expertise in the field of Java programming make him an ideal instructor. \nHis enthusiasm and passion for Java programming is evident in every lesson he teaches. He is patient and takes the time \nto ensure that each student understands the concepts. He is also a great listener and provides \nhelpful advice and feedback. He has an excellent ability to explain complex concepts in a simple and straightforward \nmanner that is easily understandable by all. He is an invaluable resource for all of his students, and I have learned a great deal from him.");
						break;
					}
					case 2:{
						System.out.print("\n\t\t\tDevelopment - Sathiyavani\n");
						System.out.println("\nMy web technology mam Sathiyavani is an amazing teacher and mentor. \nShe has been teaching web technologies and she has a wealth of knowledge and experience in the field. \nShe is always up to date on the latest trends and is able to explain concepts in a way that is easy to understand. \nShe is passionate about web technologies and is committed to helping her students become successful. \nShe is always patient and willing to answer any questions her students have. Her enthusiasm and inspiring \nattitude make her classes enjoyable and informative. I am so grateful to have had the opportunity to learn from such an incredible teacher.");
						break;
					}
					case 3:{
						System.out.print("\n\t\t\tDatabase - Bharath\n");
						System.out.println("\nBharath sir is a great trainer for databases. He is very knowledgeable and \nexperienced in the field. He is very patient and understanding when it comes to teaching and is always \nwilling to answer any questions that students have. He puts a lot of effort into teaching and making sure that \neveryone understands the material. Bharath sir also has a great sense of humour which makes the learning \nexperience more enjoyable. He is an amazing trainer and I highly recommend him to anyone who needs database help.");
						break;
					}
					case 4:{
						loop=false;
						break;
					}
					default:{ 
						System.out.println("Invalid Input!");
						break;
					}
				}
				}while(loop);
				loop=true;
				break;
			}
			case 2:{
				System.out.print("\n\t\t\tAbout Creator");
				System.out.print("\nName: Sweathkumar.\n\nBiography: Sweathkumar is a 20 year old from Chennai. He studied B.Sc Computer Science.\nIn addition to his job, he enjoys spending time Surfing Through the Internet. \nHe is passionate about Coding, and loves to do coding and Web page desining.\n\nEducation: B.Sc Computer Science.\n\nExperience: 0Yrs. \n\nContact Information: isbn380@gmail.com.");
				break;
			}
			case 3:{
				loop=false;
				break;
			}
			default:{ 
				System.out.println("Invalid Input!");
				break;
			}
			}
			}while(loop);
			loop=true;
			break;
		}
		case 4:{
			loop=false;
			break;
		}
		default:{ 
			System.out.println("Invalid Input!");
			loop=true;
		}
		}
		}while(loop);
		
	}

}

