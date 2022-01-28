
package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ArithmeticCalculatorServlet extends HttpServlet {

    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       String message = "---";
       request.setAttribute("message", message);
       getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        return;
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String fValue = request.getParameter("first_value");
        String sValue = request.getParameter("second_value");
        int firstValue = 0;
        int secondValue = 0;
        String message = "";
        
        try{
        firstValue = Integer.parseInt(fValue);
        secondValue = Integer.parseInt(sValue);
        }catch(NumberFormatException e){
            message = "invalid";
        }
        request.setAttribute("firstValue", firstValue);
        request.setAttribute("secondValue", secondValue);

        if(!message.equals("invalid")){
            if(request.getParameter("operation").equals("+")){
                int addition = firstValue + secondValue;
                message = Integer.toString(addition);
            }
            else if(request.getParameter("operation").equals("-"))
            {
                int subtraction = firstValue - secondValue;
                message = Integer.toString(subtraction);
            }
            else if(request.getParameter("operation").equals("*"))
            {
                int multiplication = firstValue * secondValue;
                message = Integer.toString(multiplication);
            }
            else if(request.getParameter("operation").equals("%"))
            {
                int modular = firstValue % secondValue;
                message = Integer.toString(modular);
            }
        }
        
        
        request.setAttribute("message", message);
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        return;
    }

}