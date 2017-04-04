package br.cesjf.equipamentos.servlet;

import java.io.IOException;
import java.io.PrintWriter;
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

        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //Equipamento equipamento = new Equipamento();
        
        int id = Integer.parseInt(request.getParameter("txtId"));
        String estado = request.getParameter("txtLocal");
        int local = Integer.parseInt(request.getParameter("ddnEstado"));
        
    }


}
