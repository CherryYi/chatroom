package com.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest; import javax.servlet.http.HttpServletResponse;
public class webchat extends HttpServlet {
protected void processRequest(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
response.setContentType("text/html;charset=UTF-8");

PrintWriter out = response.getWriter();
String name=request.getParameter("userID");
// String talkwords=(String)getServletContext().getAttribute("talking");
out.println("<body background=\"1.jpg\">");
out.println("<html>");
out.println("<head>");
out.println("<title>chatroom</title>");
out.println("</head>");
out.println("<body><table border=\"0\"width=\"200%\"length=\"100%\"><tr>");
out.println("<td align=\"left\" valign=\"bottom\">");
out.println("<h3>聊天窗口</h3></td></tr></table><hr>");
// out.println("<h5>当前用户:"+counter.counte+"</h5>");
// out.println("<table width=\"58%\" border=\"2\" align=\"left\">");
// out.println("<tr><td>");
// out.println("<h5>聊天信息</h5>");
// out.println("<textarea cols=\"101\" rows=\"10\" style=\"overflow:auto\" >"+Content.content+ "</textarea>");
// out.println("<textarea name=\"text\" clos=\"100\" rows=\"10\">"+Content.content+"</textarea>");
// out.println("</tr></td> </table>");
out.println ("<h4>当前在线人数:"+counter.counte+"<h4>");
out.println("<table width=\"50%\" border=\"1\" align=\"left\">");
out.println("<tr><td>");
out.println("<h5>聊天信息</h5>");
out.println("<textarea name=\"talkingwindow\" cols=\"100\" rows=\"10\" style=\"overflow:auto\">"+Content.content+ "</textarea>");
out.println("</tr></td> </table>");
out.println("<br><br><br><br><br><br><br><br><br><br><br><br>");
out.println("<form action=\"Content\" method=\"post\">");
out.println("<table width=\"50%\" border=\"1\" align=\"left\">");
out.println("<tr><td>");
out.println("<h5>输入框</h5>");
out.println("<textarea name=\"talkingtext\" cols=\"100\" rows=\"10\"> </textarea>");
out.println("</tr></td> </table>");
out.println("<br><br><br><br><br><br><br><br><br><br><br><br>");
out.println("<table width=\"40%\" border=\"0\" align=\"right\">");
out.println("<tr><td>");
out.println("<input type=\"submit\" align=\"right\" name=\"btn_submit\" value=\"提交\">");
out.println("<input type=\"reset\" name=\"btn_reset\" value=\"重置\">");
out.println("</tr></td> </table></form>");
// out.println("<textarea name=\"talkingtext\" clos=\"100\" rows=\"10\"></textarea><br><br>");
// out.println("<input type=\"Submit\" name=\"btn_submit\""+"value=\"提交\">");
// out.println("<input type=\"Reset\" name=\"btn_reset\""+"value=\"重置\">");
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