package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class productlist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta\n");
      out.write("            name=\"viewport\"\n");
      out.write("            content=\"width=device-width, initial-scale=1, shrink-to-fit=no\"\n");
      out.write("            />\n");
      out.write("        <meta name=\"description\" content=\"\" />\n");
      out.write("        <meta name=\"author\" content=\"\" />\n");
      out.write("\n");
      out.write("        <title>Product - Page</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/mystyle.css\" />\n");
      out.write("        <link\n");
      out.write("            href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\"\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            id=\"bootstrap-css\"\n");
      out.write("            />\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core CSS -->\n");
      out.write("        <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("        <!-- Custom styles for this template -->\n");
      out.write("        <link href=\"css/heroic-features.css\" rel=\"stylesheet\" />\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\"\n");
      out.write("            integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\"\n");
      out.write("            crossorigin=\"anonymous\"\n");
      out.write("            />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Navigation -->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Page Content -->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <!-- Jumbotron Header -->\n");
      out.write("            <header class=\"jumbotron my-4\">\n");
      out.write("                <h1 class=\"display-3\">A Warm Welcome!</h1>\n");
      out.write("                <p class=\"lead\">\n");
      out.write("                    Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ipsa, ipsam,\n");
      out.write("                    eligendi, in quo sunt possimus non incidunt odit vero aliquid\n");
      out.write("                    similique quaerat nam nobis illo aspernatur vitae fugiat numquam\n");
      out.write("                    repellat.\n");
      out.write("                </p>\n");
      out.write("                <a href=\"#\" class=\"btn btn-primary btn-lg\">Call to action!</a>\n");
      out.write("            </header>\n");
      out.write("            <!-- Search -->\n");
      out.write("            <div class=\"mb-4 row justify-content-center\">\n");
      out.write("                <div class=\"col-12 col-md-10 col-lg-8\">\n");
      out.write("                    <form class=\"card card-sm\">\n");
      out.write("                        <div class=\"card-body row no-gutters align-items-center\">\n");
      out.write("                            <div class=\"col-auto\">\n");
      out.write("                                <i class=\"fas fa-search h4 text-body\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- end of col -->\n");
      out.write("                            <div class=\"col\">\n");
      out.write("                                <input\n");
      out.write("                                    class=\"form-control form-control-lg form-control-borderless\"\n");
      out.write("                                    type=\"search\"\n");
      out.write("                                    placeholder=\"Search topics or keywords\"\n");
      out.write("                                    />\n");
      out.write("                            </div>\n");
      out.write("                            <!-- end of col -->\n");
      out.write("                            <div class=\"col-auto\">\n");
      out.write("                                <button class=\"btn btn-lg btn-success\" type=\"submit\">\n");
      out.write("                                    Search\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- end of col -->\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <!-- end of col -->\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Page Features -->\n");
      out.write("            <div class=\"row text-center\">\n");
      out.write("                <div class=\"col-lg-3 col-md-6 mb-4\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <img\n");
      out.write("                            class=\"card-img-top\"\n");
      out.write("                            src=\"./image/2.png\"\n");
      out.write("                            alt=\"\"\n");
      out.write("                            />\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <h4 class=\"card-title\">Card title</h4>\n");
      out.write("                            <p class=\"card-text\">\n");
      out.write("                                Lorem ipsum dolor sit amet, consectetur adipisicing elit.\n");
      out.write("                                Sapiente esse necessitatibus neque.\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-footer\">\n");
      out.write("                            <a href=\"productDetail.jsp\" class=\"btn btn-primary\">Find Out More!</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-lg-3 col-md-6 mb-4\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <img\n");
      out.write("                            class=\"card-img-top\"\n");
      out.write("                            src=\"./image/4.png\"\n");
      out.write("                            alt=\"\"\n");
      out.write("                            />\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <h4 class=\"card-title\">Card title</h4>\n");
      out.write("                            <p class=\"card-text\">\n");
      out.write("                                Lorem ipsum dolor sit amet, consectetur adipisicing elit.\n");
      out.write("                                Explicabo magni sapiente, tempore debitis beatae culpa natus\n");
      out.write("                                architecto.\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-footer\">\n");
      out.write("                            <a href=\"productDetail.jsp\" class=\"btn btn-primary\">Find Out More!</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-lg-3 col-md-6 mb-4\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <img\n");
      out.write("                            class=\"card-img-top\"\n");
      out.write("                            src=\"./image/2.png\"\n");
      out.write("                            alt=\"\"\n");
      out.write("                            />\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <h4 class=\"card-title\">Card title</h4>\n");
      out.write("                            <p class=\"card-text\">\n");
      out.write("                                Lorem ipsum dolor sit amet, consectetur adipisicing elit.\n");
      out.write("                                Sapiente esse necessitatibus neque.\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-footer\">\n");
      out.write("                            <a href=\"productDetail.jsp\" class=\"btn btn-primary\">Find Out More!</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-lg-3 col-md-6 mb-4\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <img\n");
      out.write("                            class=\"card-img-top\"\n");
      out.write("                            src=\"./image/4.png\"\n");
      out.write("                            alt=\"\"\n");
      out.write("                            />\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <h4 class=\"card-title\">Card title</h4>\n");
      out.write("                            <p class=\"card-text\">\n");
      out.write("                                Lorem ipsum dolor sit amet, consectetur adipisicing elit.\n");
      out.write("                                Explicabo magni sapiente, tempore debitis beatae culpa natus\n");
      out.write("                                architecto.\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-footer\">\n");
      out.write("                            <a href=\"productDetail.jsp\" class=\"btn btn-primary\">Find Out More!</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.row -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /.container -->\n");
      out.write("\n");
      out.write("        <!-- Footer -->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/footer.jsp", out, false);
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <script>\n");
      out.write("        // Get the modal\n");
      out.write("        var modal = document.getElementById(\"myModal\");\n");
      out.write("\n");
      out.write("        // Get the button that opens the modal\n");
      out.write("        var btn = document.getElementById(\"myBtn\");\n");
      out.write("\n");
      out.write("        // Get the <span> element that closes the modal\n");
      out.write("        var span = document.getElementsByClassName(\"close\")[0];\n");
      out.write("\n");
      out.write("        // When the user clicks the button, open the modal\n");
      out.write("        btn.onclick = function () {\n");
      out.write("            modal.style.display = \"block\";\n");
      out.write("        };\n");
      out.write("\n");
      out.write("        // When the user clicks on <span> (x), close the modal\n");
      out.write("        span.onclick = function () {\n");
      out.write("            modal.style.display = \"none\";\n");
      out.write("        };\n");
      out.write("\n");
      out.write("        // When the user clicks anywhere outside of the modal, close it\n");
      out.write("        window.onclick = function (event) {\n");
      out.write("            if (event.target == modal) {\n");
      out.write("                modal.style.display = \"none\";\n");
      out.write("            }\n");
      out.write("        };\n");
      out.write("    </script>\n");
      out.write("    <!-- Bootstrap core JavaScript -->\n");
      out.write("    <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("    <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("</body>\n");
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
