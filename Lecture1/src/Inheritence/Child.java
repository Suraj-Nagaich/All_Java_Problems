package Inheritence;

public class Child extends Parent{
	int gold=2;
	int silver=4;
	int noh=1;
	int nos=9;
	public  int totalhouse()
	{
		return this.noh+super.noh;
	}
	public int totalshops()
	{
		return this.nos+super.nos;
	}
	

}
