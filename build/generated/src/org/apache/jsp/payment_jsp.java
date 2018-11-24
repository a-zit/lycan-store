package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class payment_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("        <title>Payment - Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--header-->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/header.jsp", out, false);
      out.write("\n");
      out.write("        <!--body-->\n");
      out.write("        <div class=\"container mt-5 mb-5\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-6 text-center\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <div class=\"card-header\">\n");
      out.write("                            ADDRESS\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-body text-left\">\n");
      out.write("                            <form>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>First Name</label>\n");
      out.write("                                    <input class=\"form-control\" type=\"text\" name=\"fname\" placeholder=\"papop\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Last Name</label>\n");
      out.write("                                    <input class=\"form-control\" type=\"text\" name=\"lname\" placeholder=\"ruengsupapichat\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Address</label>\n");
      out.write("                                    <input class=\"form-control\" type=\"text\" name=\"\" placeholder=\"test\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Street</label>\n");
      out.write("                                    <input class=\"form-control\" type=\"text\" name=\"\" placeholder=\"test\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>City</label>\n");
      out.write("                                    <input class=\"form-control\" type=\"text\" name=\"\" placeholder=\"test\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>State</label>\n");
      out.write("                                    <input class=\"form-control\" type=\"text\" name=\"\" placeholder=\"test\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Tel</label>\n");
      out.write("                                    <input class=\"form-control\" type=\"text\" name=\"\" placeholder=\"test\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Zip code</label>\n");
      out.write("                                    <input class=\"form-control\" type=\"text\" name=\"\" placeholder=\"test\">\n");
      out.write("                                </div>\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary mb-2\">Edit</button>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    <div class=\"card \">\n");
      out.write("                        <div class=\"card-header text-center\">\n");
      out.write("                            Payment\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <form>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Credit card 16 digit</label>\n");
      out.write("                                    <input class=\"form-control\" type=\"text\" name=\"\" placeholder=\"\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Name</label>\n");
      out.write("                                    <input class=\"form-control\" type=\"text\" name=\"\" placeholder=\"\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Month / Year </label>\n");
      out.write("                                    <div class=\"container\">\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-sm\">\n");
      out.write("                                                <input class=\"form-control\" type=\"text\" name=\"\" placeholder=\"month\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm\">\n");
      out.write("                                                <input class=\"form-control\" type=\"text\" name=\"\" placeholder=\"year\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>CVV</label>\n");
      out.write("                                    <input class=\"form-control\" type=\"text\" name=\"\" placeholder=\"179\">\n");
      out.write("                                </div>\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-danger mb-2\">Accept</button>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--footer-->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/footer.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
