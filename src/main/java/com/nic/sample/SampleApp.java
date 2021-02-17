package com.nic.sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SampleApp extends HttpServlet {

	  public void doGet (HttpServletRequest req, HttpServletResponse res)
	    throws ServletException, IOException {

	    PrintWriter out = res.getWriter();
	    out.println("<!DOCTYPE html>");
	    out.println("<html lang=\"en\">");
	    out.println("<head>");
	    out.println("<meta charset=\"utf-8\">");
	    out.println("<title>Sample WebAPP</title>");
	    out.println("<meta name=\"viewport\" content=\"initial-scale=1,width=720\">");
	    out.println("<link rel=\"stylesheet\" href=\"css/style.css\">");
	    out.println("<script src=\"js/jquery-3.5.1.min.js\"></script>");
	    out.println("<script src=\"js/jquery.bgswitcher.js\"></script>");


	    //src=\"js/yama.js の場合は山の写真が表示されます
	    //src=\"js/umi.js の場合は海の写真が表示されます
	    //out.println("<script src=\"js/yama.js\"></script>");
	    out.println("<script src=\"js/umi.js\"></script>");


	    out.println("</head>");
	    out.println("<div class=\"bg-slider\">");
	    out.println("  <h1 class=\"bg-slider__title\">Sample Web Application</h1>");
	    out.println("</div>");

	   }
	}