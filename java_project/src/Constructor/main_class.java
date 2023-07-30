package Constructor;

class main_class{
	public static void main(String[] args)
	{
		Constructor_demo c= new Constructor_demo(1,"ram");
		Constructor_demo d= new Constructor_demo();
		c.display();
		d.display();
	}
}