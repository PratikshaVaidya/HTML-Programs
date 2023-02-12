//. Create 2 classes Student and Batch, Student class is in pack1n and Batch class 
//is in pack2. Write a PrintData class to print Student and Batch information.

package ipackageexpl;
import java.util.*;
public class Student
{
	public int id;
	public String name;
	public float res;
	public void display()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student id,name,result:-");
		id=sc.nextInt();
		name=sc.next();
		res=sc.nextFloat();
		//System.out.println("information of Student is="+id+" "+name+" "+res);
	}
}

