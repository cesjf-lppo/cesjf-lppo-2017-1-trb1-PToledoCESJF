package br.cesjf.equipamentos.dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Paulo
 */
public class EquipamentoDAO {

    private static Connection conexao;
    private static Statement operacao;
    private static ResultSet resultado;

    public static boolean abrirConexao() throws ClassNotFoundException, SQLException {

        boolean aberto = true;

        if (conexao == null) {
            try {

                String url = "jdbc:derby://localhost:1527/lppo-2017-1";

                Class.forName("org.apache.derby.jdbc.ClientDriver");
                conexao = DriverManager.getConnection(url, "usuario", "senha");

                operacao = conexao.createStatement();

                aberto = true;
            } catch (Exception e) {
                aberto = false;
            }
        }

        return aberto;
    }

    public static void novoEquipamento(Equipamento equipamento) throws SQLException, ClassNotFoundException {

        if (abrirConexao()) {

            String serie = equipamento.getSerie();
            String local = equipamento.getLocal();
            String descricao = equipamento.getDescricao();
            int estado = equipamento.getEstado();

            operacao.executeUpdate("INSERT INTO equipamento(serie, local, descricao, estado) VALUES('"
                    + serie + "', '"
                    + local + "', '"
                    + descricao + "', "
                    + estado + ")");
        }
    }

    public static List<Equipamento> listarEquipamentos() throws ClassNotFoundException, SQLException {

        List<Equipamento> lstEquipamento = null;
        if (abrirConexao()) {
            
            lstEquipamento = new ArrayList<>();

            resultado = operacao.executeQuery("SELECT * FROM equipamento ORDER BY local");

            while (resultado.next()) {
                Equipamento equipamentoAtual = new Equipamento();
                equipamentoAtual.setId(resultado.getLong("id"));
                equipamentoAtual.setSerie(resultado.getString("serie"));
                equipamentoAtual.setLocal(resultado.getString("local"));
                equipamentoAtual.setDescricao(resultado.getString("descricao"));
                equipamentoAtual.setEstado(resultado.getInt("estado"));
                lstEquipamento.add(equipamentoAtual);
            }
        }
        return lstEquipamento;
    }
    
    public static List<Equipamento> pesquisaEquipamentoEstado(String filtro) throws ClassNotFoundException, SQLException{
        
        List<Equipamento> lstEquipamentos = new ArrayList<>();
        if(abrirConexao()){
                        
            resultado = operacao.executeQuery("SELECT * FROM equipamento WHERE estado=" + filtro);
            while(resultado.next()){
                Equipamento equipamentoAtual = new Equipamento();
                equipamentoAtual.setId(resultado.getLong("id"));
                equipamentoAtual.setSerie(resultado.getString("serie"));
                equipamentoAtual.setLocal(resultado.getString("local"));
                equipamentoAtual.setDescricao(resultado.getString("descricao"));
                equipamentoAtual.setEstado(resultado.getInt("estado"));
                lstEquipamentos.add(equipamentoAtual);
            }
        }
        return lstEquipamentos;
    }
    
    public static Equipamento pesquisaEquipamentoId(int filtro) throws ClassNotFoundException, SQLException{
        
        Equipamento equipamento = new Equipamento();
        if(abrirConexao()){
                        
            resultado = operacao.executeQuery("SELECT * FROM equipamento WHERE id=" + filtro);
            if(resultado.next()){
                equipamento.setId(resultado.getLong("id"));
                equipamento.setSerie(resultado.getString("serie"));
                equipamento.setLocal(resultado.getString("local"));
                equipamento.setDescricao(resultado.getString("descricao"));
                equipamento.setEstado(resultado.getInt("estado"));
            }
        }
        return equipamento;
    }
    
    public static void editarEquipamento(int id, String local, int estado) throws SQLException, ClassNotFoundException{
        if(abrirConexao()){
            
            operacao.executeUpdate("UPDATE equipamento SET local= '"
                    + local +"', estado= " + estado + " WHERE id=" +id);

        }
    }
    
    public static void excluirEquipamento(int id) throws ClassNotFoundException, SQLException{
        if(abrirConexao()){
            
            operacao.executeUpdate("DELETE FROM equipamento WHERE id=" +id);
            
        }
    }
}
