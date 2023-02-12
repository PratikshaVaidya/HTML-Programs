import MySecondpkg.Second;

public class SecondMain
{
	public static void main(String args[])
	{
		Second s1=new Second();
		Second s2=new Second(1000);
		s1.show();
		s2.show();

	}
}
