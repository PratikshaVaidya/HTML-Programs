package abcd;
import ipackageexpl.Student;
import java.util.*;

public class Batch extends Student
{
	public int batchid;
	public  String batchname;

	public void printdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the batch id and name:-");
		batchid=sc.nextInt();
		batchname=sc.next();
		System.out.println("information of Student and batch is id="+id+" "+"name="+name+" "+"result="+res+" "+"batch id="+batchid+" "+"batch name="+batchname);
		//System.out.println()
	}
	public static void main(String args[])
	{
		Batch b1=new Batch();
		b1.display();
		b1.printdata();
	}
}
