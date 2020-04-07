public class Ex3_2 {
	int CommonDivisor(int m, int n) {    //锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷员
		if (m < n) {
			int c = m;
			m = n;
			n = c;
		}
		int d;
		do {
			d = m % n;
			m = n;
			n = d;
		} while (d != 0);
		return m;
	}	
	public static void main(String args[]){
		Ex3_2 CommonD=new Ex3_2();    //锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷??
		int x=108,y=16;
		int result=CommonD.CommonDivisor(x,y);  //锟斤拷锟矫凤拷锟斤拷锟斤拷员
		System.out.println(x+"和"+y+"最大公约数"+result);
	}
}