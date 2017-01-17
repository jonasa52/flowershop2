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
    "/ServletBlog"
})
public class ServletBlog extends HttpServlet
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
            out.println("html>\n" +
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
"	          <li class=\"selected\"><a href=\"index.html\">home</a></li>\n" +
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
"		<div class=\"blog\">\n" +
"			<h1>blog</h1>\n" +
"			<div>\n" +
"				<h3>blablablablablablablablablablablablablablablablablablablablablablablablablablablabla .</h3>\n" +
"				<p>blablablablablablablablablablablablablaablablablablablablablablablabablablablablablablablablablablablabla.</p>		\n" +
"				<img src=\"images/garden2.jpg\" alt=\"\" />	\n" +
"				<p> blablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablabl\n" +
"				ablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablabla.</p>\n" +
"			</div>		\n" +
"			<ul>\n" +
"				<li>\n" +
"					<h3>blablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablabla.</h3>\n" +
"				<p>blablablablablablablablablablablablablablablablablablablablabla.</p>\n" +
"				</li>\n" +
"				<li>\n" +
"					<h3>Blomster bringer lykke.</h3>\n" +
"					<p> her kan vi skrive alt muligt.</p>\n" +
"				</li>\n" +
"				<li>\n" +
"					<h3>blablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablabla.</h3>\n" +
"					<p>blablablablablablablablablablablablablablablablablablablablabla.</p>\n" +
"				</li>\n" +
"				<li>\n" +
"					<h3>blablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablabla.</h3>\n" +
"					<p>blablablablablablablablablablablablablablablablablablablablabla.</p>	\n" +
"				</li>		\n" +
"			</ul>\n" +
"		</div>\n" +
"	</div>\n" +
"	<div id=\"footer\">\n" +
"		<div>\n" +
"			<div class=\"connect\">\n" +
"				<h4>Følg os:</h4>\n" +
"				<ul>\n" +
"					<li class=\"facebook\"><a href=\"http://facebook.com\" target=\"_blank\">facebook</a></li>\n" +
"					<li class=\"twitter\"><a href=\"http://twitter.com\" target=\"_blank\">twitter</a></li>	\n" +
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
