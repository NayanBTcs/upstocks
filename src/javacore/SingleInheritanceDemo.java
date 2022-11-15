package javacore;
//Single Inheritance Demo
//One Parent class Nd One Child class

class Parent
{
	int p=88;
	int m=30;
	void add()
	{
		int a=10,b=50,c;
		c=a+b;
		int d=p+m;
		System.out.println("Call Parent class Add method :" +c +"  "+d);
	}
}



public class SingleInheritanceDemo extends Parent
{

	void sub()
	{
		System.out.println("Child class Sub Method call..");
	}
	public static void main(String[] args) 
	{
		//Parent Object
		Parent p= new Parent();
		p.add();
		
		//child class object
		SingleInheritanceDemo s= new SingleInheritanceDemo();
		s.sub();
		s.add();
	}

}
