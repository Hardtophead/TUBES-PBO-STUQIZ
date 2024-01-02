/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Soal;
import dao.daoSoal;
import dao.interfaceSoal;
import java.util.List;
import model.tabelModelSoal;
import view.tampilkanSoal;

public class controllertampilkanSoal {
    tampilkanSoal frame;
    interfaceSoal infcSoal;
    List<Soal> list_soal;
    
    public controllertampilkanSoal(tampilkanSoal frame) {
        this.frame = frame;
        infcSoal = new daoSoal();
    }
    
    public void kembali(){
        frame.dispose();
    }
    
    public void load_tabel() {
        list_soal = infcSoal.getSoalData();
        tabelModelSoal tmp = new tabelModelSoal(list_soal);
        frame.getTabelSoal().setModel(tmp);
    }
}
