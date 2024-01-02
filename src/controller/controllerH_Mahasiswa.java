
package controller;

import dao.daoPengguna;
import dao.interfacePengguna;
import model.Pengguna;
import view.H_Mahasiswa;
import view.Kuis;
import view.Login;

public class controllerH_Mahasiswa {
    H_Mahasiswa frame;
    
    public controllerH_Mahasiswa(H_Mahasiswa frame) {
        this.frame = frame;
    }
    
    public void logout(){
        frame.dispose();
        new Login().setVisible(true);
    }
    
    public void mulaiKuis(Pengguna Pengguna1){
        new Kuis(Pengguna1).setVisible(true);
    }
    
    public void isi_form(Pengguna Pengguna1){
        frame.setTxtNIM(Pengguna1.getId());
        frame.setTxtNama(Pengguna1.getNama());
        frame.setTxtEmail(Pengguna1.getEmail());
    }
}
