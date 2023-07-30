package Constructor;

public class Constructor_demo {
	int id;
	String name;
	Constructor_demo(int id,String name){
		this.id=id;
		this.name=name;
	}
	Constructor_demo()
	{	
	}
	void display() {
		System.out.println("your id "+id+" your name "+name);
	}
}



