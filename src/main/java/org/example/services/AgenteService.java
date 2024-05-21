package org.example.services;

import java.sql.ResultSet;
import org.example.dao.AgenteDao;
import model.Agente;


public class AgenteService {
    public static void InserirAgente(Agente u) {  
        String query = String.format("insert into tb_agente (id,nome,telefone,email) values(%s,'%s','%s','%s')", u.getId(), u.getNome(), u.getTelefone(), u.getEmail());
        AgenteDao.InsertUpdateDeleteCommand(query);
        System.out.println("Agente " + u.getNome() + " adicionado");
    }
   
    public static void AtualizarAgente(Agente u) {
        String query = String.format("update tb_agente set nome = '%s' where id = %s", u.getNome(), u.getId());
        AgenteDao.InsertUpdateDeleteCommand(query);
    }
   
    public static void ExcluirAgente(int id) {
        String query = String.format("delete from tb_agente where id = %s", id);
        AgenteDao.InsertUpdateDeleteCommand(query);
    }
   
    public static void ExibirAgentes() {
        String query= "select * from tb_agente";
       
        ResultSet rs = AgenteDao.SelectCommand(query);
        
        System.out.println("Tabela tb_agente");
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
   
    public static void ExibirAgente(int id) {
        String query = String.format("select * from tb_agente where id = %s", id);
        ResultSet rs = AgenteDao.SelectCommand(query);
       
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
