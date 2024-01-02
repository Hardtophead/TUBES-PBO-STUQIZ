/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import controller.Koneksi;
import model.Pengguna;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class daoPengguna implements interfacePengguna {
    Connection connection;
    final String insert = "INSERT INTO users VALUES (?, ?, ?, ?, ?);";
    final String select = "SELECT * FROM users where level = ?;";
    final String selectLogin = "SELECT * FROM users where email = ? and password = ? and level = ?;";
    
    public daoPengguna() {
        connection = Koneksi.getKoneksi();
    }
    
    @Override
    public void insert(Pengguna Pengguna1) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insert);
            statement.setString(1, Pengguna1.getId());
            statement.setString(2, Pengguna1.getNama());
            statement.setString(3, Pengguna1.getEmail());
            statement.setString(4, Pengguna1.getPassword());
            statement.setString(5, Pengguna1.getRole());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    @Override
    public List< Pengguna> getUserData(String Role) {
        List<Pengguna> listPengguna = null;
        try {
            listPengguna = new ArrayList<Pengguna>();
            PreparedStatement st = connection.prepareStatement(select);
            st.setString(1, Role);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Pengguna Pengguna1 = new Pengguna();
                Pengguna1.setId(rs.getString("id"));
                Pengguna1.setNama(rs.getString("nama"));
                Pengguna1.setEmail(rs.getString("email"));
                listPengguna.add(Pengguna1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Pengguna.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listPengguna;
    }
    
    @Override
    public int login(String email, String pass, String role) {
        try {
            PreparedStatement st = connection.prepareStatement(selectLogin);
            st.setString(1, email);
            st.setString(2, pass);
            st.setString(3, role);
            ResultSet rs = st.executeQuery();
            
             if (rs.next()){
                return 1;
             } else{
                return 2;
             }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return 0;
        }
    }
    
    @Override
    public Pengguna userData(String email, String pass, String role) {
        try {
            PreparedStatement st = connection.prepareStatement(selectLogin);
            st.setString(1, email);
            st.setString(2, pass);
            st.setString(3, role);
            ResultSet rs = st.executeQuery();
            
             if (rs.next()){
                Pengguna Pengguna1 = new Pengguna();
                Pengguna1.setId(rs.getString("id"));
                Pengguna1.setNama(rs.getString("nama"));
                Pengguna1.setEmail(rs.getString("email"));
              
                return Pengguna1;
             }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        Pengguna Pengguna1 = new Pengguna();
        return Pengguna1;
    }
}
