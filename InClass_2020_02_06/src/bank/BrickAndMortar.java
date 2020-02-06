package bank;

public class BrickAndMortar extends Bank {
	private String address;
	
	public String getAddress()	{
		return address;
	}
	
	public void setAddress()	{
		this.address = address;
	}
	
	public String toString(){
		return("address: "+address+""+super.toString());
	}
}
