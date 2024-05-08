import java.util.*;

import java.util.Scanner;
// vechile breakdown starts here

class VechileBreakdown extends RuknaNahi
{
         static Booking obj66 =new Booking();
	static java.util.Scanner sc=new java.util.Scanner(System.in);
	static int p1=500088,p2=500078,p3=505032,p4=500003,p5=500038,p6=500033,p7=500034,p8=500039,p9=500081,p10=500014;
	String tyres;
	static int PP; 
	String model,type,area;
  static VechileBreakdown obj6 = new VechileBreakdown();
     static void LogisWelcome()
     {
      System.out.println();
      System.out.print(lightash); 
      System.out.print("Pickup pincode You've Entered : ");
      System.out.print(def); 
      System.out.print(RuknaNahi.pickuplocation);
      System.out.println();
      System.out.println();
      System.out.print(lightash); 
      System.out.print("Drop pincode You've Entered : ");
      System.out.print(def); 
      System.out.print(RuknaNahi.droplocation);
      System.out.println();
      System.out.println(); 
      System.out.print(lightash); 
      System.out.println("	1.Confrim Your Pickup&Drop pincodes's	      2.Modifying Drop pincode	       3.Modifying Pincodes	    4.Main-Menu		5.Exit"); 
      System.out.print(def);	
     System.out.println(); 
     System.out.print(lightash);
      System.out.print("Enter your Choice Here : ");
     System.out.print(def);  
      int c=sc.nextInt();
      switch(c)
      {
          case(1):
          {
	     obj6.sample();	
             break;
           }
           case(2):
          {
            if(obj6.droplocation())
	    obj66.options(); 
	    break;
          }
          case(3):
          {
            if(obj6.pickuplocation())
	     obj66.options();
	    break;
          }
          case(4):
          {
	    System.out.print(brightYellow);
                   System.out.print("									Returing to Mainpage."); 
	       			for(int i=1; i<=2; i++)
				{
		   		   try{
	 			   Thread.sleep(1500);
				}
		  		catch(InterruptedException e){}
				System.out.print(".");
				}
	       			System.out.println();
                                System.out.print(def);
				System.out.println();
            MainPage();
	    break;
          }
          case(5):
          {
	    System.out.print(brightYellow);	
                   System.out.print("									Exiting the Application."); 
	       			for(int i=1; i<=2; i++)
				{
		   		   try{
	 			   Thread.sleep(1500);
				}
		  		catch(InterruptedException e){}
				System.out.print(".");
				}
	       			System.out.println();
                                System.out.print(def);
				System.out.println();

            System.exit(0);
	    break;
          }
          default:
          {
            LogisWelcome();
            break;
          }
      }
      
   }
  
   static void priting()
   {
     obj6.Booking();
   }
   int yourlocation,workshop ;
	void assistance(int a)
   	{
		if(a==1)
		{
			tyres = "tube";		
			}
		else
		{
			tyres="tubless";
		}
     	  	priting();      
   	}
	void assistance(String a,String b)
   	{
		model=a;
		type=b;
     		priting(); 
   	}

	void recovery()
   	{
     		priting();
   	}


        void sample()
         {
			obj6.pickupdroppoint();
                       System.out.println();
                       System.out.print(lightash);
                       System.out.println("                                                        Choose vechile type");
			System.out.println();
			System.out.print(def);
			System.out.print(yellow);
                       System.out.println("								1.Two Wheeler");
			System.out.println("								2.Three Wheeler");
			System.out.println("								3.Four Wheeler");
			System.out.println("								4.Heavy Vehicles");
			System.out.println("								5.Exit");
			System.out.println();
			System.out.print(def);
			System.out.print(lightash);
                        System.out.print("Enter your choice Here : ");
			System.out.print(def);
		        int n=sc.nextInt();
			System.out.println();
			vehicleBreakDown(n);
         }
	 void workshop()
   	{
    		recovery();
      		
   	}

	void vehicleBreakDown(int n)
	{
		
		switch(n)
		{
			case 1:{
					System.out.print(lightash);
					System.out.println("                                                        Choose your preference"); 
                                        System.out.println();
					System.out.print(def);
					System.out.print(yellow);
					System.out.println("								1.Puncture");
					System.out.println("								2.Engine breakdown");
					System.out.println("								3.Mechanical failures");
					System.out.println("								4.Go back");
                                        System.out.println();
					System.out.print(def);
					System.out.print(lightash);
					System.out.print("Enter your choice Here : ");
					System.out.print(def);
					int p=sc.nextInt();
					System.out.println();
						if(p==1)
						{	
							System.out.print(lightash);
                                                        System.out.println("                                                        Enter the type of your Tube ");
							System.out.print(def);
							System.out.println();
							System.out.print(yellow);
							System.out.println("                                                		1.Tube  		2.Tubeless");
							System.out.println();			
							System.out.print(def);
							System.out.print(lightash);
							System.out.print("Enter your choice Here : ");
							System.out.print(def);
							int a=sc.nextInt();
							System.out.println();
							if(a==1)
							obj6.price((float)(115.322));
							else
							obj6.price((float)(165.862));
							assistance(a);	
																
						}
						else if(p==2)
						{
     							System.out.print(lightash);
							System.out.print("                                                 Please Enter Your Vehicle Model(ex : ROYAL ENFIELD 350) Here : ");
							System.out.print(def);
							 model=sc.next();
							System.out.println();
							System.out.print(lightash);
							System.out.println("                                                        Please Choose Your Vehicle Type");
							System.out.println();
							System.out.println("                                                		1.Petrol		   2.EV");
							System.out.println();
							System.out.print("Enter your Choice Here : ");
							System.out.print(def);
							int b=sc.nextInt();
                                                        System.out.println();
							switch(b)
							{
								case 1:
									{
										type="petrol";
										obj6.price((float)(465.23));
										break;
									}
								case 2: 
									{
										type="ev";
										obj6.price((float)(347.00));
										break;
									}
								default: 
									{
										vehicleBreakDown(1);
										break;
									}

								
							}
							assistance(model,type);								
						}
						else if(p==3)
						{
							System.out.print(lightash);
							System.out.print("                                                 Please Enter Your Vehicle Model(ex : ROYAL ENFIELD 350) Here : ");
							System.out.print(def);
							 model=sc.next();
							System.out.println();
							System.out.print(lightash);
							System.out.println("                                                        Please Choose Your Vehicle Type");
							System.out.println();
							System.out.println("                                                		1.Petrol		   2.EV");
							System.out.println();
							System.out.print("Enter your Choice Here : ");
							System.out.print(def);
							int b=sc.nextInt();
                                                        System.out.println();
							switch(b)
							{
								case 1:
									{
										type="petrol";
										obj6.price((float)(157.80));
										break;
									}
								case 2: 
									{
										type="ev";	
										obj6.price((float)(223.54));
										break;
									}
								default: 
									{
										vehicleBreakDown(1);
										break;
									}

								
							}
							System.out.println();
							System.out.print(lightash);
							System.out.println("                                                        We will reach you to nearest workshop from your location");
							System.out.println();
							workshop();
						}
						else if(p==4)
						{
							sample();	
						}
						else
						{
							System.out.println();
							System.out.println("Please select valid assistance");
							vehicleBreakDown(1);
						}

					break;
				}
						
			case 2:
				{
					System.out.print(lightash);
					System.out.println("                                                        Choose your preference"); 
                                        System.out.println();
					System.out.print(def);
					System.out.print(yellow);
					System.out.println("								1.Puncture");
					System.out.println("								2.Engine breakdown");
					System.out.println("								3.Mechanical failures");
					System.out.println("								4.Go back");
                                        System.out.println();
					System.out.print(def);
					System.out.print(lightash);
					System.out.print("Enter your choice Here : ");
					System.out.print(def);
					int q=sc.nextInt();
					System.out.println();
						if(q==1)
						{
							System.out.print(lightash);
                                                        System.out.println("                                                        Enter the type of your Tube ");
							System.out.print(def);
							System.out.println();
							System.out.print(yellow);
							System.out.println("                                                		1.Tube  		2.Tubeless");
							System.out.println();
                                                        System.out.print(def);
							System.out.print(lightash);
							System.out.print("Enter your choice Here : ");
							System.out.print(def);
							int a=sc.nextInt();
							System.out.println();
							if(a==1)
							obj6.price((float)(223.25));
							else
							obj6.price((float)(250.80));
							
							assistance(a);																
						}
						else if(q==2)
						{
       							System.out.print(lightash);
							System.out.print("                                                 Please Enter Your Vehicle Model(ex : PIAGGO APE AUTO CLASSIC): ");
							System.out.print(def);
							 model=sc.next();
							System.out.println();
							System.out.print(lightash);
							System.out.println("                                                        Please Choose Your Vehicle Type");
                                                        System.out.print(yellow);
							System.out.println();
							System.out.println("                                                1.Petrol		   2.EV			3.Deisel");
							System.out.println();
							System.out.print(def);
							System.out.print(lightash);
							System.out.print("Enter your Choice Here : ");
							System.out.print(def);
							int c=sc.nextInt();
							switch(c)
							{
								case 1:
									{
										type="diesel";
										obj6.price((float)(450.80));
										break;
									}
								case 2:
									{
										type="gas";
										obj6.price((float)(376.40));
										break;
									}
								case 3: 
									{
										type="ev";
										obj6.price((float)(320.50));
										break;
									}
								default: 
									{
										vehicleBreakDown(3);
										break;
									}

								
							}
							assistance(model,type);								
						}
						else if(q==3)
						{
							System.out.print(lightash);
							System.out.print("                                                 Please Enter Your Vehicle Model(ex : PIAGGO APE AUTO CLASSIC): ");
							System.out.print(def);
							 model=sc.next();
							System.out.println();
							System.out.print(lightash);
							System.out.println("                                                        Please Choose Your Vehicle Type");
							System.out.print(yellow);
							System.out.println();
							System.out.println("                                                1.Petrol		   2.EV			3.Deisel");
							System.out.println();
							System.out.print(def);
							System.out.print(lightash);
							System.out.print("Enter your Choice Here : ");
							System.out.print(def);
							int c=sc.nextInt();

							switch(c)
							{
								case 1:
									{
										type="diesel";
										obj6.price((float)(377.20));
										break;
									}
								case 2:
									{
										type="gas";
										obj6.price((float)(230.80));
										break;
									}
								case 3: 
									{
										type="ev";
										obj6.price((float)(350.940));
										break;
									}
								default: 
									{
										vehicleBreakDown(3);
										break;
									}

								
							}
							
							System.out.println();
							System.out.print(lightash);
							System.out.println("                                                        We will reach you to nearest workshop from your location");
							System.out.println();
							workshop();
						}
						else if(q==4)
						{
							sample();	
						}
						else
						{
							System.out.println("please select valid assistance");
							vehicleBreakDown(2);
						}
					break;
			
				}
			case 3:	
				{	
					System.out.print(lightash);
					System.out.println("                                                        Choose your preference"); 
                                        System.out.println();
					System.out.print(def);
					System.out.print(yellow);
					System.out.println("								1.Puncture");
					System.out.println("								2.Engine breakdown");
					System.out.println("								3.Mechanical failures");
					System.out.println("								4.Go back");
                                        System.out.println();
					System.out.print(def);
					System.out.print(lightash);
					System.out.print("Enter your choice Here : ");
					System.out.print(def);
					int r=sc.nextInt();
					System.out.println();
						if(r==1)
						{
							System.out.print(lightash);
                                                        System.out.println("                                                        Enter the type of your Tube ");
							System.out.print(def);
							System.out.print(yellow);
  							System.out.println();
							System.out.println("                                               		 1.Tube  		2.Tubeless");
							System.out.println();			
							System.out.print(def);
							System.out.print(lightash);
							System.out.print("Enter your choice Here : ");
							System.out.print(def);
							int a=sc.nextInt();
							System.out.println();
							if(a==1)
							obj6.price((float)(280.25));
							else
							obj6.price((float)(320.40));
							assistance(a);	
																
						}
						else if(r==2)
						{
							System.out.print(lightash);
							System.out.print("                                                 Please Enter Your Vehicle Model(ex : TOYOTA FORTUNER): ");
							System.out.print(def);
							 model=sc.next();
							System.out.println();
							System.out.print(lightash);
							System.out.println("                                                        Please Choose Your Vehicle Type");
							System.out.println();
							System.out.println("                                                1.Petrol		   2.EV			3.Deisel");
							System.out.println();
							System.out.print("Enter your Choice Here : ");
							System.out.print(def);
							int c=sc.nextInt();
							switch(c)
							{
								case 1:
									{
										type="diesel";
										obj6.price((float)(1100.25));
										break;
									}
								case 2:
									{
										type="petrol";
										obj6.price((float)(1280.35));
										break;
									}
								case 3: 
									{
										type="ev";
										obj6.price((float)(980.25));
										break;
									}
								default: 
									{
										vehicleBreakDown(3);
										break;
									}

								
							}
							assistance(model,type);
								
						}
						else if(r==3)
						{
							System.out.print(lightash);
							System.out.print("                                                 Please Enter Your Vehicle Model(ex : TOYOTA FORTUNER): ");
							System.out.print(def);
							 model=sc.next();
							System.out.println();
							System.out.print(lightash);
							System.out.println("                                                        Please Choose Your Vehicle Type");
							System.out.println();
							System.out.println("                                                1.Petrol		   2.EV			3.Deisel");
							System.out.println();
							System.out.print("Enter your Choice Here : ");
							System.out.print(def);
							int c=sc.nextInt();

							switch(c)
							{
								case 1:
									{
										type="diesel";
										obj6.price((float)(680.31));
										break;
									}
								case 2:
									{
										type="petrol";
										obj6.price((float)(750.25));
										break;
									}
								case 3: 
									{
										type="ev";
										obj6.price((float)(57.65));
										break;
									}
								default: 
									{
										vehicleBreakDown(3);
										break;
									}

								
							}
							System.out.println();
							System.out.print(lightash);
							System.out.println("                                                        We will reach you to nearest workshop from your location");
							System.out.println();
							workshop();
						}
						else if(r==4)
						{
							sample();	
						}
						else
						{
							System.out.println("please select valid assistance");
							vehicleBreakDown(3);
						}
					break;
				}
			case 4:
				{
					System.out.print(lightash);
					System.out.println("                                                        Choose your preference"); 
                                        System.out.println();
					System.out.print(def);
					System.out.print(yellow);
					System.out.println("								1.Puncture");
					System.out.println("								2.Engine breakdown");
					System.out.println("								3.Mechanical failures");
					System.out.println("								4.Go back");
                                        System.out.println();
					System.out.print(def);
					System.out.print(lightash);
					System.out.print("Enter your choice Here : ");
					System.out.print(def);
					int s=sc.nextInt();
					System.out.println();
						if(s==1)
						{
							System.out.print(lightash);
                                                        System.out.println("                                                        Enter the type of your Tube ");
							System.out.print(def);
							System.out.print(yellow);
							System.out.println();
							System.out.println("                                                1.Tube  		2.Tubeless");
							System.out.println();			
							System.out.print(def);
							System.out.print(lightash);
							System.out.print("Enter your choice Here : ");
							System.out.print(def);
							int a=sc.nextInt();
							System.out.println();
							if(a==1)
							obj6.price((float)(560.25));
							else
							obj6.price((float)(520.40));
							assistance(a);
																
						}
						else if(s==2)
						{
							System.out.print(lightash);
							System.out.print("                                                 Please Enter Your Vehicle Model(ex : EICHER PRO 3015):");
							System.out.print(def);
							 model=sc.next();
							System.out.println();
							System.out.print(lightash);
							System.out.println("                                                        Please Choose Your Vehicle Type");
							System.out.println();
							System.out.println("                                                1.Deisel");
							System.out.println();
							System.out.print("Enter your Choice Here : ");
							System.out.print(def);
							int d=sc.nextInt();
							switch(d)
							{
								case 1:
									{
										type="diesel";
										obj6.price((float)(820.40));
										break;
									}
								default:
									{
										type="diesel";
										obj6.price((float)(930.30));
										break;
									}
							}


							assistance(model,type);
								
						}
						else if(s==3)
						{
							System.out.print(lightash);
							System.out.print("                                                 Please Enter Your Vehicle Model(ex : EICHER PRO 3015): ");
							System.out.print(def);
							model=sc.next();
							System.out.println();
							System.out.print(lightash);
							System.out.println("                                                        Please Choose Your Vehicle Type");
							System.out.println();
							System.out.println("                                                1.Deisel");
							System.out.println();
							System.out.print("Enter your Choice Here : ");
							System.out.print(def);
							int d=sc.nextInt();
							switch(d)
							{
								case 1:
									{
										type="diesel";
										obj6.price((float)(520.30));
										break;
									}
								default:
									{
										type="diesel";
										obj6.price((float)(520.30));
										break;
									}
							}
							System.out.println();
							System.out.print(lightash);
							System.out.println("                                                        We will reach you to nearest workshop from your location");
							System.out.println();
							workshop();
						}
						else if(s==4)
						{
							sample();	
						}
						else
						{
							System.out.println("                                                        Please select valid assistance");
							vehicleBreakDown(4);
						}
					break;

				}
			case 5:
				{
					System.out.print(brightYellow);	
                  		 System.out.print("							Exiting the Application."); 
	       			for(int i=1; i<=2; i++)
				{
		   		   try{
	 			   Thread.sleep(1500);
				}
		  		catch(InterruptedException e){}
				System.out.print(".");
				}
	       			System.out.println();
                                System.out.print(def);
				System.out.println();

					System.exit(0);
					break;
				}
			default:
				{
					System.out.print(red);
					System.out.print(blink);
					System.out.println("							Sorry invalid, Enter a Valid input");
					System.out.print(def);
					sample();
					break;
				}
				
		}
	
	}
}

