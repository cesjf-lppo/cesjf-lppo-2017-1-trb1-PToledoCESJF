package br.cesjf.equipamentos.servlet;

import br.cesjf.equipamentos.dados.EquipamentoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Paulo
 */
@WebServlet(name = "ExcluiEquipamentoServlet", urlPatterns = {"/exclui.html"})
public class ExcluiEquipamentoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        try {
           
            EquipamentoDAO.excluirEquipamento(id);
            
        } catch (Exception ex) {
            Logger.getLogger(ExcluiEquipamentoServlet.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        response.sendRedirect("lista.html");
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
