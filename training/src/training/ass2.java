package training;

//((((10+2)+2)-2)*2)/2)

public class ass2 {
	
	public int sum(int m,int n) {
		int sum=m+n;
		System.out.println("multiplication is:"+sum);
		return sum;
		}
	
		public int divide(int y,int z) {
			int div=y/z;
			System.out.println("multiplication is:"+div);
			return div;
			}
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
		public static void main(String[] args) {
			ass2 g=new ass2();
			int s=g.sum(10, 2);
			int sm=g.sum(s, 2);
			int sb=g.sub(sm, 2);
			int mlt=g.mul(sb, 2);
			int t=g.divide(mlt, 2);
		}

}
