package training;

public class demo {

	
	public int sum(int a,int b) {
		
		int c;
		c=a+b;
		System.out.println("sum result is"+c);
		return c;
		
	}
public int sub(int x,int y) {
		
		int z;
		z=x-y;
		System.out.println("sum result is"+z);
		return z;
}
	public void mul(int a1,int a2) {
		int a3;
		a3=a1*a2;
		System.out.println("final resultis"+a3);
		
	}
	public static void main(String[] args) {
		demo d=new demo();
		int sumresult=d.sum(10, 2);
		int subresult=d.sub(10, 2);
		
		d.mul(sumresult, subresult);
	}


}
