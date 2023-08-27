

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns =
{
    "/ProductosSV"
})
public class ProductosSV extends HttpServlet
{

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
       String accion =  request.getParameter("accion");
       List<FileItem> items = null;
       
        switch (accion)
        {
            case "Guardar":
                ArrayList<String> lista = new ArrayList<>();
                try
                {
                   FileItemFactory file = new DiskFileItemFactory();
                    ServletFileUpload fileUpload = new ServletFileUpload(file);
                   items =  fileUpload.parseRequest((RequestContext) request);
                    for (int i = 0; i < items.size(); i++) {
                        FileItem fileItem = (FileItem) items.get(i);
                        if (!fileItem.isFormField()) {
                            File f = new File("C:\\Users\\Emilio\\Documents\\GitHub\\JavaWebMVCProductosImgs\\WebApplication1\\imagenes" + fileItem.getName());
                            fileItem.write(f);
                            producto.setRuta("http://localhost/img/"+fileItem.getName());
                        } else {
                            lista.add(fileItem.getString());
                        }
                    }
                    producto.setNombre(lista.get(0));
                    productoDAO.AgregarProducto(producto);
                    
                }
                catch (Exception e)
                {
                    System.out.println("ERROR  en ProductoSV: " + e.getMessage());
                }
                
                request.getRequestDispatcher("ProductoSV?accion=Listar").forward(request, response);
                break;
            case  "Listar":
                request.getRequestDispatcher("listar.jsp").forward(request, response);
                System.out.println("Mostrando los datos!");
            break;
            default:
                throw new AssertionError();
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
