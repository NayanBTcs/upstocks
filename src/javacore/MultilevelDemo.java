package javacore;


	class Parent1
	{
		void m1()
		{
			System.out.println("Parent 1 m1 method call..");
		}
	}
	 class Child1 extends Parent1
	 {
		 void m2()
		 {
			 System.out.println("Child1 M2 method call..");
		 }
	 }

	public  class MultilevelDemo extends Child1
	{

		void m3()
		{
			System.out.println("MultilevelDemo m3 method call..");
		}
	
		public static void main(String[] args) 
		{
			System.out.println("Parent1 obj");
			Parent1 p = new Parent1(); 
					p.m1();
			System.out.println();
			System.out.println("child1 object");
			//child1 object
			Child1 c=new Child1();
			c.m1();
			c.m2();
			System.out.println();
			System.out.println("MultilevelDemo obj ");
			//MultilevelDemo obj
			MultilevelDemo m= new MultilevelDemo();
			m.m1();
			m.m2();
			m.m3();
			

		}

       }
