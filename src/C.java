
public class C{
	int x;
	public C() {
		this(10);
	}
	C(int x){
		this.x=x;
	}
}
class D extends C{
	int y;
	public D() {
		
	}

D(int y){
	this.y=y;
}
}
class MyTest{
	public static void main(String args[])
	{
		D b=new D(10);
		System.out.println(b.x+"" +b.y);
		
	}
	
}