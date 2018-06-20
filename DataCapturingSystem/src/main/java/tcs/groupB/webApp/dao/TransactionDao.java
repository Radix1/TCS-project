package tcs.groupB.webApp.dao;

import tcs.groupB.webApp.model.Transaction;
import java.sql.*;

public class TransactionDao 
{
	public Transaction getTransaction(int key)
	{
		Transaction t=new Transaction();
		
		t.setKey(key);
		t.setName("Vansika");
		t.setAmount(2000);
		/*I don't have a database installed so you will be getting a static data for now*/
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("url", "usernmae","passwrd");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from Transaction");
			if(rs.next())
			{
				t.setKey(rs.getInt("key"));
				t.setName(rs.getString("tname"));
				t.setAmount(rs.getInt("amount"));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		};
		
		return t;
	}
}
