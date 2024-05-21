package org.example.services;

import java.sql.ResultSet;
import org.example.dao.CliquesDao;
import model.Cliques;


public class CliquesService {
    public static void InserirCliques(Cliques u) {  
        String query = String.format("insert into tb_cliques (id,x,y,sessa_id) values(%s,'%s','%s','%s')", u.getId(), u.getX(), u.getY(), u.getSessao_id());
        CliquesDao.InsertUpdateDeleteCommand(query);
        System.out.println("Cliques " + u.getId() + " adicionado");
    }
   
    public static void AtualizarCliques(Cliques u) {
        String query = String.format("update tb_cliques set x = '%s' where id = %s", u.getX(), u.getId());
        String query2 = String.format("update tb_cliques set y = '%s' where id = %s", u.getY(), u.getId());
        CliquesDao.InsertUpdateDeleteCommand(query);
        CliquesDao.InsertUpdateDeleteCommand(query2);
    }
   
    public static void ExcluirCliques(int id) {
        String query = String.format("delete from tb_cliques where id = %s", id);
        CliquesDao.InsertUpdateDeleteCommand(query);
    }
   
    public static void ExibirCliquess() {
        String query= "select * from tb_cliques";
       
        ResultSet rs = CliquesDao.SelectCommand(query);
        
        System.out.println("Tabela tb_cliques");
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
   
    public static void ExibirCliques(int id) {
        String query = String.format("select * from tb_cliques where id = %s", id);
        ResultSet rs = CliquesDao.SelectCommand(query);
       
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
