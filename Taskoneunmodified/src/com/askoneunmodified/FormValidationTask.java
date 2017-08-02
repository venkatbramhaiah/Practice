package com.askoneunmodified;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.labs.repackaged.org.json.JSONException;
import com.google.appengine.labs.repackaged.org.json.JSONObject;

@SuppressWarnings("serial")
public class FormValidationTask extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
	
		PrintWriter pw= resp.getWriter();
		
		String customer=req.getParameter("data");
		
		try{
			JSONObject obj= new JSONObject(customer);
			
			String fname= obj.get("FirstName").toString();
			String lname= obj.get("LastName").toString();
			String age= obj.get("Age").toString();
			String dob= obj.get("DOB").toString();
			String gen= obj.get("Gender").toString();
			
			System.out.println("FirstNmae: " +fname);
			System.out.println("LastName: "+lname);
			System.out.println("Age: "+age);
			System.out.println("DataOfBirth: "+dob);
			System.out.println("Gender: "+gen);
			
		}catch(JSONException ex){
			ex.printStackTrace();
		}
		
	}
}
