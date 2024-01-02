
package controller;

import dao.daoSoal;
import dao.interfaceSoal;
import javax.swing.JOptionPane;
import model.Soal;
import view.H_Dosen;
import view.Login;
import view.tampilkanJawaban;
import view.tampilkanSoal;

public class controllerH_Dosen {
    H_Dosen frame;
    interfaceSoal infcSoal;
    
    public controllerH_Dosen(H_Dosen frame) {
        this.frame = frame;
        infcSoal = new daoSoal();
    }
    
    public void tambahData(){
        Soal soal_baru = new Soal();
        soal_baru.setPertanyaan(frame.getTxtPertanyaan().getText());

        infcSoal.insert(soal_baru);
        JOptionPane.showMessageDialog(frame, "Berhasil menambahkan soal baru");
        
    }
    
    public void logout(){
        frame.dispose();
        new Login().setVisible(true);
    }
    
    public void kosongkan_form(){
        frame.setTxtPertanyaan("");
    }
    
    public void tampilSoal(){
        new tampilkanSoal().setVisible(true);
    }
    
    public void tampilJawaban(){
        new tampilkanJawaban().setVisible(true);
    }
}
