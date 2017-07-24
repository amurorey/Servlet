package javademo.servlet;

import javademo.module.Administrator;
import javademo.service.TestService;
import javademo.service.impl.TestServiceImpl;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by amuro on 2017-07-23.
 */
@WebServlet("/try/login")
public class LoginServlet extends HttpServlet {

    TestService testService = new TestServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] params = new String[]{request.getParameter("CODE"), request.getParameter("PASSWORD")};
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        List<Object> list = testService.getUserInfo(params);
        PrintWriter out = null;
        System.out.println("list:" + list.toString());
        try {
            out = response.getWriter();
            out.write(list.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        out.flush();
        out.close();

    }
}
