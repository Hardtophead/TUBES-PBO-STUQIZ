/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import controller.Koneksi;
import model.Soal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;

public class daoSoal implements interfaceSoal {
    Connection connection;
    final String insert = "INSERT INTO `soal`(`pertanyaan`) VALUES (?)";
    final String select = "SELECT * FROM soal";
    
    public daoSoal() {
        connection = Koneksi.getKoneksi();
    }
    
    @Override
    public void insert(Soal Soal1) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insert);
            statement.setString(1, Soal1.getPertanyaan());
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
    public List<Soal> getSoalData() {
        List<Soal> listSoal = null;
        try {
            listSoal = new ArrayList<Soal>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                Soal Soal1 = new Soal();
                Soal1.setId(rs.getString("id"));
                Soal1.setPertanyaan(rs.getString("pertanyaan"));
                listSoal.add(Soal1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Soal.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listSoal;
    }
}