// vechile ends here
class FuelRefill extends RuknaNahi
{
   static Scanner sc=new Scanner(System.in);
   static Logisticss obj5 = new Logisticss();
/// start
static void fuealweilcome()
{
		obj5.pickupdroppoint();
    System.out.println();
   System.out.print(lightash);
   System.out.println("                                                        Select the refill of your need");
  System.out.print(def);
    System.out.println();
    System.out.print(yellow);
       	      System.out.println("								1.Petrol Refill \n								2.Deisel Refill \n								3.Electric Vehchile Recharge\n								4.Main-Menu\n								5.Exit");
             System.out.print(def);
		 System.out.print(lightash);
              System.out.print("Enter your choice here : ");
             System.out.print(def);
       	      int y=sc.nextInt();
               System.out.println();
       	      FuelRefill(y);
}
static void LogisWelcome()
     {
      int yy=0;
      System.out.println();
      if(yy==0) 
      System.out.print(lightash); 
      System.out.print("Pickup pincode You've Entered : ");
      System.out.print(def); 
      System.out.print(RuknaNahi.pickuplocation);
      System.out.println();
      System.out.println();
      System.out.print(lightash); 
      System.out.print("Drop pincode You've Entered : ");
      System.out.print(def); 
      System.out.print(RuknaNahi.droplocation);
      System.out.println();
      System.out.println(); 
      System.out.print(lightash); 
      System.out.println("	1.Confrim Your Pickup&Drop pincodes's	      2.Modifying Drop pincode	       3.Modifying Pincodes	    4.Main-Menu		5.Exit"); 
      System.out.print(def);	
     System.out.println(); 
     System.out.print(lightash);
      System.out.print("Enter your Choice Here : ");
     System.out.print(def);
      int c=sc.nextInt();
        System.out.println();
      switch(c)
      {
          case(1):
          {
	     fuealweilcome(); 	
             break;
           }
           case(2):
          {
            obj5.droplocation(); 
	    break;
          }
          case(3):
          {
            obj5.pickuplocation();
	    break;
          }
          case(4):
          {
	    System.out.print(lightash);
                   System.out.print("									Returing to Mainpage."); 
	       			for(int i=1; i<=2; i++)
				{
		   		   try{
	 			   Thread.sleep(1500);
				}
		  		catch(InterruptedException e){}
				System.out.print(".");
				}
	       			System.out.println();
                                System.out.print(def);
				System.out.println();
            MainPage();
	    break;
          }
          case(5):
          {
	    System.out.print(lightash);	
                   System.out.print("									Exiting the Application."); 
	       			for(int i=1; i<=2; i++)
				{
		   		   try{
	 			   Thread.sleep(1500);
				}
		  		catch(InterruptedException e){}
				System.out.print(".");
				}
	       			System.out.println();
                                System.out.print(def);
				System.out.println();

            System.exit(0);
	    break;
          }
          default:
          {
 	    System.out.print(blink);
            System.out.print(red);
            yy=1;
            LogisWelcome();
            break;
          }
      }
      
   }

 /// end
// fueal start here 
   static int liter()
   {
        int yy=0;
        System.out.println();
        if(yy==0)
        System.out.print(lightash);
        System.out.print("Enter the Quantity Here Min 1 liter : "); 
        System.out.print(def);
        int li= sc.nextInt();
        System.out.println();
	if(li>=1)
	return li;
	else
        {
        yy=1;
        System.out.print(blink);
            System.out.print(red);
	return liter();
        }
   }
   static void normalPetrol(float p)
   {
      System.out.println();
      System.out.print(lightash);
      System.out.println("						  Please select your preferred Fuel station from the following options: ");
        System.out.print(def);
  	System.out.println();
        System.out.print(yellow);
        System.out.println("							1.Indian Oil Corporation Ltd - "+(p+4.232)+"/per liter");
	System.out.println("							2.Bharat Petroleum Corp Ltd - "+(p+7.20)+"/per liter");
	System.out.println("							3.Hindustan Petroleum Corporation Ltd - "+(p-7.032)+"/per liter");
	System.out.println("							4.Reliance Industries Ltd - "+(p+3.772)+"/per liter");
	System.out.println("							5.Shell petroleum Ltd  "+(p+10.232)+"/per liter");
	System.out.println("							6.Go back");
	System.out.println("							7.Main-menu"); 
        System.out.println();
        System.out.print(def);
        System.out.print(lightash);
        System.out.print("Enter your choice here : ");
        System.out.print(def);
	int u=sc.nextInt();
        switch(u)
	{
	   case(1):
	   {
		//price mthod (p+4.232)
		int li=liter();
		obj5.price((float)(p+4.232)*li);
		obj5.Booking();
 		break;
	   }
	   case(2):
	   {
 		//(p+7.20);
		int li=liter();
		obj5.price((float)(p+7.20)*li);
		obj5.Booking();
 		break;
	   }
	   case(3):
	   {
		//(p-7.032);
		int li=liter();
		obj5.price((float)(p-7.032)*li);
		obj5.Booking();
 		break;
	   }
	   case(4):
	   {
		//(p+3.772);
		int li=liter();
		obj5.price((float)(p+3.772)*li);
		obj5.Booking();
 		break;
	   }
	   case(5):
	   {
		//(p+10.232);
		int li=liter();
		obj5.price((float)(p+10.232)*li);
		obj5.Booking();
 		break;
	   }
	   case(6):
	   {
                if(p==100||p==113)
		FuelRefill(1);
		else if(p==85)
		fuealweilcome();
		else
		FuelRefill(3);
		break;
	   }
	   case(7):
	   {
		fuealweilcome();;
		break;
	   }
	   default:
	   {
	       normalPetrol(p);	
               break;
	   }
	}     
   }
   
