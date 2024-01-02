/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import controller.Koneksi;
import model.Jawaban;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;

public class daoJawaban implements interfaceJawaban {
    Connection connection;
    final String insert = "INSERT INTO `jawaban`(`nim`, `id_soal`, `soal`, `jawaban`) VALUES (?, ?, ?, ?)";
    final String select = "SELECT * FROM jawaban";
    
    public daoJawaban() {
        connection = Koneksi.getKoneksi();
    }
    
    @Override
    public void insert(Jawaban Jawaban1) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insert);
            statement.setString(1, Jawaban1.getNim());
            statement.setString(2, Jawaban1.getId_soal());
            statement.setString(3, Jawaban1.getSoal());
            statement.setString(4, Jawaban1.getJawaban());
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
    public List<Jawaban> getJawabanData() {
        List<Jawaban> listJawaban = null;
        try {
            listJawaban = new ArrayList<Jawaban>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                Jawaban Jawaban1 = new Jawaban();
                Jawaban1.setId(rs.getString("id"));
                Jawaban1.setNim(rs.getString("nim"));
                Jawaban1.setSoal(rs.getString("soal"));
                Jawaban1.setJawaban(rs.getString("jawaban"));
                
                listJawaban.add(Jawaban1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Jawaban.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listJawaban;
    }
}
