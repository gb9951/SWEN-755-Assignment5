import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Validate extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String name = request.getParameter("user");
        String pass = request.getParameter("pass");

        if(pass.equals("1234"))
        {
            //creating a session
            HttpSession session = request.getSession();
            session.setAttribute("user", name);
            response.sendRedirect("Welcome");
        }
    }
}



//import java.io.*;
//import java.util.*;
//import javax.servlet.*;
//import javax.servlet.http.*;
//
//public class Session extends HttpServlet {
//
//    public Session() {
//        super();
//    }
//
//    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        HttpSession session = request.getSession();
//        PrintWriter writer = response.getWriter();
//        writer.println("Session ID: " + session.getId());
//        writer.println("Creation Time: " + new Date(session.getCreationTime()));
//        writer. println("Last Accessed Time: " + new Date(session.getLastAccessedTime()));
//    }
//
//    public static void main(String[] args) {
//        Session session = new Session();
//        HttpServletRequest request = new HttpServletRequestWrapper();
//        session.doGet(, new HttpSer);
//    }
//}
