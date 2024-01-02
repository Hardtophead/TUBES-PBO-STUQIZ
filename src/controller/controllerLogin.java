/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.daoPengguna;
import dao.interfacePengguna;
import javax.swing.JOptionPane;
import model.Pengguna;

import view.Login;
import view.H_Admin;
import view.H_Dosen;
import view.H_Mahasiswa;

public class controllerLogin {
    Login frame;
    interfacePengguna infcPengguna;
    
    public controllerLogin(Login frame) {
        this.frame = frame;
        infcPengguna = new daoPengguna();
    }
    
    public void halaman_H_Admin(){
        frame.dispose();
        new H_Admin().setVisible(true);
    }
    public void halaman_H_Dosen(){
        frame.dispose();
        new H_Dosen().setVisible(true);
    }
    public void halaman_H_Mahasiswa(){
        Pengguna user = infcPengguna.userData(frame.getTxtEmail().getText(), frame.getTxtPassword().getText(), frame.getTxtRole());
        frame.dispose();
        new H_Mahasiswa(user).setVisible(true);
    }
    
    public void masuk(int rl){
        int r = infcPengguna.login(frame.getTxtEmail().getText(), frame.getTxtPassword().getText(), frame.getTxtRole());
        if (r == 1){
            JOptionPane.showMessageDialog(null, "Login Successfully");
            if(rl == 0){
                halaman_H_Admin();
            }else if(rl == 1){
                halaman_H_Dosen();
            }else if(rl == 2){
                halaman_H_Mahasiswa();
            }
        }else if (r == 0 || r == 2){
            JOptionPane.showMessageDialog(null, "Wrong Username or Password");
        }
    }
}
