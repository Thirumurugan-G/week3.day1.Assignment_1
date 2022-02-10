package org.system;

public class Desktop 
{
	public void deskTopSize() 
	{
		System.out.println("The size of desktop is 12-inch");
	}
	public static void main(String[] args) 
	{
		Computer computer= new Computer();
		Desktop desktop=new Desktop();
		computer.computerModel();
		desktop.deskTopSize();
	}
}
