class Mobile 
{
	//states
	String name,color,storage;
	double price;
	//Lazy instantiation  1:2
	Sim slot1;//null
	Sim slot2;//null

	//constructers
	Mobile()
	{}
	Mobile(String n,String c,String store,double p)
	{
		//L.I
		name=n;
		price=p;
		color=c;
		storage=store;
	}
		//behaviours
	//add Sim1
	public void addSim1(Sim slot1)
	{
		//adding is possible if slot 1 is Empty
		if(this.slot1==null)
		{
			this.slot1=slot1;
			System.out.println("Sim 1 Added Succesfully");
		}
		else{//if slot 1 is holding sim1
			System.out.println("Already Sim 1 is Inserted");
		}
	}
	
	//add Sim2
	public void addSim2(Sim slot2)
	{
		//adding is possible if slot 2 is Empty
		if(this.slot2==null)
		{
			this.slot2=slot2;
			System.out.println("Sim 2 Added Succesfully");
		}
		else{//if slot 2 is holding slot2
			System.out.println("Already Sim 2 is Inserted");
		}
	}
	//remove sim1
	public void removeSim1()
	{
		//we can remove sim1 if slot1 is Not Null
		if(this.slot1!=null)
		{
			this.slot1=null;
			System.out.println("Sim 1 is Removed Succesfully");
		}
		else
		{//if slot is already null
			System.out.println("Thier is No Sim in Slot1 To Remove");
		}
	}
	//remove sim2
	
	public void removeSim2()
	{
		//we can remove sim2if slot2 is Not Null
		if(this.slot2!=null)
		{
			this.slot2=null;
			System.out.println("Sim 2 is Removed Succesfully");
		}
		else
		{//if slot is already null
			System.out.println("Thier is No Sim in Slot2 To Remove");
		}
	}
	//Checking SIm slot1 Contains Sim or Not
	public boolean isSim1Present()
	{
		//if slot 1 is Not Null 
		if(this.slot1!=null)
			return true;//true means SIm 1 iS present
		else 
			return false;//false means Sim1 is Not Present
	}
	//Checking SIm slot2 Contains Sim or Not
	public boolean isSim2Present()
	{
		//if slot 2 is Not Null 
		if(this.slot2!=null)
			return true;//true means SIm 2 iS present
		else 
			return false;//false means Sim2 is Not Present
	}
	//Details Of Mobile
	void detailsOfMobile()
	{
		System.out.println("The Mobile Name :"+name);
		System.out.println("The Mobile Price :"+price);
		System.out.println("The Mobile Color :"+color);
		System.out.println("The Mobile Stotage :"+storage);
		System.out.println("***********************************");
	}

}



