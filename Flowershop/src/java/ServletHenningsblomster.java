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

/**
 *
 * @author hp
 */
@WebServlet(urlPatterns =
{
    "/ServletHenningsblomster"
})
public class ServletHenningsblomster extends HttpServlet
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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter())
        {
            /* TODO output your page here. You may use following sample code. */
            out.println("<html lang=\"en\">\n" +
"  <head>\n" +
"    <meta charset=\"utf-8\">\n" +
"    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
"    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n" +
"    <title>Quiz de JavaScript</title>\n" +
"\n" +
"    <!-- Bootstrap -->\n" +
"    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">\n" +
"    <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css\">\n" +
"\n" +
"    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n" +
"    <!-- WARNING: Respond.js doesn't work if you view the page via f-->\n" +
"    <!--[if lt IE 9]>\n" +
"      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n" +
"      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n" +
"    <![endif]-->\n" +
"  </head>\n" +
"  <body>\n" +
"    <div class=\"container\">\n" +
"    	<!-- CREDIT CARD FORM STARTS HERE -->\n" +
"            <div class=\"panel panel-default credit-card-box customwidth center-block\">\n" +
"                <div class=\"panel-heading display-table\" >\n" +
"                    <div class=\"row display-tr\" >\n" +
"                        <h3 class=\"panel-title display-td\" >Payment Details</h3>\n" +
"                        <div class=\"display-td\" >                            \n" +
"                            <img class=\"img-responsive pull-right\" src=\"http://i.imgur.com/gIMFDbp.png\">\n" +
"                            <!-- <img class=\"img-responsive pull-right\" src=\"http://i.imgur.com/WluzPvZ.png\">\n" +
"                            <img class=\"img-responsive pull-right\" src=\"http://i.imgur.com/H5lJRwk.png\">\n" +
"                            <img class=\"img-responsive pull-right\" src=\"http://i.imgur.com/1U8OBnM.png\">\n" +
"                            <img class=\"img-responsive pull-right\" src=\"http://i.imgur.com/iqIDYfz.png\">\n" +
"                        	-->\n" +
"                        </div>\n" +
"                    </div>                    \n" +
"                </div>\n" +
"                <div class=\"panel-body\">\n" +
"                    <form role=\"form\" id=\"payment-form\">\n" +
"                        <div class=\"row\">\n" +
"                            <div class=\"col-xs-12\">\n" +
"                                <div class=\"form-group\">\n" +
"                                    <label for=\"cardNumber\">CARD NUMBER</label>\n" +
"                                    <div class=\"input-group\">\n" +
"                                        <input \n" +
"                                            type=\"tel\"\n" +
"                                            class=\"form-control\"\n" +
"                                            name=\"cardNumber\"\n" +
"                                            placeholder=\"Valid Card Number\"\n" +
"                                            autocomplete=\"cc-number\"\n" +
"                                            pattern=\"^(?:4[0-9]{12}(?:[0-9]{3})?|5[1-5][0-9]{14}|3[47][0-9]{13}|3(?:0[0-5]|[68][0-9])[0-9]{11}|6(?:011|5[0-9]{2})[0-9]{12}|(?:2131|1800|35\\d{3})\\d{11})$\"\n" +
"                                            required autofocus \n" +
"                                        />\n" +
"                                        <span class=\"input-group-addon\"><i class=\"fa fa-credit-card\" id=\"cardlogo\" style=\"color:purple;font-size:2rem;\"></i></span>\n" +
"                                    </div>\n" +
"                                </div>                            \n" +
"                            </div>\n" +
"                        </div>\n" +
"                        <div class=\"row\">\n" +
"                            <div class=\"col-xs-7 col-md-7\">\n" +
"                                <div class=\"form-group\">\n" +
"                                    <label for=\"cardExpiry\"><span class=\"hidden-xs\">EXPIRATION</span><span class=\"visible-xs-inline\">EXP</span> DATE</label>\n" +
"                                    <input \n" +
"                                        type=\"tel\" \n" +
"                                        class=\"form-control\" \n" +
"                                        name=\"cardExpiry\"\n" +
"                                        placeholder=\"MM / YY\"\n" +
"                                        autocomplete=\"cc-exp\"\n" +
"                                        required \n" +
"                                    />\n" +
"                                </div>\n" +
"                            </div>\n" +
"                            <div class=\"col-xs-5 col-md-5 pull-right\">\n" +
"                                <div class=\"form-group\">\n" +
"                                    <label for=\"cardCVC\">CV CODE</label>\n" +
"                                    <input \n" +
"                                        type=\"tel\" \n" +
"                                        class=\"form-control\"\n" +
"                                        name=\"cardCVC\"\n" +
"                                        placeholder=\"CVC\"\n" +
"                                        autocomplete=\"cc-csc\"\n" +
"                                        required\n" +
"                                    />\n" +
"                                </div>\n" +
"                            </div>\n" +
"                        </div>\n" +
"                        <div class=\"row\">\n" +
"                            <div class=\"col-xs-12\">\n" +
"                                <div class=\"form-group\">\n" +
"                                    <label for=\"couponCode\">COUPON CODE</label>\n" +
"                                    <input type=\"text\" class=\"form-control\" name=\"couponCode\" />\n" +
"                                </div>\n" +
"                            </div>                        \n" +
"                        </div>\n" +
"                        <div class=\"row\">\n" +
"                            <div class=\"col-xs-12\">\n" +
"                                <button class=\"btn btn-success btn-lg btn-block\" type=\"submit\">Start Subscription</button>\n" +
"                            </div>\n" +
"                        </div>\n" +
"                        <div class=\"row\" style=\"display:none;\">\n" +
"                            <div class=\"col-xs-12\">\n" +
"                                <p class=\"payment-errors\"></p>\n" +
"                            </div>\n" +
"                        </div>\n" +
"                    </form>\n" +
"                </div>\n" +
"            </div>            \n" +
"            <!-- CREDIT CARD FORM ENDS HERE -->\n" +
"    </div>\n" +
"\n" +
"    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n" +
"    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n" +
"    <!-- Include all compiled plugins (below), or include individual files as needed -->\n" +
"    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js\"></script>\n" +
"  </body>\n" +
"</html>");
            
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

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo()
    {
        return "Short description";
    }// </editor-fold>

}
