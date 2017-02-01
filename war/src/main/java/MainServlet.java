/**
 * Created by aliki on 25.01.2017.
 */
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/", "/current"})
public class MainServlet extends HttpServlet {

    @EJB
    private MainLocal mainLocal;

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String time = mainLocal.getTime();
        req.setAttribute("time",time);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
        mainLocal.getDataForSQL(time,
                req.getAttribute("browser").toString(),
                req.getAttribute("ip").toString());
    }
}
