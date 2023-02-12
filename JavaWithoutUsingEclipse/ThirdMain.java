package myforthpkg;

import mythirdpkg.Third;
import java.util.*;
public class ThirdMain extends Third
{
public int rollno;
public float res;

public void get1()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter rollno and res");
	rollno=sc.nextInt();
	res=sc.nextFloat();
}

public void display()
{
	System.out.println("ROLL No="+rollno+" "+"Name="+name+" "+" Address="+addr+" "+"Result="+res);
}
public static void main(String args[])
{
	ThirdMain t1=new ThirdMain();
	t1.get();
	t1.get1();
	t1.display();
}

}

