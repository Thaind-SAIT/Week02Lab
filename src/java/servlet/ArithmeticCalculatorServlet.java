/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 808278
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("message", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String calculate = request.getParameter("calculate");
        int result = 0;
        String message = "---";
        
        if (first == null || first.equals("") || second == null || second.equals("")) {
            message = "Invalid";
        } else {
            try {
                if (calculate.equals("+")) result = ( Integer.parseInt(first) + Integer.parseInt(second) );
                else if (calculate.equals("-")) result = ( Integer.parseInt(first) - Integer.parseInt(second) );
                else if (calculate.equals("*")) result = ( Integer.parseInt(first) * Integer.parseInt(second) );
                else result = ( Integer.parseInt(first) / Integer.parseInt(second) );
                message = "" + result + "";
            } catch(NumberFormatException e) {
                message = "Invalid";
            } catch (ArithmeticException e) {
                message = "Invalid";
            }
        }
        
        request.setAttribute("first", first);
        request.setAttribute("second", second);
        request.setAttribute("message", message);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        
    }

}
