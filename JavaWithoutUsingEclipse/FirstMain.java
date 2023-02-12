import MyFirstpkg.First;
public class FirstMain
{
	public static void main(String args[])
	{
		First f1=new First();
		f1.get();
		System.out.println("Multiplication:-"+(f1.x*f1.x));
	}
}