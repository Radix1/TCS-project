package tcs.groupB.webApp.dao;

import tcs.groupB.webApp.model.Transaction;

public class TransactionDao 
{
	public Transaction getTransaction(int key);
	{
		Transaction t=new Transaction();
		t.setKey(key);
		t.setName("Vansika");
		t.setAmount(2000);
		
		return t;
	}

}
