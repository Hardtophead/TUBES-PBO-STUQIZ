/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Pengguna;
import model.tabelModelPengguna;
import dao.daoPengguna;
import dao.interfacePengguna;
import java.util.List;
import view.tampilkanUser;

public class controllertampilkanUser {
    tampilkanUser frame;
    interfacePengguna infcPengguna;
    List<Pengguna> list_pengguna;
    
    public controllertampilkanUser(tampilkanUser frame) {
        this.frame = frame;
        infcPengguna = new daoPengguna();
    }
    
    public void kembali(){
        frame.dispose();
    }
    
    public void load_tabel() {
        list_pengguna = infcPengguna.getUserData(frame.getTxtRole());
        tabelModelPengguna tmp = new tabelModelPengguna(list_pengguna);
        frame.getTabelPengguna().setModel(tmp);
    }
}