import java.util.Scanner;
class UserInterface 
{
	static Mobile mobile1=new Mobile("Mi","Black","128gb",23000);
	static boolean b=true;
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
	    do
	    {
			System.out.println("\t\t\t\"Welcome to Sangeetha Store\"\n");
			System.out.println("Select The Input\n***********");
			System.out.println("1.Add Sim\n2.Remove Sim\n3.Is Sim Is Present\n4.Details Of Mobile\n5.Details of Sim\n6.Exit\n********");
			int input=s.nextInt();//
			switch (input)
			{
				case 1:{
							//Add Sim
							System.out.println("Please Select The Sim\n");
							System.out.println("1.Sim1\n2.Sim2 ");
							int sim_choice=s.nextInt();//1
							switch (sim_choice)
							{
							case 1:{//Adding sim 1
										mobile1.addSim1(new Sim("Jio","4g",1.5,7019661452l));
								break;}
							case 2:{//Add Sim2
										mobile1.addSim2(new Sim("Airtel","4g",2.0,9876543210l));
								break;}	
							
							}
				break;}

				case 2:{
					//Remove Sim
					
							//Remove Sim
							System.out.println("Please Select The Sim\n");
							System.out.println("1.Sim1\n2.Sim2 ");
							int sim_choice=s.nextInt();//1
							switch (sim_choice)
							{
							case 1:{//Remove sim 1
										mobile1.removeSim1();
								break;}
							case 2:{//Remove Sim2
										mobile1.removeSim2();
								break;}	
							
							}
					break;}

				case 3:{
					
							//Is Sim Present Or Not
							System.out.println("Please Select The Sim\n");
							System.out.println("1.Sim1\n2.Sim2 ");
							int sim_choice=s.nextInt();//1
							switch (sim_choice)
							{
							case 1:{//Is  sim 1 Present
										if(mobile1.isSim1Present())
											System.out.println("Sim 1 is Present");
										else
											System.out.println("Sim 1 is Not Present");
								break;}
							case 2:{//Is Sim 2 Present
										if(mobile1.isSim2Present())
											System.out.println("Sim 2 is Present");
										else
											System.out.println("Sim 2 is Not Present");
								break;}	
							
							}
					break;}
				case 4:{
					//details of Mobile
					mobile1.detailsOfMobile();
					break;}
				case 5:{
					//details of Sim
					System.out.println("Select the Sim\n");
					System.out.println("1.Sim1 \n2.Sim2\n");
					int sim_choice=s.nextInt();
					switch (sim_choice)
					{
					case 1:{
							if(mobile1.isSim1Present())
							{
								mobile1.slot1.detailsOfSim();
							}
							else
								System.out.println("Slot 1 Does not Have Sim");
						break;}
					case 2:{
							if(mobile1.isSim2Present())
							{
								mobile1.slot2.detailsOfSim();
							}
							else
								System.out.println("Slot 2 Does not Have Sim");
						
					break;}

					
					}
				break;}
				case 6:{
					b=false;
					System.out.println("*********Thank You*******");
				break;}
			
			}
	    }
	    while (b);
	}
}
