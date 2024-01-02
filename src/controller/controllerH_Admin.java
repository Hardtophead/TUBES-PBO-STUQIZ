
package controller;

import model.Pengguna;
import dao.daoPengguna;
import dao.interfacePengguna;
import javax.swing.JOptionPane;
import view.Login;
import view.H_Admin;
import view.tampilkanUser;

public class controllerH_Admin {
    H_Admin frame;
    interfacePengguna infcPengguna;
    
    public controllerH_Admin(H_Admin frame) {
        this.frame = frame;
        infcPengguna = new daoPengguna();
    }
    
    public void tambahData(){
        Pengguna pengguna_baru = new Pengguna();
        pengguna_baru.setId(frame.getTxtId().getText());
        pengguna_baru.setNama(frame.getTxtNama().getText());
        pengguna_baru.setEmail(frame.getTxtEmail().getText());
        pengguna_baru.setPassword(frame.getTxtPassword().getText());
        pengguna_baru.setRole(frame.getTxtRole());

        infcPengguna.insert(pengguna_baru);
        JOptionPane.showMessageDialog(frame, "Berhasil menambahkan data baru");
        
    }
    
    public void logout(){
        frame.dispose();
        new Login().setVisible(true);
    }
    
    public void tplUser(){
        new tampilkanUser().setVisible(true);
    }
    
    public void kosongkan_form(){
        frame.setTxtId("");
        frame.setTxtNama("");
        frame.setTxtEmail("");
        frame.setTxtPassword("");
    }
}
