import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
class swiggy
{
    static Scanner s= new Scanner(System.in);
    public static void main(String [] args) throws Exception
    {
        System.out.println("\n            SWIGGY\n      (Order food online)\n");
        System.out.println("Here's our list of famous Hotels nearby :\n");
        System.out.println("1.SS Hydrabad\n2.Hotel Devi\n3.Biriyani Brothers\n4.Thalapakattu.\n5.Royal Biriyani\n6.Behrouz Biriyani\n7.Salem RR Biriyani");
        System.out.print("\nChoose Your Faviroute Hotel :");
        int hotel=s.nextInt();

        switch(hotel)
        {
            case 1:
            {
			System.out.println("1.SS Hydrabad\n");                                                                                                      //hotel 1
			
            System.out.println("\nThanks for choosing our Hotel.\n");
            System.out.println("Please choose your food from below menu\n");
            System.out.println("1.Prawn Biriyani\n2.Chicken Biriyani\n3.Mutton Biriyani\n4.Egg rice\n5.Chicken rice\n");
            System.out.print("Select Your Food :");
            int dish=s.nextInt();
            
            switch(dish)
            {
                case 1:
                {
                    System.out.println("\n1.Prawn Biriyani \n");                                                                                         //d1

                    double price =90;
                    System.out.print("Enter the Quantity : ");
                    int qty=s.nextInt();
                    double bill = qty*price;
                    System.out.println("\nYour Bill is : "+bill+" Including G.S.T." );
                    System.out.println("\nConfirm your order by pressing 1 : \n");
                    int cfrm=s.nextInt();
                    
                    if(cfrm==1)
                    {
                    System.out.println("\nChoose your Payment Mode:\n");
                    System.out.println("1.Credit/Debit card\n2.Upi\n3.Internet Banking\n4.Cash on delivery\n");
                    int pay=s.nextInt();
                    System.out.println("Redirecting to payment page..... please wait...!");
                    Thread.sleep(3000);
                    switch(pay)
                    {
                        case 1:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 3:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 4:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        default:
                        {
                            System.out.println("\nPlease choose a valid input!");
							break;
                        }
                    }
                    }
                    else
                    {
                        System.out.println("Your Cart is being Discarded!");
                    }
                }  
				
                case 2:
                {
                    System.out.println("\n2.Chicken Biriyani \n");                                                                                                             //d2

                    double price =100;
                    System.out.print("Enter the Quantity : ");
                    int qty=s.nextInt();
                    double bill = qty*price;
                    System.out.println("\nYour Bill is : "+bill+" Including G.S.T." );
                    System.out.println("\nConfirm your order by pressing 1 : \n");
                    int cfrm=s.nextInt();
                    
                    if(cfrm==1)
                    {
                    System.out.println("\nChoose your Payment Mode:\n");
                    System.out.println("1.Credit/Debit card\n2.Upi\n3.Internet Banking\n4.Cash on delivery\n");
                    int pay=s.nextInt();
                    System.out.println("Redirecting to payment page..... please wait...!");
                    Thread.sleep(3000);
                    switch(pay)
                    {
                        case 1:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 3:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 4:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        default:
                        {
                            System.out.println("\nPlease choose a valid input!");
							break;
                        }
                    }
					}
                    else 
                    {
                        System.out.println("Your Cart is being Discarded!");
                    }
					break;
                }
				
                case 3:
                {
                    System.out.println("\n3.Mutton Biriyani \n");                                                                                 //d3

                    double price =200;
                    System.out.print("Enter the Quantity : ");
                    int qty=s.nextInt();
                    double bill = qty*price;
                    System.out.println("\nYour Bill is : "+bill+" Including G.S.T." );
                    System.out.println("\nConfirm your order by pressing 1 : \n");
                    int cfrm=s.nextInt();
                    
                    if(cfrm==1)
                    {
                    System.out.println("\nChoose your Payment Mode:\n");
                    System.out.println("1.Credit/Debit card\n2.Upi\n3.Internet Banking\n4.Cash on delivery\n");
                    int pay=s.nextInt();
                    System.out.println("Redirecting to payment page..... please wait...!");
                    Thread.sleep(3000);
                    switch(pay)
                    {
                        case 1:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 3:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 4:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        default:
                        {
                            System.out.println("\nPlease choose a valid input!");
							break;
                        }
                    }
					}
                    else 
                    {
                        System.out.println("Your Cart is being Discarded!");
                    }
					break;
                }
				
                case 4:
                {
                    System.out.println("\n4.Egg rice \n");                                                                                                   //d4

                    double price =70;
                    System.out.print("Enter the Quantity : ");
                    int qty=s.nextInt();
                    double bill = qty*price;
                    System.out.println("\nYour Bill is : "+bill+" Including G.S.T." );
                    System.out.println("\nConfirm your order by pressing 1 : \n");
                    int cfrm=s.nextInt();
                    
                    if(cfrm==1)
                    {
                    System.out.println("\nChoose your Payment Mode:\n");
                    System.out.println("1.Credit/Debit card\n2.Upi\n3.Internet Banking\n4.Cash on delivery\n");
                    int pay=s.nextInt();
                    System.out.println("Redirecting to payment page..... please wait...!");
                    Thread.sleep(3000);
                    switch(pay)
                    {
                        case 1:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 3:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 4:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        default:
                        {
                            System.out.println("\nPlease choose a valid input!");
							break;
                        }
                    }
                    }
                    else 
                    {
                        System.out.println("Your Cart is being Discarded!");
                    }
					break;
                }
				
                case 5:
                {
                    System.out.println("\n5..Chicken rice \n");                                                                                //d5

                    double price =90;
                    System.out.print("Enter the Quantity : ");
                    int qty=s.nextInt();
                    double bill = qty*price;
                    System.out.println("\nYour Bill is : "+bill+" Including G.S.T." );
                    System.out.println("\nConfirm your order by pressing 1 : \n");
                    int cfrm=s.nextInt();
                    
                    if(cfrm==1)
                    {
                    System.out.println("\nChoose your Payment Mode:\n");
                    System.out.println("1.Credit/Debit card\n2.Upi\n3.Internet Banking\n4.Cash on delivery\n");
                    int pay=s.nextInt();
                    System.out.println("Redirecting to payment page..... please wait...!");
                    Thread.sleep(3000);
                    switch(pay)
                    {
                        case 1:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 3:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 4:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        default:
                        {
                            System.out.println("\nPlease choose a valid input!");
							break;
                        }
                    }
					}
                    else 
                    {
                        System.out.println("Your Cart is being Discarded!");
                    }
					break;
				}
			}
			break;
			}
			
			case 2:
            {
			System.out.println("2.Hotel Devi");                                                                                                                     //hotel 2
	
            System.out.println("\nThanks for choosing our Hotel.\n");
            System.out.println("Please choose your food from below menu\n");
            System.out.println("1.Chicken Dum Biriyani\n2.Fish Biriyani\n3.Mutton Biriyani\n4.Egg Noodles\n5.Chicken rice\n");
            System.out.print("Select Your Food :");
            int dish=s.nextInt();
            
            switch(dish)
            {
                case 1:
                {
                    System.out.println("\n1.Chicken Dum Biriyani\n");                                                                                                  //d1 

                    double price =120;
                    System.out.print("Enter the Quantity : ");
                    int qty=s.nextInt();
                    double bill = qty*price;
                    System.out.println("\nYour Bill is : "+bill+" Including G.S.T." );
                    System.out.println("\nConfirm your order by pressing 1 : \n");
                    int cfrm=s.nextInt();
                    
                    if(cfrm==1)
                    {
                    System.out.println("\nChoose your Payment Mode:\n");
                    System.out.println("1.Credit/Debit card\n2.Upi\n3.Internet Banking\n4.Cash on delivery\n");
                    int pay=s.nextInt();
                    System.out.println("Redirecting to payment page..... please wait...!");
                    Thread.sleep(3000);
                    switch(pay)
                    {
                        case 1:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 3:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 4:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        default:
                        {
                            System.out.println("\nPlease choose a valid input!");
							break;
                        }
                    }
                    }
                    else
                    {
                        System.out.println("Your Cart is being Discarded!");
                    }
					break;
                } 
				
                case 2:
                {
                    System.out.println("\n2.Fish Biriyani \n");                                                                                                         //d2

                    double price =130;
                    System.out.print("Enter the Quantity : ");
                    int qty=s.nextInt();
                    double bill = qty*price;
                    System.out.println("\nYour Bill is : "+bill+" Including G.S.T." );
                    System.out.println("\nConfirm your order by pressing 1 : \n");
                    int cfrm=s.nextInt();
                    
                    if(cfrm==1)
                    {
                    System.out.println("\nChoose your Payment Mode:\n");
                    System.out.println("1.Credit/Debit card\n2.Upi\n3.Internet Banking\n4.Cash on delivery\n");
                    int pay=s.nextInt();
                    System.out.println("Redirecting to payment page..... please wait...!");
                    Thread.sleep(3000);
                    switch(pay)
                    {
                        case 1:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 3:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 4:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        default:
                        {
                            System.out.println("\nPlease choose a valid input!");
							break;
                        }
                    }
					}
                    else 
                    {
                        System.out.println("Your Cart is being Discarded!");
                    }
                    break;
                }
				
                case 3:
                {
                    System.out.println("\n3.Mutton Biriyani \n");                                                                                                             //d3

                    double price =210;
                    System.out.print("Enter the Quantity : ");
                    int qty=s.nextInt();
                    double bill = qty*price;
                    System.out.println("\nYour Bill is : "+bill+" Including G.S.T." );
                    System.out.println("\nConfirm your order by pressing 1 : \n");
                    int cfrm=s.nextInt();
                    
                    if(cfrm==1)
                    {
                    System.out.println("\nChoose your Payment Mode:\n");
                    System.out.println("1.Credit/Debit card\n2.Upi\n3.Internet Banking\n4.Cash on delivery\n");
                    int pay=s.nextInt();
                    System.out.println("Redirecting to payment page..... please wait...!");
                    Thread.sleep(3000);
                    switch(pay)
                    {
                        case 1:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 3:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 4:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        default:
                        {
                            System.out.println("\nPlease choose a valid input!");
							break;
                        }
                    }
					}
                    else 
                    {
                        System.out.println("Your Cart is being Discarded!");
                    }
					break;
                }
				
                case 4:
                {
                    System.out.println("\n4.Egg Noodles\n");                                                                                                              //d4

                    double price =120;
                    System.out.print("Enter the Quantity : ");
                    int qty=s.nextInt();
                    double bill = qty*price;
                    System.out.println("\nYour Bill is : "+bill+" Including G.S.T." );
                    System.out.println("\nConfirm your order by pressing 1 : \n");
                    int cfrm=s.nextInt();
                    
                    if(cfrm==1)
                    {
                    System.out.println("\nChoose your Payment Mode:\n");
                    System.out.println("1.Credit/Debit card\n2.Upi\n3.Internet Banking\n4.Cash on delivery\n");
                    int pay=s.nextInt();
                    System.out.println("Redirecting to payment page..... please wait...!");
                    Thread.sleep(3000);
                    switch(pay)
                    {
                        case 1:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 3:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 4:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        default:
                        {
                            System.out.println("\nPlease choose a valid input!");
							break;
                        }
                    }
                    }
                    else 
                    {
                        System.out.println("Your Cart is being Discarded!");
                    }
					break;
                }
				
                case 5:
                {
                    System.out.println("\n5..Chicken rice \n");                                                                                                      //d5

                    double price =110;
                    System.out.print("Enter the Quantity : ");
                    int qty=s.nextInt();
                    double bill = qty*price;
                    System.out.println("\nYour Bill is : "+bill+" Including G.S.T." );
                    System.out.println("\nConfirm your order by pressing 1 : \n");
                    int cfrm=s.nextInt();
                    
                    if(cfrm==1)
                    {
                    System.out.println("\nChoose your Payment Mode:\n");
                    System.out.println("1.Credit/Debit card\n2.Upi\n3.Internet Banking\n4.Cash on delivery\n");
                    int pay=s.nextInt();
                    System.out.println("Redirecting to payment page..... please wait...!");
                    Thread.sleep(3000);
                    switch(pay)
                    {
                        case 1:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 3:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 4:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        default:
                        {
                            System.out.println("\nPlease choose a valid input!");
							break;
                        }
                    }
					}
                    else 
                    {
                        System.out.println("Your Cart is being Discarded!");
                    }
					break;
				}
			}
			break;
			}
			
			case 3:
            {
			System.out.println("3.Biriyani Brothers");                                                                                                                       //hotel 3
            System.out.println("\nThanks for choosing our Hotel.\n");
            System.out.println("Please choose your food from below menu\n");
            System.out.println("1.Chicken Biriyani\n2.Mutton Biriyani\n3.Veg Biriyani\n4.Parotta\n5.Mashroom Biriyani\n");
            System.out.print("Select Your Food :");
            int dish=s.nextInt();
            
            switch(dish)
            {
                case 1:
                {
                    System.out.println("\n1.Chicken Biriyani \n");                                                                                                        //d1

                    double price =120;
                    System.out.print("Enter the Quantity : ");
                    int qty=s.nextInt();
                    double bill = qty*price;
                    System.out.println("\nYour Bill is : "+bill+" Including G.S.T." );
                    System.out.println("\nConfirm your order by pressing 1 : \n");
                    int cfrm=s.nextInt();
                    
                    if(cfrm==1)
                    {
                    System.out.println("\nChoose your Payment Mode:\n");
                    System.out.println("1.Credit/Debit card\n2.Upi\n3.Internet Banking\n4.Cash on delivery\n");
                    int pay=s.nextInt();
                    System.out.println("Redirecting to payment page..... please wait...!");
                    Thread.sleep(3000);
                    switch(pay)
                    {
                        case 1:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 3:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 4:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        default:
                        {
                            System.out.println("\nPlease choose a valid input!");
							break;
                        }
                    }
                    }
                    else
                    {
                        System.out.println("Your Cart is being Discarded!");
                    }
					break;
                }  
				
                case 2:
                {
                    System.out.println("\n2.Mutton Biriyani \n");                                                                                                                  //d2

                    double price =260;
                    System.out.print("Enter the Quantity : ");
                    int qty=s.nextInt();
                    double bill = qty*price;
                    System.out.println("\nYour Bill is : "+bill+" Including G.S.T." );
                    System.out.println("\nConfirm your order by pressing 1 : \n");
                    int cfrm=s.nextInt();
                    
                    if(cfrm==1)
                    {
                    System.out.println("\nChoose your Payment Mode:\n");
                    System.out.println("1.Credit/Debit card\n2.Upi\n3.Internet Banking\n4.Cash on delivery\n");
                    int pay=s.nextInt();
                    System.out.println("Redirecting to payment page..... please wait...!");
                    Thread.sleep(3000);
                    switch(pay)
                    {
                        case 1:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 3:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 4:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        default:
                        {
                            System.out.println("\nPlease choose a valid input!");
							break;
                        }
                    }
					}
                    else 
                    {
                        System.out.println("Your Cart is being Discarded!");
                    }
                    break;
                }
				
                case 3:
                {
                    System.out.println("\n3.Veg Biriyani \n");                                                                                                                            //d3

                    double price =110;
                    System.out.print("Enter the Quantity : ");
                    int qty=s.nextInt();
                    double bill = qty*price;
                    System.out.println("\nYour Bill is : "+bill+" Including G.S.T." );
                    System.out.println("\nConfirm your order by pressing 1 : \n");
                    int cfrm=s.nextInt();
                    
                    if(cfrm==1)
                    {
                    System.out.println("\nChoose your Payment Mode:\n");
                    System.out.println("1.Credit/Debit card\n2.Upi\n3.Internet Banking\n4.Cash on delivery\n");
                    int pay=s.nextInt();
                    System.out.println("Redirecting to payment page..... please wait...!");
                    Thread.sleep(3000);
                    switch(pay)
                    {
                        case 1:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 3:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 4:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        default:
                        {
                            System.out.println("\nPlease choose a valid input!");
							break;
                        }
                    }
					}
                    else 
                    {
                        System.out.println("Your Cart is being Discarded!");
                    }
					break;
                }
				
                case 4:
                {
                    System.out.println("\n4.Parotta \n");                                                                                                                        //d4 

                    double price =50;
                    System.out.print("Enter the Quantity : ");
                    int qty=s.nextInt();
                    double bill = qty*price;
                    System.out.println("\nYour Bill is : "+bill+" Including G.S.T." );
                    System.out.println("\nConfirm your order by pressing 1 : \n");
                    int cfrm=s.nextInt();
                    
                    if(cfrm==1)
                    {
                    System.out.println("\nChoose your Payment Mode:\n");
                    System.out.println("1.Credit/Debit card\n2.Upi\n3.Internet Banking\n4.Cash on delivery\n");
                    int pay=s.nextInt();
                    System.out.println("Redirecting to payment page..... please wait...!");
                    Thread.sleep(3000);
                    switch(pay)
                    {
                        case 1:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 3:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 4:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        default:
                        {
                            System.out.println("\nPlease choose a valid input!");
							break;
                        }
                    }
                    }
                    else 
                    {
                        System.out.println("Your Cart is being Discarded!");
                    }
					break;
                }
				
                case 5:
                {
                    System.out.println("\n5.Mashroom Biriyani\n");                                                                                                                                 //d5

                    double price =100;
                    System.out.print("Enter the Quantity : ");
                    int qty=s.nextInt();
                    double bill = qty*price;
                    System.out.println("\nYour Bill is : "+bill+" Including G.S.T." );
                    System.out.println("\nConfirm your order by pressing 1 : \n");
                    int cfrm=s.nextInt();
                    
                    if(cfrm==1)
                    {
                    System.out.println("\nChoose your Payment Mode:\n");
                    System.out.println("1.Credit/Debit card\n2.Upi\n3.Internet Banking\n4.Cash on delivery\n");
                    int pay=s.nextInt();
                    System.out.println("Redirecting to payment page..... please wait...!");
                    Thread.sleep(3000);
                    switch(pay)
                    {
                        case 1:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 3:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 4:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        default:
                        {
                            System.out.println("\nPlease choose a valid input!");
							break;
                        }
                    }
					}
                    else 
                    {
                        System.out.println("Your Cart is being Discarded!");
                    }
					break;
				}
			}
			break;
			}
			
			case 4:
            {
			System.out.println("4.Thalapakattu");                                                                                                                   //Hotel 4
				
            System.out.println("\nThanks for choosing our Hotel.\n");
            System.out.println("Please choose your food from below menu\n");
            System.out.println("1.Thalapakattu Biriyani\n2.Chettinadu Biriyani\n3.Paneer Butter Masala\n4.Naan\n5.Kothu Parotta\n");
            System.out.print("Select Your Food :");
            int dish=s.nextInt();
            
            switch(dish)
            {
                case 1:
                {
                    System.out.println("\n1.Thalapakattu Biriyani\n");                                                                                                                                  //d1

                    double price =290;
                    System.out.print("Enter the Quantity : ");
                    int qty=s.nextInt();
                    double bill = qty*price;
                    System.out.println("\nYour Bill is : "+bill+" Including G.S.T." );
                    System.out.println("\nConfirm your order by pressing 1 : \n");
                    int cfrm=s.nextInt();
                    
                    if(cfrm==1)
                    {
                    System.out.println("\nChoose your Payment Mode:\n");
                    System.out.println("1.Credit/Debit card\n2.Upi\n3.Internet Banking\n4.Cash on delivery\n");
                    int pay=s.nextInt();
                    System.out.println("Redirecting to payment page..... please wait...!");
                    Thread.sleep(3000);
                    switch(pay)
                    {
                        case 1:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 3:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 4:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        default:
                        {
                            System.out.println("\nPlease choose a valid input!");
							break;
                        }
                    }
                    }
                    else
                    {
                        System.out.println("Your Cart is being Discarded!");
                    }
					break;
                }  
				
                case 2:
                {
                    System.out.println("\n2.Chettinadu Biriyani \n");                                                                                                                       //d2

                    double price =195;
                    System.out.print("Enter the Quantity : ");
                    int qty=s.nextInt();
                    double bill = qty*price;
                    System.out.println("\nYour Bill is : "+bill+" Including G.S.T." );
                    System.out.println("\nConfirm your order by pressing 1 : \n");
                    int cfrm=s.nextInt();
                    
                    if(cfrm==1)
                    {
                    System.out.println("\nChoose your Payment Mode:\n");
                    System.out.println("1.Credit/Debit card\n2.Upi\n3.Internet Banking\n4.Cash on delivery\n");
                    int pay=s.nextInt();
                    System.out.println("Redirecting to payment page..... please wait...!");
                    Thread.sleep(3000);
                    switch(pay)
                    {
                        case 1:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 3:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 4:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        default:
                        {
                            System.out.println("\nPlease choose a valid input!");
							break;
                        }
                    }
					}
                    else 
                    {
                        System.out.println("Your Cart is being Discarded!");
                    }
                    break;
                }
				
                case 3:
                {
                    System.out.println("\n3.Paneer Butter Masala\n");                                                                                                                                   //d3

                    double price =160;
                    System.out.print("Enter the Quantity : ");
                    int qty=s.nextInt();
                    double bill = qty*price;
                    System.out.println("\nYour Bill is : "+bill+" Including G.S.T." );
                    System.out.println("\nConfirm your order by pressing 1 : \n");
                    int cfrm=s.nextInt();
                    
                    if(cfrm==1)
                    {
                    System.out.println("\nChoose your Payment Mode:\n");
                    System.out.println("1.Credit/Debit card\n2.Upi\n3.Internet Banking\n4.Cash on delivery\n");
                    int pay=s.nextInt();
                    System.out.println("Redirecting to payment page..... please wait...!");
                    Thread.sleep(3000);
                    switch(pay)
                    {
                        case 1:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 3:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 4:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        default:
                        {
                            System.out.println("\nPlease choose a valid input!");
							break;
                        }
                    }
					}
                    else 
                    {
                        System.out.println("Your Cart is being Discarded!");
                    }
					break;
                }
                case 4:
                {
                    System.out.println("\n4.Naan\n");                                                                                                                                                       //d4

                    double price =80;
                    System.out.print("Enter the Quantity : ");
                    int qty=s.nextInt();
                    double bill = qty*price;
                    System.out.println("\nYour Bill is : "+bill+" Including G.S.T." );
                    System.out.println("\nConfirm your order by pressing 1 : \n");
                    int cfrm=s.nextInt();
                    
                    if(cfrm==1)
                    {
                    System.out.println("\nChoose your Payment Mode:\n");
                    System.out.println("1.Credit/Debit card\n2.Upi\n3.Internet Banking\n4.Cash on delivery\n");
                    int pay=s.nextInt();
                    System.out.println("Redirecting to payment page..... please wait...!");
                    Thread.sleep(3000);
                    switch(pay)
                    {
                        case 1:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 3:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 4:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        default:
                        {
                            System.out.println("\nPlease choose a valid input!");
							break;
                        }
                    }
                    }
                    else 
                    {
                        System.out.println("Your Cart is being Discarded!");
                    }
					break;
                }
                case 5:
                {
                    System.out.println("\n5.Kothu Parotta\n");                                                                                                                                           //d5

                    double price =120;
                    System.out.print("Enter the Quantity : ");
                    int qty=s.nextInt();
                    double bill = qty*price;
                    System.out.println("\nYour Bill is : "+bill+" Including G.S.T." );
                    System.out.println("\nConfirm your order by pressing 1 : \n");
                    int cfrm=s.nextInt();
                    
                    if(cfrm==1)
                    {
                    System.out.println("\nChoose your Payment Mode:\n");
                    System.out.println("1.Credit/Debit card\n2.Upi\n3.Internet Banking\n4.Cash on delivery\n");
                    int pay=s.nextInt();
                    System.out.println("Redirecting to payment page..... please wait...!");
                    Thread.sleep(3000);
                    switch(pay)
                    {
                        case 1:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 3:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 4:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        default:
                        {
                            System.out.println("\nPlease choose a valid input!");
							break;
                        }
                    }
					}
                    else 
                    {
                        System.out.println("Your Cart is being Discarded!");
                    }
					break;
				}
			}break;
			}
			case 5:
            {
			System.out.println("5.Royal Biriyani");                                                                                                                                                 //hotel 5
			
            System.out.println("\nThanks for choosing our Hotel.\n");
            System.out.println("Please choose your food from below menu\n");
            System.out.println("1.Egg Biriyani\n2.Chicken Biriyani\n3.Mutton Biriyani\n4.Prawn Biriyani\n5.Fish Biriyani\n");
            System.out.print("Select Your Food :");
            int dish=s.nextInt();
            
            switch(dish)
            {
                case 1:
                {
                    System.out.println("\n1.Egg Biriyani \n");                                                                                                                                  //d1
                                
                    double price =140;
                    System.out.print("Enter the Quantity : ");
                    int qty=s.nextInt();
                    double bill = qty*price;
                    System.out.println("\nYour Bill is : "+bill+" Including G.S.T." );
                    System.out.println("\nConfirm your order by pressing 1 : \n");
                    int cfrm=s.nextInt();
                    
                    if(cfrm==1)
                    {
                    System.out.println("\nChoose your Payment Mode:\n");
                    System.out.println("1.Credit/Debit card\n2.Upi\n3.Internet Banking\n4.Cash on delivery\n");
                    int pay=s.nextInt();
                    System.out.println("Redirecting to payment page..... please wait...!");
                    Thread.sleep(3000);
                    switch(pay)
                    {
                        case 1:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 3:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 4:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        default:
                        {
                            System.out.println("\nPlease choose a valid input!");
							break;
                        }
                    }
                    }
                    else
                    {
                        System.out.println("Your Cart is being Discarded!");
                    }
					break;
                }  
                case 2:
                {
                    System.out.println("\n2.Chicken Biriyani \n");                                                                                                               //d2
          
                    double price =180;
                    System.out.print("Enter the Quantity : ");
                    int qty=s.nextInt();
                    double bill = qty*price;
                    System.out.println("\nYour Bill is : "+bill+" Including G.S.T." );
                    System.out.println("\nConfirm your order by pressing 1 : \n");
                    int cfrm=s.nextInt();
                    
                    if(cfrm==1)
                    {
                    System.out.println("\nChoose your Payment Mode:\n");
                    System.out.println("1.Credit/Debit card\n2.Upi\n3.Internet Banking\n4.Cash on delivery\n");
                    int pay=s.nextInt();
                    System.out.println("Redirecting to payment page..... please wait...!");
                    Thread.sleep(3000);
                    switch(pay)
                    {
                        case 1:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 3:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 4:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        default:
                        {
                            System.out.println("\nPlease choose a valid input!");
							break;
                        }
                    }
					}
                    else 
                    {
                        System.out.println("Your Cart is being Discarded!");
                    }
                    break;
                }
                case 3:
                {
                    System.out.println("\n3.Mutton Biriyani \n");                                                                                                             //d3

                    double price =220;
                    System.out.print("Enter the Quantity : ");
                    int qty=s.nextInt();
                    double bill = qty*price;
                    System.out.println("\nYour Bill is : "+bill+" Including G.S.T." );
                    System.out.println("\nConfirm your order by pressing 1 : \n");
                    int cfrm=s.nextInt();
                    
                    if(cfrm==1)
                    {
                    System.out.println("\nChoose your Payment Mode:\n");
                    System.out.println("1.Credit/Debit card\n2.Upi\n3.Internet Banking\n4.Cash on delivery\n");
                    int pay=s.nextInt();
                    System.out.println("Redirecting to payment page..... please wait...!");
                    Thread.sleep(3000);
                    switch(pay)
                    {
                        case 1:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 3:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 4:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        default:
                        {
                            System.out.println("\nPlease choose a valid input!");
							break;
                        }
                    }
					}
                    else 
                    {
                        System.out.println("Your Cart is being Discarded!");
                    }
					break;
                }
                case 4:
                {
                    System.out.println("\n4.Prawn Biriyani\n");                                                                                                          //d4
 
                    double price =120;
                    System.out.print("Enter the Quantity : ");
                    int qty=s.nextInt();
                    double bill = qty*price;
                    System.out.println("\nYour Bill is : "+bill+" Including G.S.T." );
                    System.out.println("\nConfirm your order by pressing 1 : \n");
                    int cfrm=s.nextInt();
                    
                    if(cfrm==1)
                    {
                    System.out.println("\nChoose your Payment Mode:\n");
                    System.out.println("1.Credit/Debit card\n2.Upi\n3.Internet Banking\n4.Cash on delivery\n");
                    int pay=s.nextInt();
                    System.out.println("Redirecting to payment page..... please wait...!");
                    Thread.sleep(3000);
                    switch(pay)
                    {
                        case 1:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 3:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 4:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        default:
                        {
                            System.out.println("\nPlease choose a valid input!");
							break;
                        }
                    }
                    }
                    else 
                    {
                        System.out.println("Your Cart is being Discarded!");
                    }
					break;
                }
                case 5:
                {
                    System.out.println("\n5.Fish Biriyani\n");                                                                                                      //d5

                    double price =135;
                    System.out.print("Enter the Quantity : ");
                    int qty=s.nextInt();
                    double bill = qty*price;
                    System.out.println("\nYour Bill is : "+bill+" Including G.S.T." );
                    System.out.println("\nConfirm your order by pressing 1 : \n");
                    int cfrm=s.nextInt();
                    
                    if(cfrm==1)
                    {
                    System.out.println("\nChoose your Payment Mode:\n");
                    System.out.println("1.Credit/Debit card\n2.Upi\n3.Internet Banking\n4.Cash on delivery\n");
                    int pay=s.nextInt();
                    System.out.println("Redirecting to payment page..... please wait...!");
                    Thread.sleep(3000);
                    switch(pay)
                    {
                        case 1:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 3:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 4:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        default:
                        {
                            System.out.println("\nPlease choose a valid input!");
							break;
                        }
                    }
					}
                    else 
                    {
                        System.out.println("Your Cart is being Discarded!");
                    }
					break;
				}
			}
			break;
			}
			case 6:
            {
			System.out.println("6.Behrouz Biriyani");                                                                                                                                                     //hotel 6
			
            System.out.println("\nThanks for choosing our Hotel.\n");
            System.out.println("Please choose your food from below menu\n");
            System.out.println("1.Chicken Dum Biriyani\n2.Veg Biriyani\n3.Mutton Biriyani\n4.Crab Biriyani\n5.Chicken rice\n");
            System.out.print("Select Your Food :");
            int dish=s.nextInt();
            
            switch(dish)
            {
                case 1:
                {
                    System.out.println("\n1.Chicken Dum Biriyani \n");                                                                                                                      //d1

                    double price =110;
                    System.out.print("Enter the Quantity : ");
                    int qty=s.nextInt();
                    double bill = qty*price;
                    System.out.println("\nYour Bill is : "+bill+" Including G.S.T." );
                    System.out.println("\nConfirm your order by pressing 1 : \n");
                    int cfrm=s.nextInt();
                    
                    if(cfrm==1)
                    {
                    System.out.println("\nChoose your Payment Mode:\n");
                    System.out.println("1.Credit/Debit card\n2.Upi\n3.Internet Banking\n4.Cash on delivery\n");
                    int pay=s.nextInt();
                    System.out.println("Redirecting to payment page..... please wait...!");
                    Thread.sleep(3000);
                    switch(pay)
                    {
                        case 1:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);                           
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 3:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 4:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        default:
                        {
                            System.out.println("\nPlease choose a valid input!");
							break;
                        }
                    }
                    }
                    else
                    {
                        System.out.println("Your Cart is being Discarded!");
                    }
					break;
                }  
                case 2:
                {
                    System.out.println("\n2.Veg Biriyani \n");                                                                                                                 //d2

                    double price =70;
                    System.out.print("Enter the Quantity : ");
                    int qty=s.nextInt();
                    double bill = qty*price;
                    System.out.println("\nYour Bill is : "+bill+" Including G.S.T." );
                    System.out.println("\nConfirm your order by pressing 1 : \n");
                    int cfrm=s.nextInt();
                    
                    if(cfrm==1)
                    {
                    System.out.println("\nChoose your Payment Mode:\n");
                    System.out.println("1.Credit/Debit card\n2.Upi\n3.Internet Banking\n4.Cash on delivery\n");
                    int pay=s.nextInt();
                    System.out.println("Redirecting to payment page..... please wait...!");
                    Thread.sleep(3000);
                    switch(pay)
                    {
                        case 1:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 3:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 4:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        default:
                        {
                            System.out.println("\nPlease choose a valid input!");
							break;
                        }
                    }
					}
                    else 
                    {
                        System.out.println("Your Cart is being Discarded!");
                    }
                    break;
                }
                case 3:
                {
                    System.out.println("\n3.Mutton Biriyani \n");                                                                                                                     //d3

                    double price =250;
                    System.out.print("Enter the Quantity : ");
                    int qty=s.nextInt();
                    double bill = qty*price;
                    System.out.println("\nYour Bill is : "+bill+" Including G.S.T." );
                    System.out.println("\nConfirm your order by pressing 1 : \n");
                    int cfrm=s.nextInt();
                    
                    if(cfrm==1)
                    {
                    System.out.println("\nChoose your Payment Mode:\n");
                    System.out.println("1.Credit/Debit card\n2.Upi\n3.Internet Banking\n4.Cash on delivery\n");
                    int pay=s.nextInt();
                    System.out.println("Redirecting to payment page..... please wait...!");
                    Thread.sleep(3000);
                    switch(pay)
                    {
                        case 1:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 3:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 4:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        default:
                        {
                            System.out.println("\nPlease choose a valid input!");
							break;
                        }
                    }
					}
                    else 
                    {
                        System.out.println("Your Cart is being Discarded!");
                    }
					break;
                }
                case 4:
                {
                    System.out.println("\n4.Crab Biriyani\n");                                                                                                                       //d4

                    double price =145;
                    System.out.print("Enter the Quantity : ");
                    int qty=s.nextInt();
                    double bill = qty*price;
                    System.out.println("\nYour Bill is : "+bill+" Including G.S.T." );
                    System.out.println("\nConfirm your order by pressing 1 : \n");
                    int cfrm=s.nextInt();
                    
                    if(cfrm==1)
                    {
                    System.out.println("\nChoose your Payment Mode:\n");
                    System.out.println("1.Credit/Debit card\n2.Upi\n3.Internet Banking\n4.Cash on delivery\n");
                    int pay=s.nextInt();
                    System.out.println("Redirecting to payment page..... please wait...!");
                    Thread.sleep(3000);
                    switch(pay)
                    {
                        case 1:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 3:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 4:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        default:
                        {
                            System.out.println("\nPlease choose a valid input!");
							break;
                        }
                    }
                    }
                    else 
                    {
                        System.out.println("Your Cart is being Discarded!");
                    }
					break;
                }
                case 5:
                {
                    System.out.println("\n5.Chicken rice \n");                                                                                                                           //d5

                    double price =105;
                    System.out.print("Enter the Quantity : ");
                    int qty=s.nextInt();
                    double bill = qty*price;
                    System.out.println("\nYour Bill is : "+bill+" Including G.S.T." );
                    System.out.println("\nConfirm your order by pressing 1 : \n");
                    int cfrm=s.nextInt();
                    
                    if(cfrm==1)
                    {
                    System.out.println("\nChoose your Payment Mode:\n");
                    System.out.println("1.Credit/Debit card\n2.Upi\n3.Internet Banking\n4.Cash on delivery\n");
                    int pay=s.nextInt();
                    System.out.println("Redirecting to payment page..... please wait...!");
                    Thread.sleep(3000);
                    switch(pay)
                    {
                        case 1:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 3:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 4:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        default:
                        {
                            System.out.println("\nPlease choose a valid input!");
							break;
                        }
                    }
					}
                    else 
                    {
                        System.out.println("Your Cart is being Discarded!");
                    }
					break;
				}
			}
			break;
			}
			case 7:
            {
			System.out.println("7.Salem RR Biriyani");                                                                                                                                                     //hotel 7
			
            System.out.println("\nThanks for choosing our Hotel.\n");
            System.out.println("Please choose your food from below menu\n");
            System.out.println("1.Chicken Dum Biriyani\n2.Kaada Biriyani\n3.Nattu Kozhi Biriyani\n");
            System.out.print("Select Your Food :");
            int dish=s.nextInt();
            
            switch(dish)
            {
                case 1:
                {
                    System.out.println("\n1.Chicken Dum Biriyani \n");                                                                                                                      //d1

                    double price =130;
                    System.out.print("Enter the Quantity : ");
                    int qty=s.nextInt();
                    double bill = qty*price;
                    System.out.println("\nYour Bill is : "+bill+" Including G.S.T." );
                    System.out.println("\nConfirm your order by pressing 1 : \n");
                    int cfrm=s.nextInt();
                    
                    if(cfrm==1)
                    {
                    System.out.println("\nChoose your Payment Mode:\n");
                    System.out.println("1.Credit/Debit card\n2.Upi\n3.Internet Banking\n4.Cash on delivery\n");
                    int pay=s.nextInt();
                    System.out.println("Redirecting to payment page..... please wait...!");
                    Thread.sleep(3000);
                    switch(pay)
                    {
                        case 1:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 3:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 4:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        default:
                        {
                            System.out.println("\nPlease choose a valid input!");
							break;
                        }
                    }
                    }
                    else
                    {
                        System.out.println("Your Cart is being Discarded!");
                    }
					break;
                }  
                case 2:
                {
                    System.out.println("\n2.Kaada Biriyani \n");                                                                                                                 //d2

                    double price =230;
                    System.out.print("Enter the Quantity : ");
                    int qty=s.nextInt();
                    double bill = qty*price;
                    System.out.println("\nYour Bill is : "+bill+" Including G.S.T." );
                    System.out.println("\nConfirm your order by pressing 1 : \n");
                    int cfrm=s.nextInt();
                    
                    if(cfrm==1)
                    {
                    System.out.println("\nChoose your Payment Mode:\n");
                    System.out.println("1.Credit/Debit card\n2.Upi\n3.Internet Banking\n4.Cash on delivery\n");
                    int pay=s.nextInt();
                    System.out.println("Redirecting to payment page..... please wait...!");
                    Thread.sleep(3000);
                    switch(pay)
                    {
                        case 1:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 3:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 4:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        default:
                        {
                            System.out.println("\nPlease choose a valid input!");
							break;
                        }
                    }
					}
                    else 
                    {
                        System.out.println("Your Cart is being Discarded!");
                    }
                    break;
                }
                case 3:
                {
                    System.out.println("\n3.Nattu Kozhi Biriyani \n");                                                                                                                     //d3

                    double price =230;
                    System.out.print("Enter the Quantity : ");
                    int qty=s.nextInt();
                    double bill = qty*price;
                    System.out.println("\nYour Bill is : "+bill+" Including G.S.T." );
                    System.out.println("\nConfirm your order by pressing 1 : \n");
                    int cfrm=s.nextInt();
                    
                    if(cfrm==1)
                    {
                    System.out.println("\nChoose your Payment Mode:\n");
                    System.out.println("1.Credit/Debit card\n2.Upi\n3.Internet Banking\n4.Cash on delivery\n");
                    int pay=s.nextInt();
                    System.out.println("Redirecting to payment page..... please wait...!");
                    Thread.sleep(3000);
                    switch(pay)
                    {
                        case 1:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 3:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        case 4:
                        {
                            System.out.println("Enter otp to verify");
                            otpformat.main(args);
                            System.out.println("\nYour order has been placed sucessfully!");
                            break;
                        }
                        default:
                        {
                            System.out.println("\nPlease choose a valid input!");
							break;
                        }
                    }
					}
                    else 
                    {
                        System.out.println("Your Cart is being Discarded!");
                    }
					break;
                }
			}
     		}
        }
	}
}