import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain; charset=utf-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if (username != null && username.equals("pxc")) {
            if (password != null && password.equals("111")) {
                resp.getWriter().println("登录成功");
                return;
            }
        }

        resp.getWriter().println("登录失败");
    }
}
