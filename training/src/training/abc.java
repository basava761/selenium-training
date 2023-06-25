package training;

public class abc {

	public abc() 
	{
		System.out.println("default constructor");
	}
	public abc(int a) 
	{
		System.out.println("default a");
	}
	public abc(int a, int b) 
	{
		System.out.println("default 2 constructor");
	}
	public static void main(String[] args) {
		abc r=new abc(22,33);

	}
}
