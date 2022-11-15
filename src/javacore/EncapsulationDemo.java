package javacore;

public class EncapsulationDemo
{
	//private variable
	private int sid; //100
	private String sname; //sayali
	
	//setter way
	public void setSid(int sid)//100
	{
		//a=60;
		this.sid= sid;//100  //to convert local variable to instance variable
	}
	
	public void setSname(String sname)//sayali
	{
		this.sname=sname; //sayali
	}
	
	//Getter way
	
	public int getSid()
	{
		return sid; //100
	}

	public String getSname()
	{
		return sname;// sayali
	}
}