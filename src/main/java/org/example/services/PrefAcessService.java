package org.example.services;

import java.sql.ResultSet;
import org.example.dao.PrefAcessDao;
import model.PrefAcess;


public class PrefAcessService {
    public static void InserirPrefAcess(PrefAcess u) {  
        String query = String.format("insert into tb_prefacess (id,tipodaltonismo,altocontraste,linkssublinhados,usuario_id) values(%s,'%s','%s','%s','%s')", u.getId(),u.getTipoDaltonismo(), u.getAltoContraste(), u.getLinksSublinhados(), u.getUsuario_id());
        PrefAcessDao.InsertUpdateDeleteCommand(query);
        System.out.println("PrefAcess " + u.getId() + " adicionado");
    }
   
    public static void AtualizarPrefAcess(PrefAcess u) {
        String query = String.format("update tb_prefacess set tipodaltonismo = '%s' where id = %s", u.getTipoDaltonismo(), u.getId());
        PrefAcessDao.InsertUpdateDeleteCommand(query);
    }
   
    public static void ExcluirPrefAcess(int id) {
        String query = String.format("delete from tb_prefacess where id = %s", id);
        PrefAcessDao.InsertUpdateDeleteCommand(query);
    }
   
    public static void ExibirPrefAcesss() {
        String query= "select * from tb_prefacess";
       
        ResultSet rs = PrefAcessDao.SelectCommand(query);
        
        System.out.println("Tabela tb_prefacess");
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
   
    public static void ExibirPrefAcess(int id) {
        String query = String.format("select * from tb_prefacess where id = %s", id);
        ResultSet rs = PrefAcessDao.SelectCommand(query);
       
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
