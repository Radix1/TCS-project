package tcs.groupB.webApp.model;

public class Transaction 
{
	private int key;
	private String name;
	private int amount;
	
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	//Used to print object
	@Override
	public String toString() {
		return "Transaction [key=" + key + ", name=" + name + ", amount=" + amount + "]";
	}
	
	
}
