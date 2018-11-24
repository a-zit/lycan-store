package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div>\r\n");
      out.write("            <!-- Navigation -->\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/header.jsp", out, false);
      out.write("\r\n");
      out.write("            <!--Empty Cart-->\r\n");
      out.write("            <!--            <div style=\"margin-top: 10vh\" class=\"text-center\">     \r\n");
      out.write("                            <h1 class=\"mb-4\">Your Cart is Empty</h1>\r\n");
      out.write("                            <p class=\"mb-5\">There are no products in your shopping cart</p>\r\n");
      out.write("                            <hr class=\"mb-5\" style=\"width:50vw\">\r\n");
      out.write("                            <a href=\"productlist.jsp\">\r\n");
      out.write("                                <button type=\"button\" class=\"btn btn-outline-dark\" >Continue Shopping</button>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>-->\r\n");
      out.write("            <!--Empty Cart End-->\r\n");
      out.write("            <div class=\"container\" style=\"margin-top: 10vh;\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-7 card\">\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <h5>YOUR CART ( 2 )</h5>\r\n");
      out.write("                            <hr>\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-sm-3\">\r\n");
      out.write("                                    <img src=\"image/1.png\" class=\"img-thumbnail\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-sm-6\">\r\n");
      out.write("                                    <div class=\"row\" style=\"font-size: 12px;\">\r\n");
      out.write("                                        <div class=\"col-sm-6\">\r\n");
      out.write("                                            <p>PRODUCT NAME :</p>\r\n");
      out.write("                                            <p>TYPE :</p>\r\n");
      out.write("                                            <p>SIZE :</p>\r\n");
      out.write("                                            <p>QTY :</p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-sm-6\">\r\n");
      out.write("                                            <p>BB SOLID TEE</p>\r\n");
      out.write("                                            <p>T-SHIRTS</p>\r\n");
      out.write("                                            <p> M </p>\r\n");
      out.write("                                            <p> 1</p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-sm-3\">\r\n");
      out.write("                                    <p>999 ฿</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"text-right\">\r\n");
      out.write("                            <button type=\"button\" class=\"btn btn-outline-secondary\">Remove</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <hr>\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-sm-3\">\r\n");
      out.write("                                    <img src=\"image/3.png\" class=\"img-thumbnail\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-sm-6\">\r\n");
      out.write("                                    <div class=\"row\" style=\"font-size: 12px;\">\r\n");
      out.write("                                        <div class=\"col-sm-6\">\r\n");
      out.write("                                            <p>PRODUCT NAME :</p>\r\n");
      out.write("                                            <p>TYPE :</p>\r\n");
      out.write("                                            <p>SIZE :</p>\r\n");
      out.write("                                            <p>QTY :</p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-sm-6\">\r\n");
      out.write("                                            <p>ESSENTIALS LINEAR TEE</p>\r\n");
      out.write("                                            <p>T-SHIRTS</p>\r\n");
      out.write("                                            <p> M </p>\r\n");
      out.write("                                            <p> 1</p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-sm-3\">\r\n");
      out.write("                                    <p>1000 ฿</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"text-right\">\r\n");
      out.write("                            <button type=\"button\" class=\"btn btn-outline-secondary\">Remove</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <hr>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-1\"></div>\r\n");
      out.write("                    <div class=\"col-sm-4 card text-white bg-dark mb-3\" style=\"height: 35vh\">\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <h5>SUMMARY</h5>\r\n");
      out.write("                            <hr>\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-sm-9\">\r\n");
      out.write("                                    <p>SUBTOTAL</p>\r\n");
      out.write("                                    <p>ESTIMATED DUTIES & TAXES</p>\r\n");
      out.write("                                    <p>TOTAL</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-sm-3\">\r\n");
      out.write("                                    <p>1999 ฿</p>\r\n");
      out.write("                                    <p>100 ฿</p>\r\n");
      out.write("                                    <p>2099 ฿</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <hr>\r\n");
      out.write("                            \r\n");
      out.write("\r\n");
      out.write("                            <div class=\"text-center\">\r\n");
      out.write("                                <a href=\"payment.jsp\"><button type=\"button\" class=\"btn btn-outline-warning\">CHECKOUT</button></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!--Footer-->\r\n");
      out.write("            <div style=\"position: fixed; bottom: 0;width: 100%;\">\r\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/footer.jsp", out, false);
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
