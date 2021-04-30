import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebFilter("/login")
public class MyFilter implements Filter {
    FilterConfig config;
    static int counter = 0;
    static ArrayList<String> logs = new ArrayList<String>();
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.config = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        counter++;

        logs.add(servletRequest.getParameter("username"));
        if (counter == 5){
            PrintWriter out = servletResponse.getWriter();
            out.println("Total visitors = " + (counter));
            for (int i=0; i<logs.size(); i++){
                out.println(logs.get(i));
            }
            out.close();
        } else {
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }

    @Override
    public void destroy() {

    }
}
