package br.cesjf.equipamentos.servlet;

import br.cesjf.equipamentos.dados.Equipamento;
import br.cesjf.equipamentos.dados.EquipamentoDAO;
import java.io.IOException;
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
@WebServlet(name = "EditaEquipamentoServlet", urlPatterns = {"/edita.html"})
public class EditaEquipamentoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Equipamento equipamento = new Equipamento();
        int id = Integer.parseInt(request.getParameter("id"));
        
        try {
            equipamento = EquipamentoDAO.pesquisaEquipamentoId(id);
        } catch (Exception ex) {
            Logger.getLogger(EditaEquipamentoServlet.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        request.setAttribute("equipamentoEdt", equipamento);
        request.getRequestDispatcher("WEB-INF/editaEquipamento.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //Equipamento equipamento = new Equipamento();
        
        int id = Integer.parseInt(request.getParameter("txtId"));
        String estado = request.getParameter("txtLocal");
        int local = Integer.parseInt(request.getParameter("ddnEstado"));
        
        try {
        
            EquipamentoDAO.editarEquipamento(id, estado, local);
        
        } catch (Exception ex) {
            Logger.getLogger(EditaEquipamentoServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        response.sendRedirect("lista.html");
    }


}
