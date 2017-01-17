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
    "/ServletPayment"
})
public class ServletPayment extends HttpServlet
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
            out.println("<html>\n" +
"<head>\n" +
"<meta charset=\"utf-8\" />\n" +
"<title>Hennings Blomster</title>\n" +
"<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" media=\"all\" />\n" +
"<!--[if IE 6]>\n" +
"	<link rel=\"stylesheet\" type=\"text/css\" href=\"css/ie6.css\" media=\"all\" />\n" +
"<![endif]-->\n" +
"<!--[if IE 7]>\n" +
"	<link rel=\"stylesheet\" type=\"text/css\" href=\"css/ie7.css\" media=\"all\" />\n" +
"<![endif]-->\n" +
"</head>\n" +
"<body>\n" +
"	<div id=\"header\">\n" +
"		<ul>\n" +
"				<li class=\"selected\"><a href=\"index.html\">home</a></li>\n" +
"			<li><a href=\"flowers.html\">buketter</a></li>\n" +
"			<li><a href=\"handling.html\">udbringning</a></li>\n" +
"			<li><a href=\"payment.html\">order &amp; betaling</a></li>\n" +
"			<li><a href=\"about.html\">om os</a></li>\n" +
"			<li><a href=\"blog.html\">blog</a></li>\n" +
"			<li><a href=\"contact.html\">kontakt</a></li>			\n" +
"		</ul>\n" +
"		<div class=\"logo\">\n" +
"			<a href=\"index.html\"><img src=\"images/logoto.png\" alt=\"\" /></a>\n" +
"		</div>\n" +
"	</div>\n" +
"	<div id=\"body\">\n" +
"		<div class=\"payment\">\n" +
"			<h1>order &amp; betaling</h1>	\n" +
"			<div class=\"section1\">	\n" +
"				<div class=\"article\">\n" +
"					<h3>This website template has been designed by <a href=\"http://www.freewebsitetemplates.com/\">Free Website Templates</a> for you, for free. You can replace all this text with your own text.</h3>	\n" +
"					<p>You can remove any link to our website from this website template, you're free to use this website template without linking back to us. If you're having problems editing this website template, then don't hesitate to ask for help on the <a href=\"http://www.freewebsitetemplates.com/forum\">Forum</a>.</p>		\n" +
"					<ul>\n" +
"						<li><p>Nunc dapibus mattis est eu dignissim. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.</p></li>\n" +
"						<li><p>Etiam lorem purus, fermentum vitae malesuada eget, gravida rutrum enim. Nullam ante justo, mattis id porta eget, ultrices ut leo. Quisque laoreet nulla in urna condimentum vitae lacinia lorem aliquam.</p></li>\n" +
"						<li><p>Proin non neque est. Vivamus odio lectus, vestibulum nec ullamcorper ac, vulputate nec arcu. Cras ut lorem libero, nec consectetur elit.</p></li>\n" +
"					</ul>\n" +
"				</div>\n" +
"				<div>\n" +
"					<img src=\"images/lady-handling-flower2.jpg\" alt=\"\" />				\n" +
"				</div>\n" +
"			</div>\n" +
"			<div class=\"section2\">\n" +
"				\n" +
"				<html lang=\"en\">\n" +
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
"    <!-- WARNING: Respond.js doesn't work if you view the page via  -->\n" +
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
"                        <h3 class=\"panel-title display-td\" >Betalings detaljer</h3>\n" +
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
"                                    <label for=\"cardNumber\">Kort Nummer</label>\n" +
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
"                                    <label for=\"cardExpiry\"><span class=\"hidden-xs\">Udløbsdato</span><span class=\"visible-xs-inline\">EXP</span> </label>\n" +
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
"                                    <label for=\"cardCVC\">CV KODE</label>\n" +
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
"                                    <label for=\"couponCode\">RABAT KODE</label>\n" +
"                                    <input type=\"text\" class=\"form-control\" name=\"couponCode\" />\n" +
"                                </div>\n" +
"                            </div>                        \n" +
"                        </div>\n" +
"                        <div class=\"row\">\n" +
"                            <div class=\"col-xs-12\">\n" +
"                                <button class=\"btn btn-success btn-lg btn-block\" type=\"submit\">Gennemfør betaling</button>\n" +
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
"</html>\n" +
"				</div>	\n" +
"			</div>\n" +
"		</div>\n" +
"	</div>\n" +
"	<div id=\"footer\">\n" +
"		<div>\n" +
"			<div class=\"connect\">\n" +
"				<h4>Følg os:</h4>\n" +
"				<ul>\n" +
"					<li class=\"facebook\"><a href=\"http://facebook.com\" target=\"_blank\">facebook</a></li>\n" +
"					<li class=\"twitter\"><a href=\"http://twitter.com\" target=\"_blank\">twitter</a></li>		\n" +
"				</ul>\n" +
"			</div>\n" +
"			<p>Copyright &copy; 2017. All rights reserved.</p>\n" +
"		</div>\n" +
"	</div>\n" +
"</body>\n" +
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
