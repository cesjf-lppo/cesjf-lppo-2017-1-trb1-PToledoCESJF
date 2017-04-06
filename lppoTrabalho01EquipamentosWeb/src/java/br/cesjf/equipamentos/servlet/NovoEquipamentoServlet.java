package br.cesjf.equipamentos.servlet;

import br.cesjf.equipamentos.dados.*;
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
@WebServlet(name = "NovoEquipamento", urlPatterns = {"/novo.html"})
public class NovoEquipamentoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.getRequestDispatcher("WEB-INF/novoEquipamento.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Equipamento equipamento = new Equipamento();
        
        equipamento.setSerie(request.getParameter("txtSerie"));
        equipamento.setLocal(request.getParameter("txtLocal"));
        equipamento.setDescricao(request.getParameter("txtDescricao"));
        equipamento.setEstado(Integer.parseInt(request.getParameter("ddnEstado")));
        
        try {

            EquipamentoDAO.novoEquipamento(equipamento);

        } catch (Exception ex) {
            Logger.getLogger(NovoEquipamentoServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        response.sendRedirect("novo.html");
    }
    
}
