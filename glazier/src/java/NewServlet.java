/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.websocket.SendResult;

/**
 *
 * @author hp
 */
@WebServlet(urlPatterns =
{
    "/NewServlet"
})
public class NewServlet extends HttpServlet
{     
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
      int width = Integer.parseInt(request.getParameter("width"));
      int heigth = Integer.parseInt(request.getParameter("heigth"));
       String knap = request.getParameter("knap");
       
        switch(knap)
        {
            case "fame1":     
               
                System.out.println("du har valgt fame 1");
                break;
            case "fame2":
                 
                System.out.println("du har valgt fame 2");
               break;
            case "fame3":
                   
                System.out.println("du har valg fame 3");
            break;
            default:
                System.out.println(" du skal valge 1 ,2 eller 3 ");
        
        
        
        
        }
        
        PriceCalculationClass calculation = new PriceCalculationClass();
        double price =  calculation.Go(heigth, width, knap);
        
        
        
        
        
        
         
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter())
        {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NewServlet at " + request.getParameter("knap") + "</h1>");
            out.println( price);
            out.println("</body>");
            out.println("</html>");
        }
    }

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
            throws ServletException, IOException
    {
        processRequest(request, response);
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
            throws ServletException, IOException
    {
        processRequest(request, response);
    }
    
    
    
    //private void ShowOfTheWindow(HttpServletRequest request, HttpServletResponse response){
        
    }

 



