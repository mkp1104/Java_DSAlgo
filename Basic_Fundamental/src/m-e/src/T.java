abstract class P
{
void test1()
	{
		System.out.println("from test1");
	}
}
abstract  class Q
{
}
class R extends P
{
}
class S extends Q
{
}
class T
{
	public static void main(String x[])
	{
	//  P p1=new P();
//    p1.test1();
			System.out.println("----");
//			Q q1=new Q();
			System.out.println("----");
			R r1=new R();
			r1.test1();
			System.out.println("----");
			S s1=new S();
			System.out.println("----");
	}
	}

