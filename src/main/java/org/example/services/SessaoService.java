package org.example.services;

import java.sql.ResultSet;
import org.example.dao.SessaoDao;
import model.Sessao;


public class SessaoService {
    public static void InserirSessao(Sessao u) {  
        String query = String.format("insert into tb_sessao (id,horainicio,duracao,usuario_id) values(%s,'%s','%s','%s')", u.getId(), u.getHoraInicio(), u.getDuracao(), u.getUsuario_id());
        SessaoDao.InsertUpdateDeleteCommand(query);
        System.out.println("Sessao " + u.getId() + " adicionado");
    }
   
    public static void AtualizarSessao(Sessao u) {
        String query = String.format("update tb_sessao set horainicio = '%s' where id = %s", u.getHoraInicio(), u.getId());
        SessaoDao.InsertUpdateDeleteCommand(query);
    }
   
    public static void ExcluirSessao(int id) {
        String query = String.format("delete from tb_sessao where id = %s", id);
        SessaoDao.InsertUpdateDeleteCommand(query);
    }
   
    public static void ExibirSessaos() {
        String query= "select * from tb_sessao";
       
        ResultSet rs = SessaoDao.SelectCommand(query);
        
        System.out.println("Tabela tb_sessao");
        try {
            while(rs.next()){
                System.out.print(rs.getString("id")+" ");
                System.out.println(rs.getString("nome"));
            }
        }
        catch (Exception e){
                System.out.println(e);
        }  
    }
   
    public static void ExibirSessao(int id) {
        String query = String.format("select * from tb_sessao where id = %s", id);
        ResultSet rs = SessaoDao.SelectCommand(query);
       
        try {
            while(rs.next()){
                System.out.print(rs.getString("id")+" ");
                System.out.println(rs.getString("nome"));
            }
        }
        catch (Exception e){
                System.out.println(e);
        }
    }


}
