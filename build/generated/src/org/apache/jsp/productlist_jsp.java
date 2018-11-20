package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class productlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\" />\r\n");
      out.write("        <meta\r\n");
      out.write("            name=\"viewport\"\r\n");
      out.write("            content=\"width=device-width, initial-scale=1, shrink-to-fit=no\"\r\n");
      out.write("            />\r\n");
      out.write("        <meta name=\"description\" content=\"\" />\r\n");
      out.write("        <meta name=\"author\" content=\"\" />\r\n");
      out.write("\r\n");
      out.write("        <title>Product - Page</title>\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/mystyle.css\" />\r\n");
      out.write("        <link\r\n");
      out.write("            href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\"\r\n");
      out.write("            rel=\"stylesheet\"\r\n");
      out.write("            id=\"bootstrap-css\"\r\n");
      out.write("            />\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap core CSS -->\r\n");
      out.write("        <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom styles for this template -->\r\n");
      out.write("        <link href=\"css/heroic-features.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <link\r\n");
      out.write("            rel=\"stylesheet\"\r\n");
      out.write("            href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\"\r\n");
      out.write("            integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\"\r\n");
      out.write("            crossorigin=\"anonymous\"\r\n");
      out.write("            />\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- Navigation -->\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Page Content -->\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <!-- Jumbotron Header -->\r\n");
      out.write("            <header class=\"jumbotron my-4\">\r\n");
      out.write("                <h1 class=\"display-3\">A Warm Welcome!</h1>\r\n");
      out.write("                <p class=\"lead\">\r\n");
      out.write("                    Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ipsa, ipsam,\r\n");
      out.write("                    eligendi, in quo sunt possimus non incidunt odit vero aliquid\r\n");
      out.write("                    similique quaerat nam nobis illo aspernatur vitae fugiat numquam\r\n");
      out.write("                    repellat.\r\n");
      out.write("                </p>\r\n");
      out.write("                <a href=\"#\" class=\"btn btn-primary btn-lg\">Call to action!</a>\r\n");
      out.write("            </header>\r\n");
      out.write("            <!-- Search -->\r\n");
      out.write("            <div class=\"mb-4 row justify-content-center\">\r\n");
      out.write("                <div class=\"col-12 col-md-10 col-lg-8\">\r\n");
      out.write("                    <form class=\"card card-sm\">\r\n");
      out.write("                        <div class=\"card-body row no-gutters align-items-center\">\r\n");
      out.write("                            <div class=\"col-auto\">\r\n");
      out.write("                                <i class=\"fas fa-search h4 text-body\"></i>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- end of col -->\r\n");
      out.write("                            <div class=\"col\">\r\n");
      out.write("                                <input\r\n");
      out.write("                                    class=\"form-control form-control-lg form-control-borderless\"\r\n");
      out.write("                                    type=\"search\"\r\n");
      out.write("                                    placeholder=\"Search topics or keywords\"\r\n");
      out.write("                                    />\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- end of col -->\r\n");
      out.write("                            <div class=\"col-auto\">\r\n");
      out.write("                                <button class=\"btn btn-lg btn-success\" type=\"submit\">\r\n");
      out.write("                                    Search\r\n");
      out.write("                                </button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- end of col -->\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- end of col -->\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Page Features -->\r\n");
      out.write("            <div class=\"row text-center\">\r\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("   \r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.row -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.container -->\r\n");
      out.write("\r\n");
      out.write("        <!-- Footer -->\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/footer.jsp", out, false);
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <script>\r\n");
      out.write("        // Get the modal\r\n");
      out.write("        var modal = document.getElementById(\"myModal\");\r\n");
      out.write("\r\n");
      out.write("        // Get the button that opens the modal\r\n");
      out.write("        var btn = document.getElementById(\"myBtn\");\r\n");
      out.write("\r\n");
      out.write("        // Get the <span> element that closes the modal\r\n");
      out.write("        var span = document.getElementsByClassName(\"close\")[0];\r\n");
      out.write("\r\n");
      out.write("        // When the user clicks the button, open the modal\r\n");
      out.write("        btn.onclick = function () {\r\n");
      out.write("            modal.style.display = \"block\";\r\n");
      out.write("        };\r\n");
      out.write("\r\n");
      out.write("        // When the user clicks on <span> (x), close the modal\r\n");
      out.write("        span.onclick = function () {\r\n");
      out.write("            modal.style.display = \"none\";\r\n");
      out.write("        };\r\n");
      out.write("\r\n");
      out.write("        // When the user clicks anywhere outside of the modal, close it\r\n");
      out.write("        window.onclick = function (event) {\r\n");
      out.write("            if (event.target == modal) {\r\n");
      out.write("                modal.style.display = \"none\";\r\n");
      out.write("            }\r\n");
      out.write("        };\r\n");
      out.write("    </script>\r\n");
      out.write("    <!-- Bootstrap core JavaScript -->\r\n");
      out.write("    <script src=\"vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("</body>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("p");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                    <div class=\"col-lg-3 col-md-6 mb-4\">\r\n");
          out.write("                        <div class=\"card\">\r\n");
          out.write("                            <img\r\n");
          out.write("                                class=\"card-img-top\"\r\n");
          out.write("                                src=\"./image/2.png\"\r\n");
          out.write("                                alt=\"\"\r\n");
          out.write("                                />\r\n");
          out.write("                            <div class=\"card-body\">\r\n");
          out.write("                                <h4 class=\"card-title\">Card title</h4>\r\n");
          out.write("                                <p class=\"card-text\">\r\n");
          out.write("                                    Lorem ipsum dolor sit amet, consectetur adipisicing elit.\r\n");
          out.write("                                    Sapiente esse necessitatibus neque.\r\n");
          out.write("                                </p>\r\n");
          out.write("                            </div>\r\n");
          out.write("                            <div class=\"card-footer\">\r\n");
          out.write("                                <a href=\"productDetail.jsp\" class=\"btn btn-primary\">Find Out More!</a>\r\n");
          out.write("                            </div>\r\n");
          out.write("                        </div>\r\n");
          out.write("                    </div>    \r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
