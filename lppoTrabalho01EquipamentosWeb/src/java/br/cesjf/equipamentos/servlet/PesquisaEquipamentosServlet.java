package br.cesjf.equipamentos.servlet;

import br.cesjf.equipamentos.dados.Equipamento;
import br.cesjf.equipamentos.dados.EquipamentoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
@WebServlet(name = "PesquisaEquipamentos", urlPatterns = {"/pesquisa.html"})
public class PesquisaEquipamentosServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Equipamento> lstEquipamentos = new ArrayList<>();
        int estadoPesquisa = Integer.parseInt(request.getParameter("ddnEstado"));
        
        try {
            if(estadoPesquisa == 9){
                lstEquipamentos = EquipamentoDAO.listarEquipamentos();
            }else{
                lstEquipamentos = EquipamentoDAO.pesquisaEquipamentoEstado(estadoPesquisa);
            }
        } catch (Exception ex) {
            Logger.getLogger(PesquisaEquipamentosServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        request.setAttribute("equipamentos", lstEquipamentos);
        request.setAttribute("ddnEstado", estadoPesquisa);
        request.getRequestDispatcher("WEB-INF/listaEquipamento.jsp").forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.sendRedirect("lista.html");
    }

}
