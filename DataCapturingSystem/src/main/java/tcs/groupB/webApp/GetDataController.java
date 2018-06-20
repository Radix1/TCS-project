package tcs.groupB.webApp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tcs.groupB.webApp.model.Transaction;
import tcs.groupB.webApp.dao.TransactionDao;

/**
 * Servlet implementation class GetDataController
 */
public class GetDataController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int key=Integer.parseInt(request.getParameter("key"));//converting data into integer
		/*Now we fetch the column of key as an java object*/
		
		TransactionDao dao = new TransactionDao();
		Transaction t1 = dao.getTransaction(key);
		
		/*Attach t1 with request object*/
		request.setAttribute("tobject",t1 );//name, object
		
		/*Passing this object to jsp to display..
		 * we pass control to showTransaction.jsp using dispatcher*/
		
		RequestDispatcher rd = request.getRequestDispatcher("showTransaction.jsp");
		rd.forward(request, response);//forwarding request and response objects
		
	}


}
