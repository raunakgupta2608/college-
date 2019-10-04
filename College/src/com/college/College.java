package com.college;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class College extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection con;
	ResultSet rs;
	
	public void init() throws ServletException {
    	try {
    		con= Database.getOracleConnection();
    	} catch(ClassNotFoundException cnfe) {
    		System.out.println(cnfe);
    		
    	}catch(SQLException sqle) {
    		System.out.println(sqle);
    		
    	}
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String cid= request.getParameter("cid");
		String cname= request.getParameter("nme");
		String coursetype= request.getParameter("ct");
		String city= request.getParameter("city");
		String fees= request.getParameter("fees");
		String pincode= request.getParameter("pincode");
		
		PreparedStatement pst;
		try
		{
			pst= con.prepareStatement("INSERT INTO COLLEGE VALUES(?,?,?,?,?,?)");
			pst.setString(1, cid);
			pst.setString(2, cname);
			pst.setString(3, coursetype);
			pst.setString(4, city);
			pst.setString(5, fees);
			pst.setString(6, pincode);
			
			Collegebean cg= new Collegebean();
			rs=pst.executeQuery();
			if(rs.next())
			{
				
				cg.setCid(cid);
				cg.setCname(cname);
				cg.setCoursetype(coursetype);
				cg.setCity(city);
				cg.setFees(fees);
				cg.setPincode(pincode);
				
			}
			request.setAttribute("colkey", cg);
			RequestDispatcher reqdis = request.getRequestDispatcher("register.jsp");
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
