package mb.app4.src;

class S 
{
	public static int test()
	{
	System.out.println("From test");
	return 20;
	}
	public static void main(String[] args) 
	{
		System.out.println("from main begin");
		int i;
		i = test();
		System.out.println(i);
		System.out.println("From main end");
	}
}
