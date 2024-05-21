package org.example.services;

import java.sql.ResultSet;
import org.example.dao.MatchDao;
import model.Match;


public class MatchService {
    public static void InserirMatch(Match u) {  
        String query = String.format("insert into tb_match (id,datamatch,usuario_id,match_id) values(%s,'%s','%s','%s')", u.getId(), u.getDataMatch(), u.getUsuario_id(), u.getAgente_id());
        MatchDao.InsertUpdateDeleteCommand(query);
        System.out.println("Match " + u.getId() + " adicionado");
    }
   
    public static void AtualizarMatch(Match u) {
        String query = String.format("update tb_match set datamatch = '%s' where id = %s", u.getDataMatch(), u.getId());
        MatchDao.InsertUpdateDeleteCommand(query);
    }
   
    public static void ExcluirMatch(int id) {
        String query = String.format("delete from tb_match where id = %s", id);
        MatchDao.InsertUpdateDeleteCommand(query);
    }
   
    public static void ExibirMatchs() {
        String query= "select * from tb_match";
       
        ResultSet rs = MatchDao.SelectCommand(query);
        
        System.out.println("Tabela tb_match");
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
   
    public static void ExibirMatch(int id) {
        String query = String.format("select * from tb_match where id = %s", id);
        ResultSet rs = MatchDao.SelectCommand(query);
       
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
