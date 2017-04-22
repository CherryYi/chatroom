package com.servlet;
import java.io.IOException;
import javax.servlet.RequestDispatcher; import javax.servlet.ServletException; import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Main extends HttpServlet {
protected void processRequest(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException
{
response.setContentType("text/html;charset=UTF-8");
request.setCharacterEncoding("gb2312");
String userID=request.getParameter("userID");
if(userID==null)
{
userID=" ";
}
String password=request.getParameter("password");
if(password==null)
{
password=" ";
}
if(userID.equals("Cherry")&&password.equals("123456"))
{
request.getSession().setAttribute("userID",userID);
RequestDispatcher dispatcher=request.getRequestDispatcher("webchat");
dispatcher.forward(request, response);
}
else if(userID.equals("Jack")&&password.equals("123467"))
{
request.getSession().setAttribute("userID",userID);
RequestDispatcher dispatcher=request.getRequestDispatcher("webchat");
dispatcher.forward(request, response);
}

else
{
RequestDispatcher dispatcher=request.getRequestDispatcher("LoginFail");
dispatcher.forward(request, response);
}
}
protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException
{
processRequest(request, response);
}
protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
processRequest(request, response);
}
public String getServletInfo() {
return "Short description";
}
}
