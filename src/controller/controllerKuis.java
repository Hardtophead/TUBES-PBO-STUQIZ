/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.daoJawaban;
import model.Soal;
import dao.daoSoal;
import dao.interfaceJawaban;
import dao.interfaceSoal;
import java.util.List;
import javax.swing.JOptionPane;
import model.Jawaban;
import view.Kuis;

public class controllerKuis {
    Kuis frame;
    interfaceSoal infcSoal;
    interfaceJawaban infcjawaban;
    List<Soal> list_soal;
    int x = 0;
    
    public controllerKuis(Kuis frame) {
        this.frame = frame;
        infcSoal = new daoSoal();
        infcjawaban = new daoJawaban();
    }
    
    public void kembali(){
        frame.dispose();
    }
    
    public void load_data() {
        list_soal = infcSoal.getSoalData();
        if(x >= 0 && x < list_soal.size()){
        frame.setTxtPertanyaan(list_soal.get(x).getPertanyaan());
        } else{
             JOptionPane.showMessageDialog(frame, "Soal habis");
        }
    }
    
    public void next() {
        x = x + 1;
        frame.setTxtPertanyaan("");
        frame.setTxtJawaban("");
    }
    
    public void tambahJawaban(String nim){
        Jawaban Jawaban_baru = new Jawaban();
        Jawaban_baru.setNim(nim);
        Jawaban_baru.setId_soal(list_soal.get(x).getId());
        Jawaban_baru.setSoal(list_soal.get(x).getPertanyaan());
        Jawaban_baru.setJawaban(frame.getTxtJawaban().getText());

        infcjawaban.insert(Jawaban_baru);
        JOptionPane.showMessageDialog(frame, "Berhasil menambahkan jawaban");
        
    }
}
