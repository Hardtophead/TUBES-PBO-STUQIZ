/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Jawaban;
import dao.daoJawaban;
import dao.interfaceJawaban;
import java.util.List;
import model.tabelModelJawaban;
import view.tampilkanJawaban;

public class controllertampilkanJawaban {
    tampilkanJawaban frame;
    interfaceJawaban infcJawaban;
    List<Jawaban> list_jawaban;
    
    public controllertampilkanJawaban(tampilkanJawaban frame) {
        this.frame = frame;
        infcJawaban = new daoJawaban();
    }
    
    public void kembali(){
        frame.dispose();
    }
    
    public void load_tabel() {
        list_jawaban = infcJawaban.getJawabanData();
        tabelModelJawaban tmp = new tabelModelJawaban(list_jawaban);
        frame.getTabelJawaban().setModel(tmp);
    }
}
