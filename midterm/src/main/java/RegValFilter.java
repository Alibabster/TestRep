import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebFilter("/register2")
public class RegValFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        String username = servletRequest.getParameter("username");
        String password = servletRequest.getParameter("password");
        String confirmPassword = servletRequest.getParameter("confirmPassword");
        PrintWriter out = servletResponse.getWriter();
        if (username.equals("")){
            out.print("Empty username!");
        }
        else {
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }
// && username.length() > 3 && password.length() > 3
    @Override
    public void destroy() {

    }
}
