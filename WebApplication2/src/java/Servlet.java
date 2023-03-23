
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author oscar
 */
@WebServlet(urlPatterns = {"/Servlet"})

    

public class Servlet extends HttpServlet {


    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String tipo=request.getParameter("nave");
            int numPers=Integer.parseInt(request.getParameter("a"));
            int numNaves=Integer.parseInt(request.getParameter("b"));
            double consumo=Double.parseDouble(request.getParameter("c"));
            int navesTransp=Integer.parseInt(request.getParameter("supre"));
            
            Naves nav = new Naves();
            nav.setTipo(tipo);
            nav.setCombustible(consumo);
            nav.setCantNaves(numNaves);
            nav.setNumPersonas(numPers);
            nav.setNavesTrans(navesTransp);
            
            System.out.println(nav.getNavesTrans());
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Datos</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Tipo de nave " + nav.getTipo() + "</h1>");
            out.println("<p>Cantidad de naves del tipo " + nav.getTipo() + ": " + nav.getCantNaves()+ "</p>");
            out.println("<p>Consumo de cada nave: " + nav.getCombustible()+ "</p>");
            out.println("<p>Personas por nave: " + nav.getNumPersonas() + "</p>");
            out.println("<p>Personas totales: " + nav.pedirDatos() + "</p>");

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
            throws ServletException, IOException {
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
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}