   static void FuelRefill(int y)
   {
       
       switch(y)
       {
           case(1):
           {
             System.out.print(lightash);
             System.out.println();
             System.out.println("                                                        Choose the petrol type you want");
             System.out.print(def);
             System.out.print(yellow);
             System.out.println();
	     System.out.println("								1.Normal petrol \n								2.Power petrol\n								3.Go back");
             System.out.print(def);
             System.out.print(lightash);
	     System.out.print("Enter your choice here  : ");
	     System.out.print(def);
             int n=sc.nextInt();
             System.out.println();
             switch(n)
             {
                case(1):
                {
		
                   normalPetrol(100);
		   break;
		}
		case(2):
                {
		   normalPetrol(113);
		   break;
		}
		case(3):
		{
		   fuealweilcome();	
		   break;
		}
		default:
                {
                   FuelRefill(1);
		   break;
		}
		
             }
             break;
           }
	   case(2):
           {
             normalPetrol(85);
             break;
           }
	   case(3):
           {
             System.out.println();
             System.out.print(lightash);
             System.out.println("                                                        Select the recharge of your need");
             System.out.println();
             System.out.print(def);
	      message=5;
             System.out.print(yellow);
       	     System.out.println("								1.Full Recharge \n								2.Partially Recharge \n								3.Battery Replacement\n								4.Go back");
             System.out.print(def);
	     System.out.print(lightash);
	     System.out.print("Enter your choice Here : ");
             System.out.print(def);
       	     int r2=sc.nextInt(); 
             System.out.println();
             switch(r2)
	     {
                 case(1):	
		 {
                    System.out.println();
 		    System.out.print(lightash);
                    System.out.println("                                                        For Full Rechagre we charge 7.31/kW");
                    System.out.print(def);
                    System.out.println();
		    obj5.price(getOtp());
		    obj5.price(price*(float)(0.041)*(float)(7.31));
                    obj5.Booking();
 		    break;
 		 }
		 case(2):	
		 {
		    System.out.println();
                    System.out.print(lightash);
		    System.out.println("                                                        For Partial Rechagre we charge 9.05/kW");
                    System.out.print(def);
                    System.out.println();
		    obj5.price(getOtp());
		    obj5.price(price*(float)(0.041)*(float)(9.05));
                    obj5.Booking();
 		    break;
 		 }
		 case(3):	
		 {
                    System.out.println();
                    System.out.print(lightash);
		    System.out.println("                                                        These are they Battery Type we have");
		    System.out.println();
                   System.out.print(def); 
                    System.out.print(yellow);
		    System.out.println("								1.Lithium-ion (Li-ion) Batteries\n								2.Nickel-Metal Hydride (NiMH) Batteries\n								3.Lead-Acid Batteries");
		    System.out.println();
                    System.out.print(def);
 		   System.out.print(lightash);
		    System.out.println("Select your Battery type here : ");
                     System.out.print(def);
                    System.out.println();
		    int ss=sc.nextInt();
                    switch(ss)
		    {
			case(1):
			{
                          System.out.println();
                          System.out.print(lightash);
			  System.out.println("		Unlock premium quality at an unmatched value, priced a remarkable 35% lower than market standards, with the added security of a 2-year warranty.");
			  System.out.println();
			  System.out.println("Enter your Vechile Model here ex : Tata Nexon EV : ");
                          System.out.print(def);
			  String s=sc.next();
 			  System.out.println();
			  break;
			}
			case(2):
			{
			  System.out.println();
			 System.out.print(lightash);
			  System.out.println("		Unlock premium quality at an unmatched value, priced a remarkable 35% lower than market standards, with the added security of a 2-year warranty.");
			  System.out.println();
			  System.out.println("Enter your Vechile Model ex : Toyota Camry Hybrid");
		          System.out.print(def);
			  String s=sc.next();
			  System.out.println();
			  break;
			}
			case(3):
			{
			  System.out.println();
			  System.out.print(lightash);
			  System.out.println("		Unlock premium quality at an unmatched value, priced a remarkable 35% lower than market standards, with the added security of a 2-year warranty.");
			  System.out.println();
			  System.out.println("Enter your Vechile Model ex : Mahindra e-Verito");
			  System.out.print(def);
			  String s=sc.next();
			  System.out.println();
			  break;
			}
			case(4):
		        {
		   	 fuealweilcome();	
		   	 break;
		        }
			default:
			{
			   FuelRefill(3);
		           break;
			}
		    }
 		    break;
 		 }
		 case(4):
		{
	           System.out.print(brightYellow);
                   System.out.println();
                   System.out.print("									Returing to Mainpage."); 
	       			for(int i=1; i<=2; i++)
				{
		   		   try{
	 			   Thread.sleep(1500);
				}
		  		catch(InterruptedException e){}
				System.out.print(".");
				}
	       			System.out.println();
                                System.out.print(def);
				System.out.println();
		   MainPage();
 		   break;
		}
		case(5):
		{
                   System.out.print(brightYellow);	
                  System.out.print("									Exiting the Application."); 
	       			for(int i=1; i<=2; i++)
				{
		   		   try{
	 			   Thread.sleep(1500);
				}
		  		catch(InterruptedException e){}
				System.out.print(".");
				}
	       			System.out.println();
                                System.out.print(def);
				System.out.println();

		   System.exit(0);
		   break;
		}
		 default:
    		 {
		    FuelRefill(2);
                    break;
		 }

	     }
             break;
           }
	   default:
           {
             System.out.println();
             System.out.print(lightash);
             System.out.println("                                                        Select the refill of your need");
	     System.out.println();
             System.out.print(def);
             System.out.print(yellow);
       	     System.out.println("								1.Petrol Refill \n								2.Deisel Refill \n								3.Electric Vehchile Recharge\n								4.Main-Menu\n								5.Exit");
             System.out.print(def);
	     System.out.print(lightash);
             System.out.print("Enter your choice Here : ");
	    System.out.print(def);
       	     int r=sc.nextInt();
             System.out.println();
             FuelRefill(r);	
             break;
           }
       }
   }
}

// fueal ends here 
//logistics starts here
class Logisticss extends RuknaNahi
{
   static Scanner sc=new Scanner(System.in);
 static Booking obj111 =new Booking();
 static String ReceiverName;
 static long ReceiverMobile;
 static int items;
  static Logisticss obj4 = new Logisticss();
     static void LogisWelcome()
     {
      obj4.price(getOtp());
      System.out.println(); 
      System.out.print(lightash); 
      System.out.print("Pickup pincode You've Entered : ");
      System.out.print(def); 
      System.out.print(RuknaNahi.pickuplocation);
      System.out.println();
      System.out.println();
      System.out.print(lightash); 
      System.out.print("Drop pincode You've Entered : ");
      System.out.print(def); 
      System.out.print(RuknaNahi.droplocation);
      System.out.println();
      System.out.println(); 
      System.out.print(lightash); 
      System.out.println("	1.Confrim Your Pickup&Drop pincodes's	      2.Modifying Drop pincode	       3.Modifying Pincodes	    4.Main-Menu		5.Exit"); 
      System.out.print(def);	
     System.out.println(); 
     System.out.print(lightash);
      System.out.print("Enter your Choice Here : ");
     System.out.print(def); 

      int c=sc.nextInt();
      switch(c)
      {
          case(1):
          {
	     LogisticsmainSwitch();	
             break;
           }
           case(2):
          {
	    if(obj4.droplocation())
	    obj111.options(); 
	    break; 
          }
          case(3):
          {
	    if(obj4.pickuplocation())
	    obj111.options();
	    break;
          }
          case(4):
          {
	    System.out.print(brightYellow);
                   System.out.print("									Returing to Mainpage."); 
	       			for(int i=1; i<=2; i++)
				{
		   		   try{
	 			   Thread.sleep(1500);
				}
		  		catch(InterruptedException e){}
				System.out.print(".");
				}
	       			System.out.println();
                                System.out.print(def);
				System.out.println();
            MainPage();
	    break;
          }
          case(5):
          {
	    System.out.print(brightYellow);	
                   System.out.print("									Exiting the Application.");  
	       			for(int i=1; i<=2; i++)
				{
		   		   try{
	 			   Thread.sleep(1500);
				}
		  		catch(InterruptedException e){}
				System.out.print(".");
				}
	       			System.out.println();
                                System.out.print(def);
				System.out.println();

            System.exit(0);
	    break;
          }
          default:
          {
 	    System.out.print(blink);
            System.out.print(red);
            LogisWelcome();
            break;
          }
      }
      
   }
  static Long ReceiversMobileNumber()
  {
     if(c==0)
        {
        System.out.println();
	System.out.print(lightash);
        System.out.print("Enter Receiver's 10-digit Mobile number : "); 
	System.out.print(def);
        c=1;
        }
        long phoneNumber=sc.nextLong();
        if((phoneNumber >= 6000000000L && phoneNumber <= 9999999999L))
        {
               c=0;
               return phoneNumber;
        }
        else
        {
              System.out.print(blink);
              System.out.print(red);
	      System.out.println();
              System.out.print("Please Enter a valid 10-digit Mobile number : ");
	      System.out.print(def);
              return ReceiversMobileNumber();
        }

  }
  static void fetchingDetails()
  {
      if(obj4.pickupdroppoint())
       {
	 System.out.print(lightash);
         System.out.println();
         System.out.print("Enter Receiver's Name : ");	
	 System.out.print(def);
         ReceiverName = sc.next();
	 System.out.println(lightash);
	 System.out.println();
         System.out.println("                                       1.Enter Receiver's Mobiles Number 			2.Use Your Registered Mobile Number");
	 System.out.println();
	 System.out.print("Enter your choice Here : ");
	 System.out.print(def);
         int f=sc.nextInt();
	 System.out.println();
         if(f==1)
         {
 	     ReceiverMobile=ReceiversMobileNumber();
         }
         else
         {
             ReceiverMobile=getnumber();
         }
         
       }

  }
  static void menu()
  {
     int a=(int)(Math.random()*10);
	      System.out.print(yellow);
	      System.out.println();
	     System.out.printf("							1.Tata Ace  Capacity : upto 750 Kg - %d mins Away %.2f Rs\n",(a+26),price*(0.041));
	     System.out.printf("							2.Two Wheeler Capacity : upto 20 Kg - %d mins Away %.2f Rs\n",(a+12),price*(0.017));
             System.out.printf("							3.Three Wheller Capacity : upto 500 Kg - %d mins Away %.2f Rs\n",(a+19),price*(0.032));
	     System.out.printf("							4.Pickup 8ft Capacity : upto 1200 Kg - %d mins Away %.2f Rs\n",(a+26),price*(0.053));
	     System.out.printf("							5.Tata 407 Capacity : upto 2500 Kg - %d mins Away %.2f Rs\n",(a+26),price*(0.064));
      	     System.out.println("							6.Previous Menu \n							7.Main Menu\n							8.Exit"); 
	      System.out.println();
	    System.out.print(def);
	     System.out.print(lightash);
             System.out.print("Enter your choice here : ");	
	     System.out.print(def);
             int u=sc.nextInt();
	      System.out.println();
	     System.out.print(lightash);
             System.out.println("								Read before Booking ");
	      System.out.println();
             System.out.println("							* Fare doesn't include labour charges for loading & unloading\n							* Fare includes 120 mins free loading/unloading time.\n							* 7.0/min for additional loading/unloading time.\n 							* Fare may change if route or location changes.\n 							* Parking charges to be paid by customer.\n							* Fare includes toll and permit charges, if any.\n							* We don't allow overloading.");
	      System.out.println();
	     switch(u)
	     {
                case(1):
                {   System.out.print(lightash);
		    System.out.println();
		   System.out.println("                                                1.Confirm Booking a Tata Ace		2.Go Back");
		    System.out.println();
            	   System.out.print("Enter your Choice Here : ");
		   System.out.print(def);
                   int y=sc.nextInt();
            	   if(y==1)
            	   { 
               	      obj4.price(price*(float)(0.041));
                      obj4.Booking();
                   }
            	   else
            	   {
               	     local();
             	   }
              	   break;
                }
		case(2):
                {
		   System.out.print(lightash);
		    System.out.println();
		   System.out.println("                                                1.Confirm Booking a Two Wheeler		2.Go Back");	
		    System.out.println();
            	   System.out.print("Enter your Choice Here : ");
	           System.out.print(def);
                   int y=sc.nextInt();
            	   if(y==1)
            	   { 
               	      obj4.price(price*(float)(0.017));
                      obj4.Booking();
                   }
            	   else
            	   {
               	     local();
             	   }
              	   break;
                }
		case(3):
                {
		   System.out.print(lightash);
	            System.out.println();
		   System.out.println("                                                1.Confirm Booking a Three Wheeler		2.Go Back");
	            System.out.println();
            	   System.out.print("Enter your Choice Here : ");
		   System.out.print(def);
                   int y=sc.nextInt();
            	   if(y==1)
            	   { 
               	      obj4.price(price*(float)(0.032));
                      obj4.Booking();
                   }
            	   else
            	   {
               	     local();
             	   }
                   break;
                }
		case(4):
                {	
		   System.out.print(lightash);
		    System.out.println();
		   System.out.println("                                                1.Confirm Booking a Pickup 8ft		2.Go Back");
		   System.out.println();
            	   System.out.print("Enter your Choice Here : ");
		   System.out.print(def);
                   int y=sc.nextInt();
            	   if(y==1)
            	   { 
               	     obj4.price(price*(float)(0.053));
                     obj4.Booking();
                   }
            	   else
            	   {
               	     local();
             	   }
                   break;
                }
		case(5):
                { 
		   System.out.print(lightash);
		    System.out.println();
		   System.out.println("                                                1.Confirm Booking a Tata 407 		2.Go Back");
		    System.out.println();
            	   System.out.print("Enter your Choice Here : ");
		   System.out.print(def);
                   int y=sc.nextInt();
            	   if(y==1)
            	   { 
               	     obj4.price(price*(float)(0.064));
                    obj4.Booking();
                   }
            	   else
            	   {
               	     local();
             	   }
                   break;
                }
		case(6):
                {
                   LogisticsmainSwitch();
                   break;
                }
		case(7):
                {
	           System.out.print(brightYellow);
		    System.out.println();
                   System.out.print("									Returing to Mainpage."); 
	       			for(int i=1; i<=2; i++)
				{
		   		   try{
	 			   Thread.sleep(1500);
				}
		  		catch(InterruptedException e){}
				System.out.print(".");
				}
	       			System.out.println();
                                System.out.print(def);
				System.out.println();
                   MainPage();
                   break;
                }
		case(8):
                {
		   System.out.println();
	           System.out.print(brightYellow);	
                   System.out.print("									Exiting the Application."); 
	       			for(int i=1; i<=2; i++)
				{
		   		   try{
	 			   Thread.sleep(1500);
				}
		  		catch(InterruptedException e){}
				System.out.print(".");
				}
	       			System.out.println();
                                System.out.print(def);
				System.out.println();
		   System.exit(0);
                   break;
                }
		default:
 		{
                    local();
		    break;  
                }
             }
  }
  static void LivingRoom()
  {
     System.out.print(lightash);
     System.out.println("							Add Number of items to your cart from the following catergory");
     System.out.print(def);
     System.out.println(); 
     System.out.print(yellow);
     System.out.println("                                                                chairs\n                                                                Tables\n                                                                TV/Moniter\n                                                                Cabinet/Storage\n                                                                Sofa\n                                                                Home Utility");
     System.out.println();
     System.out.print(def);
     System.out.print(lightash);
     System.out.print("Enter your Quantity Here : ");
     System.out.print(def);
     int p=sc.nextInt(); 
     if(p==0)
     {
     System.out.println();
     System.out.print(blink);
     System.out.print(red);
     System.out.println();
     System.out.println("									Minimum Quantity is 1");
     System.out.print(def);
     LivingRoom();
     }
     else
     {
     items+=p; 
     return;
     }
          
  }
  static void Bedroom()
  {
     System.out.print(lightash);
     System.out.println("							Add Number of items to your cart from the following catergory");
     System.out.print(def);
     System.out.println();
     System.out.print(yellow);
     System.out.println("                                                                chairs\n                                                                Tables\n								TV/Mattress\n								Cabinet/Storage\n								Bed frame\n								Almirah/Wardrobe");
     System.out.print(def);
     System.out.println();
     System.out.print(lightash);
     System.out.print("Enter your Quantity Here : ");
     System.out.print(def);
     System.out.println();
     int p=sc.nextInt(); 
     if(p==0)
     {
     System.out.print(blink);
     System.out.print(red);
     System.out.println();
     System.out.println("									Minimum Quantity is 1");
     System.out.print(def);
     Bedroom();
     }
     else
     {
     items+=p; 
     return;
     }
          
  }
  static void Kitchen()
  {
     System.out.print(lightash);
     System.out.println();
     System.out.println("							Add Number of items to your cart from the following catergory");
     System.out.print(def);
     System.out.print(yellow);
     System.out.println();
     System.out.println("                                                                Fridge\n                                                                Electical/Gas Appliances\n								Cabinet/Storage");
     System.out.println();
     System.out.print(def);
     System.out.print(lightash);
     System.out.print("Enter your Quantity Here : ");
     System.out.print(def);
     int p=sc.nextInt(); 
     System.out.println();
     if(p==0)
     {
     System.out.print(blink);
     System.out.print(red);
     System.out.println();
     System.out.println("									Minimum Quantity is 1");
     System.out.println();
     System.out.print(def);
     Kitchen();
     }
     else
     {
     items+=p; 
     return;
     }       
  }
 static void Others()
  { 
     System.out.print(lightash);
     System.out.println();
     System.out.println("							Add Number of items to your cart from the following catergory");
     System.out.print(def);
     System.out.print(yellow);
     System.out.println();
     System.out.println("                                                                self Cartom Box\n								Guuny bag\n								Bathroom Utility\n								Vehicle\n								Equipments/Instruments");
     System.out.print(def);
     System.out.print(lightash);
     System.out.println();
     System.out.print("Enter your Quantity Here : ");
     System.out.print(def);
     int p=sc.nextInt(); 
     System.out.println();
     if(p==0)
     {
     System.out.println();
     System.out.print(blink);
     System.out.print(red);
     System.out.println();
     System.out.println("									Minimum Quantity is 1");
     System.out.print(def);
     Others();
     }
     else
     {
     items+=p; 
     return;
     }       ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  }

