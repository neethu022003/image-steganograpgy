import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Translate extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url ="C:\\Users\\sravani\\OneDrive\\Desktop\\stegano\\Language Translator App in JavaScript\\index.html";
        response.sendRedirect(url);
    }
}
