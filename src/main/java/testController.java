import dao.PersonDAO;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/test")
public class testController extends HttpServlet {

    @EJB
    private PersonDAO personDAO;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            long id = Integer.parseInt(req.getParameter("Name"));
            req.setAttribute("person", personDAO.find(id));

            req.getRequestDispatcher("getPerson.jsp").forward(req, resp);
    }
}