  static void packagersMenu()
  { 
      // menu create here continuee 
      System.out.print(lightash);
	System.out.println();
      System.out.println("							Add items from the following category");
      System.out.print(def);
      System.out.print(yellow);
	System.out.println();
      System.out.println("                                                                1.Living Room \n								2.Bedroom \n								3.Kitchen \n								4.Others\n								5.Main-Menu\n								6.Exit");
	System.out.print(def);
      System.out.print(lightash);
	System.out.println();
      System.out.print("Enter your choice Here : ");
      System.out.print(def);
      int j=sc.nextInt();
      switch(j)
      {
         case(1):
         {
           LivingRoom();
	   if(items!=0)
          {
            System.out.print(lightash);	
	    System.out.println();
            System.out.println("                                                1.Add More items 		2.Proceed and Next");
	    System.out.println();
            System.out.print("Enter your Choice here : ");
	    System.out.print(def);
            int jj=sc.nextInt();
            if(jj==1)
            {
               packagersMenu();
            }
 	    else
            {
               //billing..
	         System.out.print(lightash);
		System.out.println();
                 System.out.println("                                                1.Confirm and Proceed		2.Go Back");
		System.out.println();
            	   System.out.print("Enter your Choice Here : ");
                   System.out.print(def);
                   int y=sc.nextInt();
            	   if(y==1)
            	   { 
               	      obj4.price(price*(float)(0.041)*items);
                      obj4.Booking();
                   }
            	   else
            	   {
               	     packagersMenu();
             	   }   
            }
          }
           break;
         }
	 case(2):
         {
 	   Bedroom();
	   if(items!=0)
           {
	    System.out.print(lightash);
	    System.out.println();
            System.out.println("                                                1.Add More items 		2.Proceed and Next");
	   System.out.println();
            System.out.print("Enter your Choice here : ");
	    System.out.print(def);
            int jj=sc.nextInt();
            if(jj==1)
            {
               packagersMenu();
            }
 	    else
            {
               //billing..  
	        System.out.print(lightash);
		System.out.println();
		System.out.println("                                                1.Confirm and Proceed		2.Go Back");
		System.out.println();
            	   System.out.print("Enter your Choice Here : ");
		   System.out.print(def);
                   int y=sc.nextInt();
            	   if(y==1)
            	   { 
               	      obj4.price(price*(float)(0.041)*items);
                      obj4.Booking();
                   }
            	   else
            	   {
               	     packagersMenu();
             	   } 
                
            }
           }
           break;
         }
	 case(3):
         {
	    Kitchen();
           if(items!=0)
          {
	    System.out.print(lightash);
	    System.out.println();
            System.out.println("                                                1.Add More items 		2.Proceed and Next");
	    System.out.println();
            System.out.print("Enter your Choice here : ");
	    System.out.print(def);
            int jj=sc.nextInt();
            if(jj==1)
            {
               packagersMenu();
            }
 	    else
            {
               //billing..  
	        System.out.print(lightash);
		System.out.println();
		System.out.println("                                                1.Confirm and Proceed		2.Go Back");
		   System.out.println();
            	   System.out.print("Enter your Choice Here : ");
	           System.out.print(def);
                   int y=sc.nextInt();
            	   if(y==1)
            	   { 
               	      obj4.price(price*(float)(0.041)*items);
                      obj4.Booking();
                   }
            	   else
            	   {
               	     packagersMenu();
             	   } 
                
            }
          }
           break;
         }
	 case(4):
         {
  	  // Others();
           if(items!=0)
          {
	    System.out.print(lightash);
	    System.out.println();
            System.out.println("                                                1.Add More items 		2.Proceed and Next");
	    System.out.println();
            System.out.print("Enter your Choice here : ");
	    System.out.print(def);
            int jj=sc.nextInt();
            if(jj==1)
            {
               packagersMenu();
            }
 	    else
            {
               //billing..  
	        System.out.print(lightash);
		System.out.println();
		System.out.println("                                                1.Confirm and Proceed		2.Go Back");
            	System.out.println();   
		System.out.print("Enter your Choice Here : ");
		  System.out.print(def);
                   int y=sc.nextInt();
            	   if(y==1)
            	   { 
               	      obj4.price(price*(float)(0.041)*items);
                      obj4.Booking();
                   }
            	   else
            	   {
               	     packagersMenu();
             	   } 
                
            }
          }
           break;
         }
         case(5):
         {
           LogisticsmainSwitch();
           break;
         }
         case(6):
         {
	    System.out.print(brightYellow);	
                   System.out.print("								Exiting the Application."); 
	       			for(int i=1; i<=2; i++)
				{
		   		   try{
	 			   Thread.sleep(1500);
				}
		  		catch(InterruptedException e){}
				System.out.print(".");
				}
	       			System.out.println();
                                System.out.print(def);
				System.out.println();
  	    System.exit(0);
           break;
         }
         
         default :
         {
           packagersMenu();
           break;
	 }
      }  
       
       
      
  }
  static void local()
  {
      fetchingDetails();
      menu();       
  }
  static void outStation()
  {
      fetchingDetails();
      menu();
  }
  static void packagersMovers()
  {
      fetchingDetails();
      System.out.println();
       System.out.print(lightash);
      System.out.print("Enter Shifting date in format DD/MM/YYYY Here : ");
       System.out.print(def);
      String date = sc.next();
      System.out.println();
      packagersMenu();       
  }
  static void dummypack()
  {
     System.out.println();
      System.out.print(lightash);
     System.out.println("								Items to be shifted ");
     System.out.print(def);
     System.out.println();
     System.out.print(yellow);
     System.out.println("                                                                1.HouseHold items \n								2.Electronics \n								3.Commercial goods \n								4.Others");
     System.out.println();
     System.out.print(def);
     System.out.print(lightash);
     System.out.print("Enter your choice here : ");
     System.out.print(def);
     int nn=sc.nextInt();
     System.out.println();
     System.out.print(lightash);
     System.out.print("Enter Number of items here : ");
     System.out.print(def);
     int k=sc.nextInt();
     if(k==0)
     {
     System.out.println();
     System.out.print(blink);
     System.out.print(red);
     System.out.println();
     System.out.println("								Minimum Quantity is 1");
     System.out.print(def);
     dummypack();
     }
     else
     {
     items+=k; 
     }
     if(items!=0)
           {
	    System.out.println();
	    System.out.print(lightash);
            System.out.println("                                                1.Add More items 		2.Proceed and Next");
	     System.out.println();
            System.out.print("Enter your Choice here : ");
	    System.out.print(def);
            int jj=sc.nextInt();
            if(jj==1)
            {
               dummypack();
            }
 	    else
            {
               //billing..  
		 System.out.println();
		System.out.print(lightash);
		System.out.println("                                                1.Confirm and Proceed		2.Go Back");
		 System.out.println();
            	   System.out.print("Enter your Choice Here : ");
		   System.out.print(def);
                   int y=sc.nextInt();
            	   if(y==1)
            	   { 
               	      obj4.price(price*(float)(0.041)*items);
                      obj4.Booking();
                   }
            	   else
            	   {
               	     packagersMenu();
             	   } 
                
            }
           }
  }
  static void packagersMinimovers()
  {
     fetchingDetails();
     System.out.print(lightash);
     System.out.print("Enter Pickup data in format DD/MM/YYYY  here : ");
     System.out.print(def);
     String date = sc.next();
     System.out.println();
     System.out.print(lightash);
     System.out.print("Enter Pickup time in 12hrs format here : ");
     System.out.print(def);
     String time = sc.next(); 
     System.out.println();
     dummypack();

     
  }
  static void dummypack2()
  {  
     System.out.print(lightash);
     System.out.println("								Select package type");
     System.out.print(def);
     System.out.print(yellow);
     System.out.println("                                                                1.Documents \n								2.Hardware \n								3.Books&statinary\n								4.Personal items \n								5.Clothes \n								6.Househould items \n								7.Others");
     System.out.print(def);
     System.out.print(lightash);
     System.out.print("Enter your choice here : ");	
     System.out.print(def);
     int nn=sc.nextInt();
     System.out.println();
     System.out.print(lightash);
     System.out.print("Enter Number of items here : ");
     System.out.print(def);
     int k=sc.nextInt();
     System.out.println();
     if(k==0)
     {
     System.out.println();
     System.out.print(blink);
     System.out.print(red);
     System.out.println();
     System.out.println("									Minimum Quantity is 1");
     System.out.print(def);
     dummypack();
     }
     else
     {
     items+=k; 
     }
     if(items!=0)
           {
	    System.out.println(); 
            System.out.print(lightash);
            System.out.println("                                                1.Add More items 		2.Proceed and Next");
	    System.out.println();
            System.out.print("Enter your Choice here : ");
            System.out.print(def);
            int jj=sc.nextInt();
            if(jj==1)
            {
               dummypack2();
            }
 	    else
            {
               //billing.. 
	        System.out.println(); 
		System.out.print(lightash);
		System.out.println("                                                1.Confirm and Proceed		2.Go Back");
		System.out.println();
            	   System.out.print("Enter your Choice Here : ");
		System.out.print(def);
                   int y=sc.nextInt();
		   System.out.println();
            	   if(y==1)
            	   { 
               	      obj4.price(price*(float)(0.021)*items);
                      obj4.Booking();
                   }
            	   else
            	   {
               	     packagersMenu();
             	   } 
                
            }
           }
  }
  static void allIndiaparcels()
  {
     fetchingDetails();
     System.out.println();
     System.out.print(lightash);
     System.out.print("							Flamable,Toxic,Explosions,Liquid Items are NOT allowed");///here 
     System.out.println();
     System.out.print(def);
     dummypack2();
     
  }
  static void LogisticsmainSwitch()
   {
      System.out.print(lightash);
      System.out.println();
      System.out.println("                                                          Explore our services ");
      System.out.println();
      System.out.print(def);
      System.out.print(yellow);
      System.out.println("                                                                1.Trucks \n                                                                2.Two Wheelers \n                                                                3.Packers&Movers \n                                                                4.All India Parcel\n                                                                5.Main-Menu \n								6.Exit");
      System.out.println();
      System.out.print(def);
      System.out.print(lightash);
      System.out.print("Enter your Choice Here : ");
      System.out.print(def);
      int n=sc.nextInt();
      LogisticsOptions(n);
      
   }
  static void LogisticsOptions(int n)
   {
       int yy=0;
      switch(n)
      { 
          case(1):
          { 
             //trucks();
	     System.out.println();
	     if(yy==0);
             System.out.print(lightash);
	     System.out.println("							   Select your Ride type ");
	     System.out.println();
             System.out.println("                                                	1.Local 		2.Outstation ");
	     System.out.println();
   	     System.out.print("Enter your Choice here : ");
             System.out.print(def);
             int y=sc.nextInt();
             switch(y)
             {
                case(1):
                {
                   local();
                   break;
                }
 		case(2):
		{
                   outStation();
                   break;
		}
		default:
                {
                   yy=1;
		   System.out.print(blink);
                   System.out.print(red);
                   LogisticsOptions(1);
                   break;
                }

             }
             break;
          }
	  case(2):
          {  
             local();
             break;
          }
	  case(3):
          { 
	     System.out.println();
	     System.out.print(lightash);
             System.out.println("							Select your shifting needs");
	     System.out.println();
             System.out.println("                                                                1.Packing and Moving \n                                                                2.Mini Truck with Load Assit");
	     System.out.println();
             System.out.print("Enter your choice Here : ");
	     System.out.print(def);
             int r=sc.nextInt();
             if(r==1)
             {
		System.out.print(lightash);
                System.out.println();
                System.out.println("								Full fledged house shifting  service"); 
 		System.out.print(def);
                packagersMovers();
             }
             else
             {
		System.out.println();
		System.out.print(lightash);
		System.out.println("								Door to Door Loading-Unloading without packaging");
		System.out.print(def);
		 packagersMinimovers();
             }
             break;
          }
	  case(4):
          { 
            allIndiaparcels();
             break;
          }
	  case(5):
          { 
	     System.out.print(brightYellow);
                   System.out.print("									Returing to Mainpage."); 
	       			for(int i=1; i<=2; i++)
				{
		   		   try{
	 			   Thread.sleep(1500);
				}
		  		catch(InterruptedException e){}
				System.out.print(".");
				}
	       			System.out.println();
                                System.out.print(def);
				System.out.println();
             MainPage();
             break;
          }
	  case(6):
          {  
	     System.out.print(brightYellow);	
                   System.out.print("									Exiting the Application."); 
	       			for(int i=1; i<=2; i++)
				{
		   		   try{
	 			   Thread.sleep(1500);
				}
		  		catch(InterruptedException e){}
				System.out.print(".");
				}
	       			System.out.println();
                                System.out.print(def);
				System.out.println();
             System.exit(0);
             break;
          }
	  default:
          { 
             LogisticsmainSwitch();
             break;
          }
      }
   }
}
// logistics ends here;
class RuknaNahi 
{ 
   static Scanner sc=new Scanner(System.in);
    		static String def = "\u001B[0m";
		static String blink = "\u001B[5m";
		static String red = "\u001B[31m";
		static String green = "\u001B[32m";
		static String yellow = "\u001B[33m";
		static String blue = "\u001B[34m";
		static String purpe = "\u001B[35m";
		static String skblue = "\u001B[36m";
		static String brightGreen = "\u001B[92m"; // Bright green
		static String brightCyan = "\u001B[96m"; // Bright cyan
		static String brightYellow = "\u001B[93m"; // Bright yellow
		static String white = "\u001B[37m";
		static String cyan = "\u001B[36m";
		static String magenta = "\u001B[35m";
		static String brightRed = "\u001B[91m";
		static String brightBlue = "\u001B[94m";
		static String brightPurple = "\u001B[95m";
		static String brightWhite = "\u001B[97m";
		static String black = "\u001B[30m";
 		static String italic = "\u001B[3m";
		static String lightash = "\u001B[2m";
		static int message;
   static Booking obj2=new Booking();
   static String Username;
   static String pickuppoint ,droppoint ;
   static int pickuplocation ;
   static int droplocation;
   static float price,am;
   static int p1=500088,p2=500078,p3=505032,p4=500003,p5=500038,p6=500033,p7=500034,p8=500039,p9=500081,p10=500014;
   static private int pin=1947;
   static int getpin()
   {
      return pin;
   }
   void price(float a)
   {
       this.price=a;  
   }
   static void Nameofuser(String a)
   {
      Username=a;
   }
   static private long mobileno;
   RuknaNahi()
   {

   }
   static long getnumber()
   {
      return mobileno;
   }
   RuknaNahi(long mobileno)
   {
     this.mobileno=mobileno;
   }
   static int c=0;
   static long MobileNumber()
    {
        if(c==0)
        {
		System.out.println(); 
	  //System.out.print(italic); 
	System.out.print(lightash);             
        System.out.print("Enter your 10-digit Mobile number Here : "); 
        c=1;
        }
	System.out.print(def);
        long phoneNumber=sc.nextLong();
	System.out.println();
        if((phoneNumber >= 6000000000L && phoneNumber <= 9999999999L))
        {
               c=0;
               return phoneNumber;
        }
        else
        {
              System.out.print(blink);
              System.out.print(red);
              System.out.print("Please Enter a valid 10-digit Mobile number Here : ");
	      System.out.print(def);
              return MobileNumber();
        }
        
    }
   static int getOtp() 
   {
      Random rand = new Random();///int a=(int)(Math.random()*100000);
      int a = rand.nextInt(9000)+1000;
      return a;
   } 
   static boolean verifyOtp()
   { 
       int temp=getOtp();
       System.out.print(lightash);
       System.out.print("Thank you for chossing RuknaNahi Application Your OTP is : ");
       System.out.print(def); 
       System.out.print(temp);
       System.out.println();
       System.out.println(); 
       System.out.print(lightash); 
       System.out.print("Enter OTP sent to XXXXXX"+getnumber()%10000+" Here : "); 
       System.out.print(def); 
       int inp=sc.nextInt();
       System.out.println();
       System.out.print(brightYellow );
				System.out.print("									OTP is verifying."); 
	       			for(int i=1; i<=2; i++)
				{
		   		   try{
	 			   Thread.sleep(1500);
				}
		  		catch(InterruptedException e){}
				System.out.print(".");
				}
       if(temp==inp)
       {	
	  System.out.print(blink);
          System.out.print(yellow);
          System.out.println();
          System.out.println("Hoarry!!! You've Logged in sucessfuly ");
	  System.out.println();
          System.out.print(def);
          return true;
       }
       else
       {
          System.out.print(blink);
          System.out.print(red);
           System.out.println();
           System.out.println();
          System.out.println("								OTP Miss Matched please try again");
	  System.out.println();
          System.out.print(def);
          return verifyOtp();
       }       
   }
   static void CustomerSupport()
   {
       System.out.println();
       System.out.print(brightYellow); 
       System.out.println("						Hello "+Username+" Welcome to RuknaNahi 24/7 Customer support");
       System.out.print(def);
       System.out.print(lightash);  
       System.out.println();
       System.out.println("                                                        	Select your Qurries below");
       System.out.println();
      System.out.print(def);
      System.out.print(yellow);  
      System.out.println("								1.Full Ride history\n								2.Safety & Security\n								3.Payments & Wallets\n								4.Any Other Qurries \n								5.Main-menu \n								6.Exit");
       System.out.println();
       System.out.print(def);
       System.out.print(lightash); 
       System.out.print("Enter your choice here : ");   
       System.out.print(def); 
       int u=sc.nextInt();
       System.out.println();
       switch(u)
       {
         case(1):
         {
           System.out.print(brightYellow); 
           System.out.println("                                                        You Don't have any Rides from last 90 days..");
           System.out.println();
           System.out.print(def);
           System.out.print(lightash);  
           System.out.println("                                                		1.Go back 		2.Main-Menu");
           System.out.println();
           System.out.print("Enter your choice here : ");
           System.out.print(lightash); 
           int t=sc.nextInt();
	   System.out.println();
           if(1==t)
           CustomerSupport();
           else
	   {
           System.out.print(brightYellow);
                   System.out.print("									Returing to Mainpage."); 
	       			for(int i=1; i<=2; i++)
				{
		   		   try{
	 			   Thread.sleep(1500);
				}
		  		catch(InterruptedException e){}
				System.out.print(".");
				}
	       			System.out.println();
                                System.out.print(def);
				System.out.println();
           MainPage();
	   }
           break;
         }
	 case(2):
         {
           System.out.print(brightYellow); 
 	   System.out.println();
           System.out.println("                                              		Safety measures taken by Rangers : ");
	   System.out.println();
           System.out.print(def);
           System.out.print(lightash);  
           System.out.println("					We have mandated all our Rangers to abide by the following measures on every ride:\n\n					a. Wear a mask and a helmet while riding.\n					b. Update body temperature every day on RuknaNahi Ranger app.\n					c. Not just hands, but also wash the bikes everyday & ensure 100% hygiene on the ride.\n					d. Link RuknaNahi Ranger account with Aarogya Setu app for a government recommended COVID - 19 monitoring.");
           System.out.println(); 
           System.out.print(def);
           System.out.print(brightYellow); 
           System.out.println("                                                        Safety guidelines for customer : ");
           System.out.println(); 
            System.out.print(def);
           System.out.print(lightash); 
           System.out.println("					We recommend you to follow the guidelines for a safe ride with us:\n\n					a. Wear a mask that covers your nose and mouth.\n					b. Sanitize your hands before and after a ride.\n					c. Check your body temperature before stepping out for a ride.\n					d. Opt for contactless payment options.\n					e. We suggest you carry your helmet for safety purposes.\n					f.Do not travel outdoors if you have any symptoms of cold, cough, frequent sneezes or difficulty in breathing."); 
             
           System.out.println();
           System.out.println("                                                		1.Go back 		2.Main-Menu");
           System.out.println();
           System.out.print("Enter your choice here : ");
           System.out.print(def); 
           int t=sc.nextInt(); 
           System.out.println();
           if(1==t)
           CustomerSupport();
           else
	   {
	   System.out.print(brightYellow);
                   System.out.print("									Returing to Mainpage."); 
	       			for(int i=1; i<=2; i++)
				{
		   		   try{
	 			   Thread.sleep(1500);
				}
		  		catch(InterruptedException e){}
				System.out.print(".");
				}
	       			System.out.println();
                                System.out.print(def);
				System.out.println();
           MainPage();
	   }
           break;
         }
         case(3):
         {
           System.out.print(brightYellow); 
           System.out.println();
           System.out.println("                                              		No payments from past 90days");
           System.out.print(def); 
           System.out.print(lightash); 
           System.out.println();
           System.out.println("                                              		1.Go back 			2.Main-Menu");
           System.out.println();
           System.out.print("Enter your choice here : "); 
           System.out.print(def); 
           int t=sc.nextInt();
           System.out.println();
           if(1==t)
           CustomerSupport();
           else
	   {
	         System.out.print(brightYellow);
                   System.out.print("									Returing to Mainpage."); 
	       			for(int i=1; i<=2; i++)
				{
		   		   try{
	 			   Thread.sleep(1500);
				}
		  		catch(InterruptedException e){}
				System.out.print(".");
				}
	       			System.out.println();
                                System.out.print(def);
				System.out.println();
           MainPage();	
	   }
           break;
         }
         case(4):
         {
           System.out.print(brightYellow); 
           System.out.println("				   Please Enter your mobile/mail id here our support team will contact you with in 24hours"); 
           System.out.println();
           System.out.print(def); 
           System.out.print(lightash); 
           System.out.print("Enter Here : ");
           String contact=sc.next();
           System.out.println();
           System.out.print(lightash); 
           System.out.println("                                             		   1.Go back 		2.Main-Menu");
           System.out.println();
           System.out.print("Enter your choice here : ");
           System.out.print(def); 
           int t=sc.nextInt();
           System.out.println();
           if(1==t)
           CustomerSupport();
           else
           {
	   System.out.print(brightYellow);
                   System.out.print("									Returing to Mainpage."); 
	       			for(int i=1; i<=2; i++)
				{
		   		   try{
	 			   Thread.sleep(1500);
				}
		  		catch(InterruptedException e){}
				System.out.print(".");
				}
	       			System.out.println();
                                System.out.print(def);
				System.out.println();
           MainPage();
	   }
           break;
         }
         case(5):
         {
	   System.out.print(brightYellow);
                   System.out.print("									Returing to Mainpage."); 
	       			for(int i=1; i<=2; i++)
				{
		   		   try{
	 			   Thread.sleep(1500);
				}
		  		catch(InterruptedException e){}
				System.out.print(".");
				}
	       			System.out.println();
                                System.out.print(def);
				System.out.println();
           MainPage();
           break;
         }
         case(6):
         { 
	   System.out.print(brightYellow);	
                   System.out.print("									Exiting the Application."); 
	       			for(int i=1; i<=2; i++)
				{
		   		   try{
	 			   Thread.sleep(1500);
				}
		  		catch(InterruptedException e){}
				System.out.print(".");
				}
	       			System.out.println();
                                System.out.print(def);
				System.out.println();
           System.exit(0);
           break;
         }
         default:
         { 
 	   System.out.print(blink);
           System.out.print(red);
           CustomerSupport();
           break;
         }
       }
       
   }
   static void MainPage()
   { 
        System.out.println();
        System.out.print(yellow);
        System.out.println("Welcome,"+Username+"! RuknaNahi is thrilled to have you,"+Username+".Let's keep the wheels turning and the adventure never-ending.");
        System.out.print(def);
        System.out.println();  
        System.out.print(lightash);
        System.out.println("Explore our Services Below ");
	System.out.println();
        System.out.print(def); 
        System.out.print(yellow);
        System.out.print(italic);
	System.out.print(blink);
        System.out.println("	1.Ride Bokkings		2.Logistics		3.Vechile Breadkdown		4.Fuel Refill		5.CustomerSupport		6.Exit ");
	System.out.print(def);
	System.out.println();
        System.out.print(lightash);
        System.out.print("Enter Your Choice Here : ");
        System.out.print(def);
        int choice = sc.nextInt(); 
        switch(choice)
        {
             case(1):
             {
               //Ride bookings method will be called here
 
	       System.out.print(yellow);
               System.out.print("\u001B[7m");	
	       System.out.println("						                                                            ");
               System.out.println("						  Ride karne ka mood hai?,Explore our Booking services Here ");
	       System.out.println("						                                                            ");
               System.out.print(def);
               System.out.println(); 
               System.out.print(lightash);
		System.out.println("We only Have Service at following Areas these are pincode of the areas");
		System.out.println();
                System.out.print(def);
		 System.out.print(yellow);
		 System.out.print(italic);
		System.out.print(blink);
	       System.out.println("								KPHB COLONY    : 500088 \n								KUKATPALLY     : 500078\n								GACHIBOWLI     : 505032\n								SECUNDRABAD    : 500003\n								SR Nagar       : 500038 \n								Jubilee Hills  : 500033 \n								Banjara Hills  : 500034 \n								Uppal          : 500039 \n								Madhapur       : 500081 \n								Kompally       : 500014");
		 System.out.print(def);
               if(obj2.pickuplocation())
               {
		    message=1;
                    Booking obj7 =new Booking();
        	    obj7.options();
               } 
               break;
             }
             case(2):
             {
               //Logistics bookings method will be called here
	       System.out.print(yellow);
               System.out.print("\u001B[7m");	
		System.out.println("							                                         ");
		System.out.println("							  Delivery hai? Ho jayega,Just a tap     ");
		System.out.println("							                                         ");
                System.out.print(def);
                System.out.println(); 
		System.out.print(lightash);
		System.out.println("We only Have Service at following Areas these are pincode of the areas");
		System.out.println();
                System.out.print(def);
		 System.out.print(yellow);
		 System.out.print(italic);
		System.out.print(blink);
	       System.out.println("								KPHB COLONY    : 500088 \n								KUKATPALLY     : 500078\n								GACHIBOWLI     : 505032\n								SECUNDRABAD    : 500003\n								SR Nagar       : 500038 \n								Jubilee Hills  : 500033 \n								Banjara Hills  : 500034 \n								Uppal          : 500039 \n								Madhapur       : 500081 \n								Kompally       : 500014");

		 System.out.print(def);
                if(obj2.pickuplocation())
                {	
			 message=2;
			Logisticss objl =new Logisticss();
                        objl.LogisWelcome() ;
                 } 
                break;
             } 
             case(3):
             {
               //Vechile breakdown method will be called here
	       System.out.print(yellow);
               System.out.print("\u001B[7m");
               System.out.println("				                                                                                             ");	
               System.out.println("				  Vehicle breakdown? Koi baat nahi, hum yahaan hai! Bas ek tap aur hum set kar denge, yaar!  ");
	       System.out.println("				                                                                                             ");
                System.out.print(def);
		System.out.println(); 
		System.out.print(lightash);
		System.out.println("We only Have Service at following Areas these are pincode of the areas");
		System.out.println();
                System.out.print(def);
		 System.out.print(yellow);
		 System.out.print(italic);
		System.out.print(blink);
	       System.out.println("								KPHB COLONY    : 500088 \n								KUKATPALLY     : 500078\n								GACHIBOWLI     : 505032\n								SECUNDRABAD    : 500003\n								SR Nagar       : 500038 \n								Jubilee Hills  : 500033 \n								Banjara Hills  : 500034 \n								Uppal          : 500039 \n								Madhapur       : 500081 \n								Kompally       : 500014");
		 System.out.print(def);
                if(obj2.pickuplocation())
                {
		     message=3;
		    VechileBreakdown.LogisWelcome();

                 } 

                break;
             }
             case(4):
             {
	       System.out.print(yellow);
               System.out.print("\u001B[7m");	
               System.out.println("						                                                                    ");
	       System.out.println("						   Fuel khatam hone waala hai? Just tap kar,aur rest hum dekhenge!  ");
	       System.out.println("						                                                                    ");
               System.out.print(def);
               //Fuel Refill method will be called here 
		System.out.println(); 
		System.out.print(lightash);
		System.out.println("We only Have Service at following Areas these are pincode of the areas");
		System.out.println();
                System.out.print(def);
		 System.out.print(yellow);
		 System.out.print(italic);
		System.out.print(blink);
	      System.out.println("								KPHB COLONY    : 500088 \n								KUKATPALLY     : 500078\n								GACHIBOWLI     : 505032\n								SECUNDRABAD    : 500003\n								SR Nagar       : 500038 \n								Jubilee Hills  : 500033 \n								Banjara Hills  : 500034 \n								Uppal          : 500039 \n								Madhapur       : 500081 \n								Kompally       : 500014");
		 System.out.print(def);
                if(obj2.pickuplocation())
                {
			 message=4;
			FuelRefill.LogisWelcome();
                 } 
                break;
             }
             case(5):
             {
                //customer support
                CustomerSupport();
                break;
             }
             case(6):
             {
	        System.out.print(brightYellow);	
                   System.out.print("									Exiting the Application."); 
	       			for(int i=1; i<=2; i++)
				{
		   		   try{
	 			   Thread.sleep(1500);
				}
		  		catch(InterruptedException e){}
				System.out.print(".");
				}
	       			System.out.println();
                                System.out.print(def);
				System.out.println();
                System.exit(0);
                break;
             }
             default:
             {
               System.out.print(blink);
               System.out.print(red);
               System.out.println("Opps!!,You've Choosen Invalid Option please retry");
               System.out.print(def);
	       System.out.print(brightYellow);
                   System.out.print("									Returing to Mainpage."); 
	       			for(int i=1; i<=2; i++)
				{
		   		   try{
	 			   Thread.sleep(1500);
				}
		  		catch(InterruptedException e){}
				System.out.print(".");
				}
	       			System.out.println();
                                System.out.print(def);
				System.out.println();
               MainPage();
               break;
             }
        }
   }
   static void payment(int a)
   {
      switch(a)
      {
          case(1):
          { 
	     System.out.print(lightash);
             System.out.println("					1.Would like to continue		2.Go back and choose any other payment method ");
             System.out.print("Enter your choice here : ");
	     System.out.print(def);
             int u=sc.nextInt();
             if(u==1)
             {
	       System.out.print(yellow);
		System.out.println();
               System.out.println("Thank you for choosing our service");
	       System.out.print(def);
             }
             else
             {
		System.out.print(lightash);
               System.out.println("							Choose a Payment method"); 
		System.out.println();
		System.out.print(def);
				System.out.print(yellow);
               			System.out.println("									1.Cash \n									2.Phonepe \n									3.Googlepay \n									4.Paytm \n									5.RuknaNahi Wallet");
				System.out.print(def);
               System.out.print("Enter your choice here : ");
               int t=sc.nextInt();
               payment(t); 
             }
             break;
          }
     case(2):
          { 
	     System.out.print(lightash);
             System.out.println("					1.Would like to continue		2.Go back and choose any other payment method ");
	    System.out.println(); 
	    System.out.print("Enter your choice here : ");
	    System.out.print(def);
             int u=sc.nextInt();
             if(u==1)
             {
	       System.out.print(lightash);
	       System.out.println();
               System.out.println("Redirecting to Phonepe ending with XXXXXX"+getnumber()%10000);
		System.out.println();
               Upi(price);
	       System.out.print(def);
             }
             else
             {
              System.out.print(lightash);
               System.out.println("						Choose a Payment method"); 
		System.out.println();
		System.out.print(def);
				System.out.print(yellow);
               			System.out.println("								1.Cash \n								2.Phonepe \n								3.Googlepay \n								4.Paytm \n								5.RuknaNahi Wallet");
				System.out.print(def);
		System.out.print(lightash);
		System.out.println();
               System.out.print("Enter your choice here : ");
		System.out.print(def);
               int t=sc.nextInt();
               payment(t); 
             }
             break;
          }
     case(3):
          {  
	     System.out.print(lightash);
             System.out.println("					1.Would like to continue		2.Go back and choose any other payment method ");
             System.out.println();
	     System.out.print("Enter your choice here : ");
	     System.out.print(def);
             int u=sc.nextInt();
             if(u==1)
             {
		System.out.print(lightash);
		System.out.println();
               System.out.println("Redirecting to Googleplay ending with XXXXXX"+getnumber()%10000);
		System.out.println();
               Upi(price);
		System.out.print(def);
             }
             else
             {
               System.out.print(lightash);
               System.out.println("						Choose a Payment method"); 
		System.out.println();
		System.out.print(def);	
				System.out.print(yellow);
               			System.out.println("								1.Cash \n								2.Phonepe \n								3.Googlepay \n								4.Paytm \n								5.RuknaNahi Wallet");
				System.out.print(def);
		System.out.print(lightash);
		System.out.println();
               System.out.print("Enter your choice here : ");
		System.out.print(def);
               int t=sc.nextInt();
               payment(t); 
             }
             break;
          }
     case(4):
          { 
	     System.out.print(lightash);
             System.out.println("					1.Would like to continue		2.Go back and choose any other payment method ");
             System.out.println();
	     System.out.print("Enter your choice here : ");
	     System.out.print(def);
             int u=sc.nextInt();
             if(u==1)
             {
	       System.out.print(lightash);
		System.out.println();
               System.out.println("Redirecting to Paytm ending with XXXXXX"+getnumber()%10000);
               Upi(price);
		System.out.print(def);
             }
             else
             {
             System.out.print(lightash);
               System.out.println("						Choose a Payment method"); 
		System.out.println();
		System.out.print(def);
				System.out.print(yellow);
               			System.out.println("								1.Cash \n								2.Phonepe \n								3.Googlepay \n								4.Paytm \n								5.RuknaNahi Wallet");
		System.out.print(def);
		System.out.print(lightash);
		System.out.println();
               System.out.print("Enter your choice here : ");
		System.out.print(def);
               int t=sc.nextInt();
               payment(t); 
             }
             break;
          } 
          case(5):
          {
             System.out.print(blink);
             System.out.print(red);
		System.out.println();
             System.out.println("Sorry,You've Not Have Sufficient Amount to Complete this transcation Please Recharge your wallet");
             System.out.print(def);
	    System.out.println();
           System.out.print(lightash);
            System.out.println("					1.Would like to continue		2.Go back and choose any other payment method ");
             System.out.println();
	     System.out.print("Enter your choice here : ");
	     System.out.print(def);
             int u=sc.nextInt();
             if(u==1)
             {
		System.out.println();
		System.out.print(lightash);
                System.out.println("Welcome to RuknaNahi wallet you will get upto 25% cashback on every transcation");
		System.out.print(def);
                Amountcomfrm();
             }
             else
             {
               System.out.print(lightash);
               System.out.println("						Choose a Payment method"); 
		System.out.println();
		System.out.print(def);
				System.out.print(yellow);
               			System.out.println("								1.Cash \n								2.Phonepe \n								3.Googlepay \n								4.Paytm \n								5.RuknaNahi Wallet");
				System.out.print(def);
		System.out.print(lightash);
		System.out.println();
	       System.out.print("Enter your choice here : ");
		System.out.print(def);
               int t=sc.nextInt();
               payment(t); 
             }
             break;
          }
          default:
          { 
             System.out.print(blink);
             System.out.print(red);
	     System.out.println();
             System.out.println("					 Opps!!,Choose a Payment method"); 
	     System.out.println();
	     System.out.print(def);
				System.out.print(yellow);
               			System.out.println("								1.Cash \n								2.Phonepe \n								3.Googlepay \n								4.Paytm \n								5.RuknaNahi Wallet");
	    System.out.print(def);
	     System.out.print(lightash);
	     System.out.println();
             System.out.print("Enter your choice here : ");
	     System.out.print(def);
             int t=sc.nextInt();
             payment(t);
             break;
          }
      }
   }
   static void Upi(float am)
   {
     
      System.out.print(lightash);
      System.out.println();
      System.out.printf("Amount of : %.2f",price);
      System.out.println();
      System.out.println();
      System.out.println("Hint : In which year India got Independence");
      System.out.println();
      System.out.print("Please enter your 4-digit UPI pin here : ");
      System.out.print(def);
      int y=sc.nextInt();
      if(y==getpin())
      {
         System.out.print(brightYellow);
	System.out.println();
         System.out.printf("Your transaction of %.2fRs has been sucessfully completed",price);
	 System.out.println();
	System.out.println();
         System.out.println("Thank you for chossing our services");
	 System.out.print(def);
      }
      else
      {
         System.out.print(blink);
         System.out.print(red);
	System.out.println();
         System.out.println("Please enter a valid 4-digit UPI pin");
         System.out.print(def);
         Upi(price);
      }
   } static int yy=0;
   static void Amountcomfrm()
   {
       
	System.out.println();
        if(yy==0)
	System.out.print(lightash);
        System.out.print("Atleast Rechagre to complete this paymetns of  : ");
	System.out.print(def);
	System.out.printf("%.2f",price);
	System.out.println();
	System.out.print(lightash);
	System.out.println();
        System.out.print("Please Enter the Amount would you like to recharge here : ");
	System.out.print(def);
        am=sc.nextFloat();
        if(am>=price&&am>=100)
        {
          walletRecharge();
        }
        else
        {
          System.out.print(blink);
          System.out.print(red);
	  System.out.println();
          yy=1;
          System.out.println("Minimum Recharge Amount is 100rs");
          Amountcomfrm();
        }
   }
   static int checkDigits(long n)
   {
     int count=0;
     while(n>0)
     {
        n/=10;
        count++;
     }
     return count;
   }
   
