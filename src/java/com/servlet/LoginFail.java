package com.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest; import javax.servlet.http.HttpServletResponse;
@WebServlet(name="LoginFail",urlPatterns = {"/LoginFail"})
public class LoginFail extends HttpServlet {
 protected void processRequest(HttpServletRequest request, HttpServletResponse response)
     throws ServletException, IOException {
response.setContentType("text/html;charset=UTF-8");
PrintWriter out = response.getWriter();
/* TODO output your page here */
out.println("<html>");
out.println("<head>");
out.println("<title>Login failed</title>");
out.println("</head>");
out.println("<body>");
out.println("<h1>Login failed,please log again!</h1>");
RequestDispatcher dispatcher=request.getRequestDispatcher("login.html");
dispatcher.include(request, response);
out.println("</body>");
out.println("</html>");
out.close();
}
protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
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