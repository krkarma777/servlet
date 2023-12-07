package hello.servlet.basic.request;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "RequestHeaderServlet", urlPatterns = "/hello")
public class RequestHeaderServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        request.getParameterNames().asIterator()
//                .forEachRemaining(paraName -> System.out.println(paraName + ":" + paraName));


    }
}
