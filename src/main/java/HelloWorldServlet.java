import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name= "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
//
//    int hitCount;
//
//    public void init(){
//        hitCount = 0;
//    }

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
        res.getWriter().println("Hello world");


    }
}