   static void Cvv()
   {
     int yy=0;
     System.out.println();
     if(yy==0)
     System.out.print(lightash);
     System.out.println();
     System.out.print("Enter your 3-Digits CVV here : ");
     System.out.print(def);
     int c=sc.nextInt();
     if(checkDigits(c)==3)
     {
        int o=getOtp();
	System.out.println();
	System.out.print(lightash);
        System.out.println("Note : Card will be saved and tokenised as per RBI regulations.Cvv will not be saved");
	System.out.println();
        System.out.println("                                                1.Pay without saving                      2.Pay & Save");
	System.out.println();
	 System.out.print(lightash);
        System.out.print("Enter your choice here : ");
	System.out.print(def);
        int y2=sc.nextInt();
	System.out.println();
        System.out.print(lightash);
        System.out.print("Your OTP is for Transcation of "+am+" Rs is ");
        System.out.print(def);
        System.out.print(o);
        System.out.println();
	System.out.println();
	System.out.print(lightash);
        System.out.print("Please enter the OTP we have sent to Registered Number XXXXXX"+getOtp()+" : ");
        System.out.print(def);
        int y=sc.nextInt();
        if(y==o)
        {
          System.out.print(yellow);
	  System.out.println();
          System.out.println("Sucessfully "+am+" Rs was added into your wallet");
	  System.out.println();
          System.out.printf("Transcation of %.2f has been completed sucessfully \n\nRewareded CashBack of %.2fRs\n",price,price*(0.25));
	  System.out.println(def);
        }
	else
        {
          System.out.print(blink);
          System.out.print(red);
	  System.out.println();
          y=1;
          System.out.println("opps!!,Please Try agian");
          Cvv();
        }
     }
     else
     {
       yy=1;
       System.out.print(blink);
       System.out.print(red);
       Cvv();
     }
   }
   static void Exp()
   {
    int yy=0;
    System.out.println();
    if(yy==0)
    System.out.print(lightash);
    System.out.print("Enter your card Exipiry as MMYY here : "); 
    System.out.print(def);
    int p=sc.nextInt();
    if(checkDigits(p)==4)
    {
      Cvv();
    }
    else
    {
      System.out.print(blink);
      yy=1;
      System.out.print(red);
      Exp();
    }
   }
   static void Card()
   {
      int yy=0;
      System.out.println();
      if(yy==0)
      System.out.print(lightash);
      System.out.print("Enter you 16digits Creditcard/Debitcard Number Here : ");
      System.out.print(def);
      long num=sc.nextLong(); 
      if(checkDigits(num)==16)
      {
        Exp();
      }
      else
      {
         System.out.print(blink);
         System.out.print(red);
         yy=1;
         Card();
      }
   }
   static void walletRecharge()
   {
	System.out.println();
	System.out.print(lightash);
       System.out.println("						Please enter your mode payment for recharging the wallet");
       System.out.print(def);
	System.out.println();
	System.out.print(yellow);
       System.out.println("								1.Phonepe\n								2.Googlepay\n								3.Paytm\n								4.Credit/Debit cards");
	System.out.println();
        System.out.print(def);
	System.out.print(lightash);
       System.out.print("Enter your choice here : ");
	System.out.print(def);
       int u=sc.nextInt();
       switch(u)
       {
         case(1):
         {
	    System.out.println();
	    System.out.print(lightash);
            System.out.println("Redirecting to Phonepe ending with XXXXXX"+getnumber()%10000);
	    System.out.print(def);
            Upi(price);
	    System.out.println();
	    System.out.print(yellow);
            System.out.printf("Hurray!!,Rewareded CashBack of %.2fRs",price*(0.25));
	    System.out.print(def);
	    System.out.println();
            break;
         }
         case(2):
         {
	    System.out.println();
	    System.out.print(lightash);
            System.out.println("Redirecting to Googlepay ending with XXXXXX"+getnumber()%10000);
	    System.out.print(def);
            Upi(price);
            System.out.println();
	    System.out.print(yellow);
            System.out.printf("Hurray!!,Rewareded CashBack of %.2fRs",price*(0.25));
	    System.out.print(def);
	    System.out.println();
            break;
         }
         case(3):
         {
            System.out.println();
	    System.out.print(lightash);
            System.out.println("Redirecting to Paytm ending with XXXXXX"+getnumber()%10000);
	   System.out.print(def);
            Upi(price);
	    System.out.println();
	    System.out.print(yellow);
	    System.out.printf("Hurray!!,Rewareded CashBack of %.2fRs",price*(0.25));
	   System.out.print(def);
	    System.out.println(); 	
            break;
         }
         case(4):
         {
            Card();
            break;
         }
         default:
         {
           System.out.print(blink);
           System.out.print(red);
           walletRecharge();
           break;
         }
       }
       
   }
   String randomName()
   {
      int a=(int)(Math.random()*5);
      if(a==1)
       return "Bobilli Shiva";
      if(a==2)
       return "VenuGopal";
      if(a==3)
       return "D.Raju";
      if(a==4)
       return "Shanker Kodangal";
      if(a==5)
       return "U.Balu";
      else
       return randomName();
   }
   boolean dotp()
   {
     int y=getOtp();
     System.out.print(lightash);
     System.out.print("Our Ranger has Reached your Location "+pickuppoint+" Your OTP is ");
     System.out.print(def);
     System.out.print(y);
     System.out.println();
     System.out.print(lightash);
      System.out.println();
     System.out.print("Enter Your OTP sent to XXXXXX"+getnumber()%10000+" : ");
     System.out.print(def);
     int s=sc.nextInt(); 
     System.out.print(brightYellow );
				System.out.print("									OTP is verifying."); 
	       			for(int i=1; i<=2; i++)
				{
		   		   try{
	 			   Thread.sleep(1500);
				}
		  		catch(InterruptedException e){}
				System.out.print(".");
				}
     if(s==y)
     return true;
     else 
     System.out.print(blink);
     System.out.print(red);
     System.out.println();
     System.out.println(); 
     System.out.println("									Invalid OTP please retry"); 
     System.out.print(def);           
     return dotp();
   }
   void Booking()
   {
               int a=(int)(Math.random()*10);
		System.out.print(brightYellow );
	       System.out.print("							Searching for a Ranger near by your locality."); 
	       for(int i=1; i<=3; i++)
		{
		   try{
	 		Thread.sleep(1500);
		}
		  catch(InterruptedException e){}
		System.out.print(".");
		}
	       System.out.println(); 
	       System.out.println(); 
               System.out.println("							Our Ranger will reach you out soon!!");
	       System.out.println();
	       System.out.print(yellow);
               System.out.println("								Ranger name    : "+randomName());
               System.out.printf("								Vechile Number : TS %d RT %d\n",(a+57),getOtp());
               System.out.printf("								Estimated Time : %d mins\n",(a+19));
               System.out.printf("								Fare 	       : %.2f ",price);
               System.out.print(def);
	       System.out.println();
               System.out.println(); 
               System.out.print(lightash); 
 	       System.out.println("						1.Continue			2.Cancel Bokking");
	       System.out.println();
               System.out.print("Enter your choice here : ");
		System.out.print(def); 
		int yu=sc.nextInt();
		System.out.println();
		System.out.print(brightYellow );
		 

               if(yu==1)
               {
			System.out.print("									He is Almost there."); 
	       			for(int i=1; i<=2; i++)
				{
		   		   try{
	 			   Thread.sleep(1500);
				}
		  		catch(InterruptedException e){}
				System.out.print(".");
				}
	       			System.out.println();
                                System.out.print(def);
				System.out.println();
               		if(dotp())
               		{
				System.out.println();
	       			System.out.println();
    				System.out.println(); 
               			System.out.println("								OTP is verified Sucessfully");
				System.out.println();
               			System.out.println("							Your Ride has been started from "+pickuppoint+" to "+droppoint);
				System.out.println();
				
                                if(message==1)
				{
				  System.out.print("							You will reach your destination in "+(a+27)+"mins");
	       			for(int i=0; i<=5; i++)
				{
		   		   try{
	 			   Thread.sleep(1500);
				}
		  		catch(InterruptedException e){}
				System.out.print(".");
				}
                                System.out.println(); 
	       			System.out.println();
               			System.out.println("							Hurray!!!  Your Ride has been completed sucessfully ");
				System.out.println(); 
				}
				else if(message==2)
				{
				System.out.print("							Your package will reach the destination in "+(a+27)+"mins");
	       			for(int i=0; i<=5; i++)
				{
		   		   try{
	 			   Thread.sleep(1500);
				}
		  		catch(InterruptedException e){}
				System.out.print(".");
				}
                                System.out.println(); 
	       			System.out.println();
				System.out.println("							Hurray!!!  Your package has reached its destination, journey complete!");
				System.out.println(); 
				}
				else if(message==3)
				{
				System.out.print("							Your Vechile's issue will be resloved  in "+(a+27)+"mins");
	       			for(int i=0; i<=5; i++)
				{
		   		   try{
	 			   Thread.sleep(1500);
				}
		  		catch(InterruptedException e){}
				System.out.print(".");
				}
                                System.out.println(); 
	       			System.out.println();
				System.out.println("							Hurray!!!  Your vehicle's issue has been resolved! Happy driving!");
				System.out.println(); 
				}
				else if(message==4)
				{
				System.out.print("							Your vechile will be refuealed in few mins");
	       			for(int i=0; i<=5; i++)
				{
		   		   try{
	 			   Thread.sleep(1500);
				}
		  		catch(InterruptedException e){}
				System.out.print(".");
				}
                                System.out.println(); 
	       			System.out.println();
				System.out.println("							Hurray!!!  Your vehicle has been refueled and is ready to hit the road!");
				System.out.println(); 
				}
				else
				{
				System.out.print("							Your vechile will be recharged in "+(a+27)+"mins");
	       			for(int i=0; i<=5; i++)
				{
		   		   try{
	 			   Thread.sleep(1500);
				}
		  		catch(InterruptedException e){}
				System.out.print(".");
				}
                                System.out.println(); 
	       			System.out.println();
				System.out.println("							Hurray!!!  Your vehicle has been recharged and is ready to hit the road!");
				System.out.println(); 
				}
				System.out.print(def);
 				System.out.print(lightash);
				System.out.println("							Choose a Payment method"); 
				System.out.print(def);
                                System.out.println();
				System.out.print(yellow);
               			System.out.println("								1.Cash \n								2.Phonepe \n								3.Googlepay \n								4.Paytm \n								5.RuknaNahi Wallet");
				System.out.print(def);
				System.out.println(); 
				System.out.print(lightash);
               			System.out.print("Enter your choice here : ");
				System.out.print(def);
               			int t=sc.nextInt();
                                System.out.println();
               			payment(t);
              		 }
		System.out.println(); 
		System.out.print(lightash);
               System.out.print("Please rate us by entering stars: Enter between 1 to 5 stars Here :  ");
	       System.out.print(def);
               String stars = sc.next(); 
               int limit = Math.min(stars.length(), 5);
               String firstStars = stars.substring(0, limit);
	      System.out.println(); 
		System.out.print(brightYellow);
               System.out.println("							Thank you for your feedback " + firstStars);
	       System.out.println(); 
		System.out.print(def);
               System.out.print(yellow);
               System.out.print("\u001B[7m");	
	       System.out.println("					                                                                           ");
	       System.out.println("					    Knock, Knock! More features await or Shall we close the door for now?  ");
	       System.out.println("					                                                                           ");
               System.out.print(def);
               System.out.println(); 
	       System.out.println(); 
	       System.out.print(brightYellow);
               System.out.println("						1.Main-menu				2.Exit");
               System.out.print(lightash);
		System.out.print("Enter your choice here : ");
	       System.out.print(def);
               int uu=sc.nextInt();
                 if(uu==2)
                 {
		    System.out.print(brightYellow);	
                   System.out.print("									Exiting the Application."); 
	       			for(int i=1; i<=2; i++)
				{
		   		   try{
	 			   Thread.sleep(1500);
				}
		  		catch(InterruptedException e){}
				System.out.print(".");
				}
	       			System.out.println();
                                System.out.print(def);
				System.out.println();

                  System.exit(0);
                 }
                 else
                 {
		    System.out.print(lightash);
                   System.out.print("									Returing to Mainpage."); 
	       			for(int i=1; i<=2; i++)
				{
		   		   try{
	 			   Thread.sleep(1500);
				}
		  		catch(InterruptedException e){}
				System.out.print(".");
				}
	       			System.out.println();
                                System.out.print(def);
				System.out.println();
                  MainPage();
                 }
                }
                else
                {
		    System.out.print(lightash);
		    System.out.print("									Returing to Mainpage."); 
	       			for(int i=1; i<=2; i++)
				{
		   		   try{
	 			   Thread.sleep(1500);
				}
		  		catch(InterruptedException e){}
				System.out.print(".");
				}
	       			System.out.println();
                                System.out.print(def);
				System.out.println();

                    MainPage();
                }
   }
   boolean pickupdroppoint()
   {
	System.out.println(); 
       System.out.print(lightash); 
       System.out.print("Enter Pickup point : ");
       System.out.print(def); 
       pickuppoint = sc.next(); 
	System.out.println(); 
 	System.out.print(lightash); 
       System.out.print("Enter Drop point : ");
	System.out.print(def); 
       droppoint= sc.next();
	System.out.println();
       System.out.print(lightash);  
       System.out.println("						1.Comfirm Your Location			2.Re-enter Again");
       System.out.println();
       System.out.print("Enter your choice here : ");
	System.out.print(def); 
       int y=sc.nextInt();
       if(y==1)
       { 
          return true;     
       }
       else
       {
           return pickupdroppoint();
       }
   }
   boolean pickuplocation()
   {
      System.out.println();
      System.out.print(lightash);  
      System.out.print("Enter your pickup pincode Here : ");
      System.out.print(def); 
      int t=sc.nextInt();
      if(t==p1||t==p2||t==p3||t==p4||t==p5||t==p6||t==p7||t==p8||t==p9||t==p10)
      {
        this.pickuplocation=t;
        return droplocation();
      }
      else
      {
        System.out.print(blink);
        System.out.print(red);
	System.out.println(); 
        System.out.println("Sorry,we don't have acess at your location ");
        System.out.print(def);
	System.out.println();
        System.out.print(lightash);   
        System.out.println("		1.Checking with Another location			2.Main Menu				3.Exit");
	System.out.println(); 
        System.out.print("Enter you choice Here : ");
        System.out.print(def);  
        int p=sc.nextInt();
        if(p==1)
        {
           return pickuplocation();
        }
        else if(p==2)
        {
	   System.out.print(brightYellow);
                   System.out.print("									Returing to Mainpage."); 
	       			for(int i=1; i<=2; i++)
				{
		   		   try{
	 			   Thread.sleep(1500);
				}
		  		catch(InterruptedException e){}
				System.out.print(".");
				}
	       			System.out.println();
                                System.out.print(def);
				System.out.println();
           MainPage();
	    return false;
        }
        else
        {
	   System.out.println();
           System.out.print(lightash);   
           System.out.println("Do you want to Really Exit the apllication");
	   System.out.println();
           System.out.println("                                                1.Yes			2.Not Really");
	   System.out.print(def);  
           int u=sc.nextInt();
           if(u==1)
           {
	   System.out.print(brightYellow);	
                  System.out.print("									Exiting the Application."); 
	       			for(int i=1; i<=2; i++)
				{
		   		   try{
	 			   Thread.sleep(1500);
				}
		  		catch(InterruptedException e){}
				System.out.print(".");
				}
	       			System.out.println();
                                System.out.print(def);
				System.out.println();

           System.exit(0);
           }
           else
           {
	   System.out.print(brightYellow);
                   System.out.print("									Returing to Mainpage."); 
	       			for(int i=1; i<=2; i++)
				{
		   		   try{
	 			   Thread.sleep(1500);
				}
		  		catch(InterruptedException e){}
				System.out.print(".");
				}
	       			System.out.println();
                                System.out.print(def);
				System.out.println();
           MainPage();
           }
           return false;
        }
    
      }
   }
   boolean droplocation()
   {
      System.out.println(); 
      System.out.print(lightash);
      System.out.print("Enter your drop pincode Here : ");
      System.out.print(def);
      int w=sc.nextInt();
      if(w==p1||w==p2||w==p3||w==p4||w==p5||w==p6||w==p7||w==p8||w==p9||w==p10)
      {
        droplocation=w;
        this.pickuplocation=pickuplocation;
        this.droplocation=droplocation;
         return true;
      }
      else
      {
        System.out.print(blink);
        System.out.print(red);
	System.out.println(); 
        System.out.println("Sorry,we don't have acess at your location");
	System.out.println(); 
        System.out.print(def);
        System.out.print(lightash);
        System.out.println("		1.Checking with Another location			2.Main Menu				3.Exit");
	System.out.println(); 
        System.out.print("Enter you choice Here : ");
        System.out.print(def);
        int p=sc.nextInt();
        if(p==1)
        {
           return droplocation();
        }
        else if(p==2)
        {
           return pickuplocation();
        }
        else if(p==3)
        {
	  System.out.print(brightYellow);
                   System.out.print("									Returing to Mainpage."); 
	       			for(int i=1; i<=2; i++)
				{
		   		   try{
	 			   Thread.sleep(1500);
				}
		  		catch(InterruptedException e){}
				System.out.print(".");
				}
	       			System.out.println();
                                System.out.print(def);
				System.out.println();
          MainPage();
          return false;
        }
        else
        {	
	   System.out.println(); 
	   System.out.print(lightash);
           System.out.println("Do you want to Really Exit the apllication");
	   System.out.println();
           System.out.println("                                                1.Yes			2.Not Really");
	   System.out.print(def);
           int u=sc.nextInt();
           if(u==1)
           {
           System.out.print(brightYellow);	
                   System.out.print("									Exiting the Application."); 
	       			for(int i=1; i<=2; i++)
				{
		   		   try{
	 			   Thread.sleep(1500);
				}
		  		catch(InterruptedException e){}
				System.out.print(".");
				}
	       			System.out.println();
                                System.out.print(def);
				System.out.println();

           System.exit(0);
           }
           else
           {
	   System.out.print(brightYellow);
                   System.out.print("									Returing to Mainpage."); 
	       			for(int i=1; i<=2; i++)
				{
		   		   try{
	 			   Thread.sleep(1500);
				}
		  		catch(InterruptedException e){}
				System.out.print(".");
				}
	       			System.out.println();
                                System.out.print(def);
				System.out.println();
           MainPage();
           }
           return false;
        }

      } 
   }
  
}
class Booking extends RuknaNahi
{
   static Booking objb =new Booking();
   static Scanner sc=new Scanner(System.in);
   int pickuplocation,droplocation;
   void options()
   {
      price(getOtp());
      System.out.println(); 
      System.out.print(lightash); 
      System.out.print("Pickup pincode You've Entered : ");
      System.out.print(def); 
      System.out.print(RuknaNahi.pickuplocation);
      System.out.println();
      System.out.println();
      System.out.print(lightash); 
      System.out.print("Drop pincode You've Entered : ");
      System.out.print(def); 
      System.out.print(RuknaNahi.droplocation);
      System.out.println();
      System.out.println(); 
      System.out.print(lightash); 
      System.out.println("	1.Confrim Your Pickup&Drop pincodes's	      2.Modifying Drop pincode	       3.Modifying Pincodes	    4.Main-Menu		5.Exit"); 
      System.out.print(def);	
     System.out.println(); 
     System.out.print(lightash);
      System.out.print("Enter your Choice Here : ");
     System.out.print(def); 
      int c=sc.nextInt();
      switch(c)
      {
          case(1):
          {
             if(pickupdroppoint())
             {

             int a=(int)(Math.random()*10);
	     System.out.println(); 
	      System.out.print(yellow);
	     System.out.print(italic);
	     System.out.print(blink);
	     System.out.printf("								1.Bike - %d mins Away %.2f Rs\n",(a+12),price*(0.017));
             System.out.printf("								2.Auto - %d mins Away %.2f Rs\n",(a+19),price*(0.029));
     	     System.out.printf("								3.Cab  - %d mins Away %.2f Rs\n",(a+26),price*(0.041));
      	     System.out.println("								4.Main Menu\n								5.Exit"); 
	     System.out.println(); 
	      System.out.print(def);
             System.out.print(lightash); 
             System.out.print("Enter your choice here : ");
            }
            else
            {
               pickupdroppoint();
            }
             System.out.print(def); 
             int ch=sc.nextInt();
            switch(ch)
            { 
         case(1):
         {
	    System.out.println();
            System.out.print(lightash);  
            System.out.println("						1.Confirm Booking a Bike		2.Go Back");
	   System.out.println();
            System.out.print("Enter your Choice Here : ");
             System.out.print(def);
            int y=sc.nextInt();
            if(y==1)
            { 
               price(price*(float)(0.017));
               Booking();
            }
            else
            {
               options();
            }
              break;
            }
           case(2):
           {
            System.out.println(); 
            System.out.print(lightash); 
            System.out.println("						1.Confirm Booking a Auto		2.Go Back");
	    System.out.println();
            System.out.print("Enter your Choice Here : ");
            System.out.print(def); 
            int y=sc.nextInt();
            if(y==1)
            {
               price(price*(float)(0.029));
               Booking();
            }
            else
            {
               options();
            }
            break;
           }
           case(3):
           {
            System.out.println(); 
            System.out.print(lightash); 
            System.out.println("						1.Confirm Booking a Cab 		2.Go Back");
	    System.out.println();
            System.out.print("Enter your Choice Here : "); 
 	    System.out.print(def); 
            int y=sc.nextInt();
            if(y==1)
            {
               price(price*(float)(0.041));
               Booking();
            }
            else
            {
               options();
            }
             break;
           }
           case(4):
           {
	    System.out.print(brightYellow);
                   System.out.print("									Returing to Mainpage."); 
	       			for(int i=1; i<=2; i++)
				{
		   		   try{
	 			   Thread.sleep(1500);
				}
		  		catch(InterruptedException e){}
				System.out.print(".");
				}
	       			System.out.println();
                                System.out.print(def);
				System.out.println();
            MainPage();
            break;
           }
           case(5):
           {
	     System.out.print(brightYellow);	
                  System.out.print("									Exiting the Application."); 
	       			for(int i=1; i<=2; i++)
				{
		   		   try{
	 			   Thread.sleep(1500);
				}
		  		catch(InterruptedException e){}
				System.out.print(".");
				}
	       			System.out.println();
                                System.out.print(def);
				System.out.println();

            System.exit(0);
            break;
           }
           default:
           {
            options(); 
            break;
           }
           }
             break;
           }
           case(2):
          {
            if(droplocation())
	    options(); 
	    break;
          }
          case(3):
          {
             if(pickuplocation())
	     options();
	    break;
          }
          case(4):
          {
	    System.out.print(brightYellow);
                   System.out.print("									Returing to Mainpage."); 
	       			for(int i=1; i<=2; i++)
				{
		   		   try{
	 			   Thread.sleep(1500);
				}
		  		catch(InterruptedException e){}
				System.out.print(".");
				}
	       			System.out.println();
                                System.out.print(def);
				System.out.println();
            MainPage();
	    break;
          }
          case(5):
          {
	    System.out.print(brightYellow);	
                   System.out.print("									Exiting the Application."); 
	       			for(int i=1; i<=2; i++)
				{
		   		   try{
	 			   Thread.sleep(1500);
				}
		  		catch(InterruptedException e){}
				System.out.print(".");
				}
	       			System.out.println();
                                System.out.print(def);
				System.out.println();

            System.exit(0);
	    break;
          }
          default:
          {
 	    System.out.print(blink);
            System.out.print(red);
            options();
            break;
          }
      }
      
   }
}
class User extends RuknaNahi
{
   User()
   {
      super(MobileNumber());
   }
   public static void main(String args[])
   { 
        System.out.println();
        System.out.print(yellow);
        System.out.print("\u001B[7m");	
        System.out.println("	                                                                                                                                                ");
        System.out.println("	                 Welcome to Rukanahi : where rides are art, logistics are ballet, fuel is magic, and breakdowns vanish into thin air.           ");
        System.out.println("	                                                                                                                                                ");
	System.out.print(def);
        System.out.println();
        User obj=new User();
        if(verifyOtp())
        {
	   System.out.print(lightash); 
           System.out.print("Enter Your Fullname Here : ");
	   System.out.print(def); 
           String name =sc.next();
           Nameofuser(name);
           MainPage();
        }
        
   }
}