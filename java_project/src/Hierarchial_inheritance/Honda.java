package Hierarchial_inheritance;

class Honda extends Car{
	void spec()
	{
		System.out.println("1400 bhp,2000cc");
	}
public static void main(String [] args)
{
	Honda n=new Honda();
	n.speed();
	n.spec();
	
}
}
