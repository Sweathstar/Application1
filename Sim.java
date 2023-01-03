//depended Obj
class Sim 
{
	//states
	String operater_name;
	String band_width;
	double call_rate;
	long ph_no;

	//constructors
	Sim()
	{}
	
	Sim(String o_n,String bw,double cr,long pn)
	{
		//L.i
		operater_name=o_n;
		band_width=bw;
		call_rate=cr;
		ph_no=pn;
	}
	//Behaviours
	public void detailsOfSim()
	{
		System.out.println("The Sim Operater Name is :"+operater_name);
		System.out.println("The Sim Band Width is :"+band_width);
		System.out.println("The Sim Call Rate is :"+call_rate);
		System.out.println("The Phone Number is :"+this.ph_no);
		System.out.println("******************************************");
	}
}
