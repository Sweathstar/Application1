class Ball 
{
	//states
	private double radius;
	
	//Const
	Ball(){
		//L.I
	}
	Ball(double radius){
		//L.I
		this.radius=radius;
	}
	//Behaviours
	public double getRadius(){
		
		return radius;
	}
	
	public void setRadius(double radius){
		this.radius=radius;
	}
}
