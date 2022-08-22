package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Carnet</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            <h1>GENERAR CARNET</h1><br>\n");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("            <form method=\"post\">\n");
      out.write("                <input type=\"submit\" name=\"persona\" value=\"Estudiante\" >\n");
      out.write("                <input type=\"submit\" name=\"persona\" value=\"Instructor\" >\n");
      out.write("              ");
      out.write("\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("        ");


            if (request.getParameter("persona") != null) {

                if (request.getParameter("persona").equals("Estudiante")) {    
      out.write("\n");
      out.write("\n");
      out.write("        <div>  \n");
      out.write("\n");
      out.write("            <h1>Estudiante</h1>\n");
      out.write("            <br>\n");
      out.write("            <form method=\"post\" action=\"ServletAprendiz\">  \n");
      out.write("                <label>1. Ingrese sus nombres</label><br><br>\n");
      out.write("                <p><input name=\"repsuesta1\" placeholder=\"Ingrese sus nombres\" required></input></p>\n");
      out.write("                <br>\n");
      out.write("                <label>2. Ingrese sus apellidos</label><br><br>\n");
      out.write("                <p><input name=\"repsuesta2\" placeholder=\"Ingrese sus apellido\" required></input></p>\n");
      out.write("                <br>\n");
      out.write("                <label>3. Ingrese su edad</label><br><br>\n");
      out.write("                <p><input name=\"repsuesta3\"  required></input></p>\n");
      out.write("                <br>\n");
      out.write("                <label>4. Ingrese su correo</label><br><br>\n");
      out.write("                <p><input name=\"repsuesta4\" placeholder=\"Ingrese su correo\" required></input></p>\n");
      out.write("                <br>\n");
      out.write("                <label>5. Ingrese su numero de contacto</label><br><br>\n");
      out.write("                <p><input name=\"repsuesta5\" placeholder=\"Ejemplo 123456789\" required></input></p>\n");
      out.write("                <br>\n");
      out.write("                <label>6.Seleccione su programa de formación</label><br><br>\n");
      out.write("                <select name=\"respuesta6\" required>\n");
      out.write("                    <option value=\"1\">ADSI</option>\n");
      out.write("                    <option value=\"2\">COCINA</option>\n");
      out.write("                    <option value=\"3\">NO SE XD</option>\n");
      out.write("                </select>\n");
      out.write("                <br><br>\n");
      out.write("                <label>7. Ingrese su numero de documento</label><br><br>\n");
      out.write("                <p><input name=\"repsuesta7\"required></input></p>\n");
      out.write("                <br>\n");
      out.write("                <input type=\"submit\" value=\"Generar carnet\" >   \n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
  }
            if (request.getParameter("persona").equals("Instructor")) {
            
      out.write("\n");
      out.write("          \n");
      out.write("\n");
      out.write("\n");
      out.write("        <div>  \n");
      out.write("\n");
      out.write("            <h1>Instructor</h1>\n");
      out.write("            <br>\n");
      out.write("            <form method=\"post\" action=\"\">  \n");
      out.write("                <label>1. Ingrese sus nombres</label><br><br>\n");
      out.write("                <p><textarea name=\"repsuesta2\" placeholder=\"Ingrese sus nombres\" required></textarea></p>\n");
      out.write("                <br>\n");
      out.write("                <label>2. Ingrese sus apellidos</label><br><br>\n");
      out.write("                <p><textarea name=\"repsuesta2\" placeholder=\"Ingrese sus apellido\" required></textarea></p>\n");
      out.write("                <br>\n");
      out.write("                <label>3. Ingrese su edad</label><br><br>\n");
      out.write("                <p><textarea name=\"repsuesta2\"  required></textarea></p>\n");
      out.write("                <br>\n");
      out.write("                <label>4. Ingrese su correo</label><br><br>\n");
      out.write("                <p><textarea name=\"repsuesta2\" placeholder=\"Ingrese su correo\" required></textarea></p>\n");
      out.write("                <br>\n");
      out.write("                <label>5. Ingrese su numero de contacto</label><br><br>\n");
      out.write("                <p><textarea name=\"repsuesta2\" placeholder=\"Ejemplo 123456789\" required></textarea></p>\n");
      out.write("                <br>\n");
      out.write("                <label>6.Seleccione su estado</label><br><br>\n");
      out.write("                <input type=\"radio\" name=\"respuesta8\" value=\"1\" required>Activo<br>\n");
      out.write("                <input type=\"radio\" name=\"respuesta8\" value=\"2\" required>Inactivo<br>\n");
      out.write("                <br>\n");
      out.write("                <label>7.Seleccione la materia que dicta</label><br><br>\n");
      out.write("                <select name=\"respuesta2\" required>\n");
      out.write("                    <option value=\"1\">Programación</option>\n");
      out.write("                    <option value=\"2\">Bases de datps</option>\n");
      out.write("                    <option value=\"2\">Ingles</option>\n");
      out.write("                    <option value=\"2\">Proyecto</option>\n");
      out.write("                </select>\n");
      out.write("                <br><br>\n");
      out.write("                <label>8. Ingrese su numero de documento</label><br><br>\n");
      out.write("                <p><textarea name=\"repsuesta2\"required></textarea></p>\n");
      out.write("                <br>\n");
      out.write("                <input type=\"submit\" value=\"Generar carnet\" >   \n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("  ");
 } } 
      out.write("\n");
      out.write("\n");
      out.write("        \n");
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
