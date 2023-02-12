package mythirdpkg;
import java.util.*;
public class Third{
	public String name,addr;

	public void get()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name address");
		name=sc.next();
		addr=sc.next();
	}
}