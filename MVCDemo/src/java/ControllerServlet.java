import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class ControllerServlet extends HttpServlet 
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String user = request.getParameter("user");
        StudentModel sm = new StudentModel();
        sm.setUser(user);
        boolean res = sm.checkValues(sm);
        if(res)
            request.getRequestDispatcher("SuccessPage.jsp").forward(request, response);
        else
            request.getRequestDispatcher("FailPage.jsp").forward(request, response);
    }
}
