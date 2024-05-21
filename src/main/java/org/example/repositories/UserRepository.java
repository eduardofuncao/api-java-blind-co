package org.example.repositories;

import org.example.infrastructure.OracleDbConfiguration;
import org.example.entities.User;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {

    public static final String TB_NAME = "TAB_USERS";

    public List<User> getAll(){
        var users = new ArrayList<User>();
        try(var conn = new OracleDbConfiguration().getConnection();
            var stmt = conn.prepareStatement("SELECT * FROM " + TB_NAME +" ORDER BY ID")){
            var rs = stmt.executeQuery();
            while(rs.next()){
                users.add(new User(
                        rs.getInt("ID"),
                        rs.getString("USERNAME"),
                        rs.getString("PASSWORD"),
                        rs.getString("FIRSTNAME"),
                        rs.getString("LASTNAME"),
                        rs.getString("EMAIL"),
                        rs.getString("PHONE"),
                        rs.getString("ROLE"),
                        rs.getString("COMPANY")));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return users;
    }

    /**
     * Método que retorna uma lista de users de acordo com os filtros e ordenação
     * @param nome Nome do user
     * @param preco Preço do user
     * @param orderBy Coluna para ordenação
     * @param direction Direção da ordenação
     * @param limit Quantidade de registros
     * @param offset Quantidade de registros a serem pulados
     * @return Lista de users
     */




    public Optional<User> get(int id){
        try(var conn = new OracleDbConfiguration().getConnection();
            var stmt = conn.prepareStatement("SELECT * FROM " + TB_NAME + " WHERE ID = ?")
        ){
            stmt.setInt(1, id);
            var rs = stmt.executeQuery();
            if(rs.next()){
                return Optional.of(new User(
                        rs.getInt("ID"),
                        rs.getString("USERNAME"),
                        rs.getString("PASSWORD"),
                        rs.getString("FIRSTNAME"),
                        rs.getString("LASTNAME"),
                        rs.getString("EMAIL"),
                        rs.getString("PHONE"),
                        rs.getString("ROLE"),
                        rs.getString("COMPANY")));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return Optional.empty();
    }

    public void create(User user){
        try(var conn = new OracleDbConfiguration().getConnection();
            var stmt = conn.prepareStatement("INSERT INTO " + TB_NAME + " (ID, USERNAME, PASSWORD, FIRSTNAME, LASTNAME, EMAIL, PHONE, ROLE, COMPANY) VALUES (?,?,?,?,?,?,?,?,?)")){
            stmt.setInt(1, user.getId());
            stmt.setString(2, user.getUsername());
            stmt.setString(3, user.getPassword());
            stmt.setString(4, user.getFirstName());
            stmt.setString(5, user.getLastName());
            stmt.setString(6, user.getEmail());
            stmt.setString(7, user.getPhone());
            stmt.setString(8, user.getRole());
            stmt.setString(9, user.getCompany());






            stmt.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(int id, User user){
        try(var conn = new OracleDbConfiguration().getConnection();
            var stmt = conn.prepareStatement("UPDATE "+ TB_NAME + " SET USERNAME = ?, COMPANY = ? WHERE ID = ?");)
        {
            stmt.setString(1, user.getUsername());
            stmt.setString(2,user.getCompany());
            stmt.setInt(3, id);
            stmt.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int count(String nome){
        try(var conn = new OracleDbConfiguration().getConnection();
            var stmt = conn.prepareStatement("SELECT COUNT(*) FROM " +
                    TB_NAME + " WHERE COMPANY = 'Meta'")){
            var result = stmt.executeQuery();
            if(result.next()){
                return result.getInt(1);
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return 0;
    }

    public void delete(int id){
        try(var conn = new OracleDbConfiguration().getConnection();
            var stmt = conn.prepareStatement("DELETE FROM "+ TB_NAME + " WHERE ID = ?");)
        {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }


}