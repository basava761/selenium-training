package training;

//assignment //		(((((10*2)-2)+2)-2)/2)

public class assign {

	public int mul(int a,int b) {
		int mul=a*b;
		System.out.println("multiplication is:"+mul);
		return mul;
	}
	public int sub(int x,int y) {
		int sub=x-y;
		System.out.println("multiplication is:"+sub);
		return sub;
}
	public int sum(int m,int n) {
		int sum=m+n;
		System.out.println("multiplication is:"+sum);
		return sum;}
		public int divide(int y,int z) {
			int div=y/z;
			System.out.println("multiplication is:"+div);
			return div;
		
	}
	public static void main(String[] args) {
		assign a=new assign();
		int m=a.mul(10, 2);
		int s=a.sub(m, 2);

		int su=a.sum(s, 2);
		int t=a.sub(su, 2);
		int f=a.divide(t, 2);
		
	}
}
