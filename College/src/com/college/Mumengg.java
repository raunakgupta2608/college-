package com.college;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Mumengg extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Connection con;
	ResultSet rs;
	
	public void init() throws ServletException {
    	try {
    		con= Database.getOracleConnection();
    		System.out.println(con);
    	} catch(ClassNotFoundException cnfe) {
    		System.out.println(cnfe);
    		
    	}catch(SQLException sqle) {
    		System.out.println(sqle);
    	}
    }

	PreparedStatement pst;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PreparedStatement pst;
		try
		{
			pst= con.prepareStatement("SELECT CNAME FROM COLLEGE WHERE CITY ='MUMBAI' AND COURSETYPE='ENGG'");
			Collegebean cg= new Collegebean();
			rs=pst.executeQuery();
			List<String> list = new ArrayList<String>();
			
			while(rs.next())
			{
				list.add((String) rs.getString("cname"));
			}
			int i=list.size();
			cg.setList(list);
			cg.setI(i);
			request.setAttribute("colkey", cg);
			RequestDispatcher reqdis = request.getRequestDispatcher("mumengg.jsp");
			reqdis.forward(request, response);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
