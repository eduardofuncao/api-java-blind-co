package org.example.services;

import java.sql.ResultSet;
import org.example.dao.AcessosDao;
import model.Acessos;


public class AcessosService {
    public static void InserirAcessos(Acessos u) {  
        String query = String.format("insert into tb_acessos (id,pagina,duracao,sessao_id) values(%s,'%s','%s','%s')", u.getId(), u.getPagina(), u.getDuracao(), u.getSessao_id());
        AcessosDao.InsertUpdateDeleteCommand(query);
        System.out.println("Acessos " + u.getId() + " adicionado");
    }
   
    public static void AtualizarAcessos(Acessos u) {
        String query = String.format("update tb_acessos set pagina = '%s' where id = %s", u.getPagina(), u.getId());
        AcessosDao.InsertUpdateDeleteCommand(query);
    }
   
    public static void ExcluirAcessos(int id) {
        String query = String.format("delete from tb_acessos where id = %s", id);
        AcessosDao.InsertUpdateDeleteCommand(query);
    }
   
    public static void ExibirAcessoss() {
        String query= "select * from tb_acessos";
       
        ResultSet rs = AcessosDao.SelectCommand(query);
        
        System.out.println("Tabela tb_acessos");
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
   
    public static void ExibirAcessos(int id) {
        String query = String.format("select * from tb_acessos where id = %s", id);
        ResultSet rs = AcessosDao.SelectCommand(query);
       
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
