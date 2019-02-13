package ru.ncedu.ht;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "FormServlet", urlPatterns = {"/FormServlet"})
public class FormServlet extends HttpServlet {
    
    private static final String STRING_PARAM = "string";
    private static final String STRING_ATTR = "string";
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.getRequestDispatcher("/WEB-INF/formjsp.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String str = request.getParameter(STRING_PARAM);
        if(!str.equals("")){
            request.setAttribute(STRING_ATTR, str);
        }
        request.getRequestDispatcher("/WEB-INF/formjsp.jsp").forward(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
