package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class ApiController {
	
	@RequestMapping("/name")
	public String getName(HttpServletRequest req)
	{
		String name=req.getParameter("studentname");
		HttpSession session = req.getSession();
		session.setAttribute("studentname", name);
		
		return "NewFile.jsp";
	}

}